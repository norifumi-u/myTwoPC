package myTwoPC;

import static myTwoPC.MyTwoPC.MyTwoPC.*;

import java.io.IOException;

import org.scribble.main.ScribRuntimeException;
import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.ScribServerSocket;
import org.scribble.runtime.net.SocketChannelServer;
import org.scribble.runtime.session.MPSTEndpoint;

import myTwoPC.MyTwoPC.MyTwoPC;
import myTwoPC.MyTwoPC.roles.Pr1;
import myTwoPC.MyTwoPC.statechans.Pr1.MyTwoPC_Pr1_1;

public class Producer1 {

	public static void main(String[] args) throws Exception {
		try (ScribServerSocket ss = new SocketChannelServer(8888)) {
			run(ss);
		}
	}

	public static void run(ScribServerSocket ss) throws Exception {
		int n = 0;

		MyTwoPC twopc = new MyTwoPC();
		try (MPSTEndpoint<MyTwoPC, Pr1> p1 = new MPSTEndpoint<>(twopc, Pr1, new ObjectStreamFormatter())) {
			p1.accept(ss, Co1);

			MyTwoPC_Pr1_1 p = new MyTwoPC_Pr1_1(p1);
			while(n < 5) {
				p = p.send(Co1, supply);
				n++;
			}
			p.send(Co1, eos);
		} catch (ScribRuntimeException | IOException e) {
			e.printStackTrace();
		}
	}
}
