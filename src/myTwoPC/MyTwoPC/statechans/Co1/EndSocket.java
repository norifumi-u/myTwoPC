package myTwoPC.MyTwoPC.statechans.Co1;

import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.statechans.Co1.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<MyTwoPC, Co1> implements Succ_Out_Co2_join {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<MyTwoPC, Co1> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}