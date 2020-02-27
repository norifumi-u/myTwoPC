package myTwoPC;

import static myTwoPC.MyTwoPC.MyTwoPC.*;

import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.ScribServerSocket;
import org.scribble.runtime.net.SocketChannelEndpoint;
import org.scribble.runtime.net.SocketChannelServer;
import org.scribble.runtime.session.MPSTEndpoint;

import myTwoPC.MyTwoPC.MyTwoPC;
import myTwoPC.MyTwoPC.roles.Co2;
import myTwoPC.MyTwoPC.statechans.Co2.MyTwoPC_Co2_1;
import myTwoPC.MyTwoPC.statechans.Co2.MyTwoPC_Co2_1_Cases;
import myTwoPC.MyTwoPC.statechans.Co2.MyTwoPC_Co2_2;

public class Consumer2 {

	public static void main(String[] args) throws Exception {
		try (ScribServerSocket ss = new SocketChannelServer(6666)) {
			run(ss);
		}
	}

	public static void run(ScribServerSocket ss) throws Exception {
		MyTwoPC twopc = new MyTwoPC();
		try (MPSTEndpoint<MyTwoPC, Co2> co = new MPSTEndpoint<>(twopc, Co2, new ObjectStreamFormatter())) {
			co.request(Pr2, SocketChannelEndpoint::new, "localhost", 7777);
			co.accept(ss, Co1);

			MyTwoPC_Co2_1 c1 = new MyTwoPC_Co2_1(co);

			exit:
			while(true) {
				MyTwoPC_Co2_1_Cases cases = c1.branch(Pr2);
				switch(cases.op) {
				case supply:
					c1 = cases.receive(Pr2, supply);
					System.out.println("Co2: supply received");;
					break;
				case eos:
					MyTwoPC_Co2_2 c2 = cases.receive(Pr2, eos);
					System.out.println("Co2: eos received");
					c2.receive(Co1, join);
					System.out.println("Co2: join received");
					break exit;
				}
			}
		}
	}
}
