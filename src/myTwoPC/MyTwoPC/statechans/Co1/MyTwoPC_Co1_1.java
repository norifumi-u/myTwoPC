package myTwoPC.MyTwoPC.statechans.Co1;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.statechans.Co1.ioifaces.*;

public final class MyTwoPC_Co1_1 extends org.scribble.runtime.statechans.BranchSocket<MyTwoPC, Co1> implements Branch_Co1_Pr1_eos__Pr1_supply<MyTwoPC_Co1_2, MyTwoPC_Co1_1> {
	public static final MyTwoPC_Co1_1 cast = null;

	protected MyTwoPC_Co1_1(org.scribble.runtime.session.SessionEndpoint<MyTwoPC, Co1> se, boolean dummy) {
		super(se);
	}

	public MyTwoPC_Co1_1(org.scribble.runtime.session.MPSTEndpoint<MyTwoPC, Co1> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public MyTwoPC_Co1_1_Cases branch(Pr1 role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyTwoPC.Pr1);
		Branch_Co1_Pr1_eos__Pr1_supply_Enum openum;
		if (m.op.equals(MyTwoPC.supply)) {
			openum = Branch_Co1_Pr1_eos__Pr1_supply_Enum.supply;
		}
		else if (m.op.equals(MyTwoPC.eos)) {
			openum = Branch_Co1_Pr1_eos__Pr1_supply_Enum.eos;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new MyTwoPC_Co1_1_Cases(this.se, true, openum, m);
	}

	public void branch(Pr1 role, MyTwoPC_Co1_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_Co1_Pr1_eos__Pr1_supply<MyTwoPC_Co1_2, MyTwoPC_Co1_1>) handler);
	}

	@Override
	public void branch(Pr1 role, Handle_Co1_Pr1_eos__Pr1_supply<MyTwoPC_Co1_2, MyTwoPC_Co1_1> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyTwoPC.Pr1);
		if (m.op.equals(MyTwoPC.supply)) {
			handler.receive(new MyTwoPC_Co1_1(this.se, true), MyTwoPC.supply);
		}
		else
		if (m.op.equals(MyTwoPC.eos)) {
			handler.receive(new MyTwoPC_Co1_2(this.se, true), MyTwoPC.eos);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(Pr1 role, Handle_Co1_Pr1_eos__Pr1_supply<Succ_In_Pr1_eos, Succ_In_Pr1_supply> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(MyTwoPC.Pr1);
		if (m.op.equals(MyTwoPC.supply)) {
			handler.receive(new MyTwoPC_Co1_1(this.se, true), MyTwoPC.supply);
		}
		else
		if (m.op.equals(MyTwoPC.eos)) {
			handler.receive(new MyTwoPC_Co1_2(this.se, true), MyTwoPC.eos);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}