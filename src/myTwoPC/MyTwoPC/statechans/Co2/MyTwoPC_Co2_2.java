package myTwoPC.MyTwoPC.statechans.Co2;

import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;
import myTwoPC.MyTwoPC.statechans.Co2.ioifaces.*;

public final class MyTwoPC_Co2_2 extends org.scribble.runtime.statechans.ReceiveSocket<MyTwoPC, Co2> implements Receive_Co2_Co1_join<EndSocket> {
	public static final MyTwoPC_Co2_2 cast = null;

	protected MyTwoPC_Co2_2(org.scribble.runtime.session.SessionEndpoint<MyTwoPC, Co2> se, boolean dummy) {
		super(se);
	}

	public myTwoPC.MyTwoPC.statechans.Co2.EndSocket receive(Co1 role, join op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.readScribMessage(MyTwoPC.Co1);
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public myTwoPC.MyTwoPC.statechans.Co2.EndSocket async(Co1 role, join op, org.scribble.runtime.util.Buf<MyTwoPC_Co2_2_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new MyTwoPC_Co2_2_Future(super.getFuture(MyTwoPC.Co1));
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(MyTwoPC.Co1);
	}

	@SuppressWarnings("unchecked")
	public myTwoPC.MyTwoPC.statechans.Co2.EndSocket async(Co1 role, join op) throws org.scribble.main.ScribRuntimeException {
		return async(MyTwoPC.Co1, op, (org.scribble.runtime.util.Buf<MyTwoPC_Co2_2_Future>) this.se.gc);
	}
}