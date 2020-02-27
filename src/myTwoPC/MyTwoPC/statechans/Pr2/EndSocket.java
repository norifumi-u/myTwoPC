package myTwoPC.MyTwoPC.statechans.Pr2;

import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.statechans.Pr2.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<MyTwoPC, Pr2> implements Succ_Out_Co2_eos {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<MyTwoPC, Pr2> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}