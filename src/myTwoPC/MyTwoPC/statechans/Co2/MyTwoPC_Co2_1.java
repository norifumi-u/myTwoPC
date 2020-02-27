package myTwoPC.MyTwoPC.statechans.Co2;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.statechans.Co2.ioifaces.*;

public final class MyTwoPC_Co2_1 extends org.scribble.runtime.statechans.BranchSocket<MyTwoPC, Co2> implements Branch_Co2_Pr2_eos__Pr2_supply<MyTwoPC_Co2_2, MyTwoPC_Co2_1> {
	public static final MyTwoPC_Co2_1 cast = null;

	protected MyTwoPC_Co2_1(org.scribble.runtime.session.SessionEndpoint<MyTwoPC, Co2> se, boolean dummy) {
		super(se);
	}

	public MyTwoPC_Co2_1(org.scribble.runtime.session.MPSTEndpoint<MyTwoPC, Co2> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public MyTwoPC_Co2_1_Cases branch(Pr2 role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyTwoPC.Pr2);
		Branch_Co2_Pr2_eos__Pr2_supply_Enum openum;
		if (m.op.equals(MyTwoPC.supply)) {
			openum = Branch_Co2_Pr2_eos__Pr2_supply_Enum.supply;
		}
		else if (m.op.equals(MyTwoPC.eos)) {
			openum = Branch_Co2_Pr2_eos__Pr2_supply_Enum.eos;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new MyTwoPC_Co2_1_Cases(this.se, true, openum, m);
	}

	public void branch(Pr2 role, MyTwoPC_Co2_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_Co2_Pr2_eos__Pr2_supply<MyTwoPC_Co2_2, MyTwoPC_Co2_1>) handler);
	}

	@Override
	public void branch(Pr2 role, Handle_Co2_Pr2_eos__Pr2_supply<MyTwoPC_Co2_2, MyTwoPC_Co2_1> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyTwoPC.Pr2);
		if (m.op.equals(MyTwoPC.supply)) {
			handler.receive(new MyTwoPC_Co2_1(this.se, true), MyTwoPC.supply);
		}
		else
		if (m.op.equals(MyTwoPC.eos)) {
			handler.receive(new MyTwoPC_Co2_2(this.se, true), MyTwoPC.eos);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(Pr2 role, Handle_Co2_Pr2_eos__Pr2_supply<Succ_In_Pr2_eos, Succ_In_Pr2_supply> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyTwoPC.Pr2);
		if (m.op.equals(MyTwoPC.supply)) {
			handler.receive(new MyTwoPC_Co2_1(this.se, true), MyTwoPC.supply);
		}
		else
		if (m.op.equals(MyTwoPC.eos)) {
			handler.receive(new MyTwoPC_Co2_2(this.se, true), MyTwoPC.eos);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}