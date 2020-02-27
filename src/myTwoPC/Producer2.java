package myTwoPC;

import static myTwoPC.MyTwoPC.MyTwoPC.*;

import java.io.IOException;

import org.scribble.main.ScribRuntimeException;
import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.ScribServerSocket;
import org.scribble.runtime.net.SocketChannelServer;
import org.scribble.runtime.session.MPSTEndpoint;

import myTwoPC.MyTwoPC.MyTwoPC;
import myTwoPC.MyTwoPC.roles.Pr2;
import myTwoPC.MyTwoPC.statechans.Pr2.MyTwoPC_Pr2_1;

public class Producer2 {

	public static void main(String[] args) throws Exception {
		try (ScribServerSocket ss = new SocketChannelServer(7777)) {
			run(ss);
		}
	}

	public static void run(ScribServerSocket ss) throws Exception {
		int n = 0;

		MyTwoPC twopc = new MyTwoPC();
		try (MPSTEndpoint<MyTwoPC, Pr2> pr = new MPSTEndpoint<>(twopc, Pr2, new ObjectStreamFormatter())) {
			pr.accept(ss, Co2);

			MyTwoPC_Pr2_1 p = new MyTwoPC_Pr2_1(pr);
			while(n < 5) {
				p = p.send(Co2, supply);
				n++;
			}
			p.send(Co2, eos);
		} catch (ScribRuntimeException | IOException e) {
			e.printStackTrace();
		}
	}
}
