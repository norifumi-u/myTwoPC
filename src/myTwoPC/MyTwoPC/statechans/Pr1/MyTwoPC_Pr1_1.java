package myTwoPC.MyTwoPC.statechans.Pr1;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;
import myTwoPC.MyTwoPC.statechans.Pr1.ioifaces.*;

public final class MyTwoPC_Pr1_1 extends org.scribble.runtime.statechans.OutputSocket<MyTwoPC, Pr1> implements Select_Pr1_Co1_eos__Co1_supply<EndSocket, MyTwoPC_Pr1_1> {
	public static final MyTwoPC_Pr1_1 cast = null;

	protected MyTwoPC_Pr1_1(org.scribble.runtime.session.SessionEndpoint<MyTwoPC, Pr1> se, boolean dummy) {
		super(se);
	}

	public MyTwoPC_Pr1_1(org.scribble.runtime.session.MPSTEndpoint<MyTwoPC, Pr1> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public MyTwoPC_Pr1_1 send(Co1 role, supply op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyTwoPC.supply);

		return new MyTwoPC_Pr1_1(this.se, true);
	}

	public myTwoPC.MyTwoPC.statechans.Pr1.EndSocket send(Co1 role, eos op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyTwoPC.eos);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}