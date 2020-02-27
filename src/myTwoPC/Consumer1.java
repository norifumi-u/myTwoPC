package myTwoPC;

import static myTwoPC.MyTwoPC.MyTwoPC.*;

import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.SocketChannelEndpoint;
import org.scribble.runtime.session.MPSTEndpoint;

import myTwoPC.MyTwoPC.MyTwoPC;
import myTwoPC.MyTwoPC.roles.Co1;
import myTwoPC.MyTwoPC.statechans.Co1.MyTwoPC_Co1_1;
import myTwoPC.MyTwoPC.statechans.Co1.MyTwoPC_Co1_1_Cases;
import myTwoPC.MyTwoPC.statechans.Co1.MyTwoPC_Co1_2;

public class Consumer1 {
	public static void main(String[] args) throws Exception {
		run();
	}

	public static void run() throws Exception {
		MyTwoPC twopc = new MyTwoPC();
		try (MPSTEndpoint<MyTwoPC, Co1> co = new MPSTEndpoint<>(twopc, Co1, new ObjectStreamFormatter())) {
			co.request(Pr1, SocketChannelEndpoint::new, "localhost", 8888);
			co.request(Co2, SocketChannelEndpoint::new, "localhost", 6666);

			MyTwoPC_Co1_1 c1 = new MyTwoPC_Co1_1(co);

			exit:
			while(true) {
				MyTwoPC_Co1_1_Cases cases = c1.branch(Pr1);
				switch(cases.op) {
				case supply:
					c1 = cases.receive(Pr1, supply);
					System.out.println("Co1: supply received");;
					break;
				case eos:
					MyTwoPC_Co1_2 c2 = cases.receive(Pr1, eos);
					System.out.println("Co1: eos received");
					c2.send(Co2, join);
					System.out.println("Co1: join sent");
					break exit;
				}
			}
		}
	}
}
