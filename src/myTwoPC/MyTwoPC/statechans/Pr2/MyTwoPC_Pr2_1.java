package myTwoPC.MyTwoPC.statechans.Pr2;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;
import myTwoPC.MyTwoPC.statechans.Pr2.ioifaces.*;

public final class MyTwoPC_Pr2_1 extends org.scribble.runtime.statechans.OutputSocket<MyTwoPC, Pr2> implements Select_Pr2_Co2_eos__Co2_supply<EndSocket, MyTwoPC_Pr2_1> {
	public static final MyTwoPC_Pr2_1 cast = null;

	protected MyTwoPC_Pr2_1(org.scribble.runtime.session.SessionEndpoint<MyTwoPC, Pr2> se, boolean dummy) {
		super(se);
	}

	public MyTwoPC_Pr2_1(org.scribble.runtime.session.MPSTEndpoint<MyTwoPC, Pr2> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public MyTwoPC_Pr2_1 send(Co2 role, supply op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyTwoPC.supply);

		return new MyTwoPC_Pr2_1(this.se, true);
	}

	public myTwoPC.MyTwoPC.statechans.Pr2.EndSocket send(Co2 role, eos op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyTwoPC.eos);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}