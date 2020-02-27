package myTwoPC.MyTwoPC.statechans.Co2;

import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.statechans.Co2.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<MyTwoPC, Co2> implements Succ_In_Co1_join {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<MyTwoPC, Co2> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}