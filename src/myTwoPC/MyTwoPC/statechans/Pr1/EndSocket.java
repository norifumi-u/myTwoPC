package myTwoPC.MyTwoPC.statechans.Pr1;

import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.statechans.Pr1.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<MyTwoPC, Pr1> implements Succ_Out_Co1_eos {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<MyTwoPC, Pr1> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}