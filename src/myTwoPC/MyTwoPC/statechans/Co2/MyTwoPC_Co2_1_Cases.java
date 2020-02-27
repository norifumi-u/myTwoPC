package myTwoPC.MyTwoPC.statechans.Co2;

import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;
import myTwoPC.MyTwoPC.statechans.Co2.ioifaces.*;

public final class MyTwoPC_Co2_1_Cases extends org.scribble.runtime.statechans.CaseSocket<MyTwoPC, Co2> implements Case_Co2_Pr2_eos__Pr2_supply<MyTwoPC_Co2_2, MyTwoPC_Co2_1> {
	public static final MyTwoPC_Co2_1_Cases cast = null;
	public final MyTwoPC_Co2_1.Branch_Co2_Pr2_eos__Pr2_supply_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected MyTwoPC_Co2_1_Cases(org.scribble.runtime.session.SessionEndpoint<MyTwoPC, Co2> se, boolean dummy, MyTwoPC_Co2_1.Branch_Co2_Pr2_eos__Pr2_supply_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public MyTwoPC_Co2_1 receive(Pr2 role, supply op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(MyTwoPC.supply)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new MyTwoPC_Co2_1(this.se, true);
	}

	public MyTwoPC_Co2_1 receive(supply op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(MyTwoPC.Pr2, op);
	}

	public MyTwoPC_Co2_2 receive(Pr2 role, eos op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(MyTwoPC.eos)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new MyTwoPC_Co2_2(this.se, true);
	}

	public MyTwoPC_Co2_2 receive(eos op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(MyTwoPC.Pr2, op);
	}

	@Override
	public Branch_Co2_Pr2_eos__Pr2_supply.Branch_Co2_Pr2_eos__Pr2_supply_Enum getOp() {
		return this.op;
	}
}