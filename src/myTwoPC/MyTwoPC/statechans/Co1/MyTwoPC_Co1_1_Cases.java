package myTwoPC.MyTwoPC.statechans.Co1;

import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;
import myTwoPC.MyTwoPC.statechans.Co1.ioifaces.*;

public final class MyTwoPC_Co1_1_Cases extends org.scribble.runtime.statechans.CaseSocket<MyTwoPC, Co1> implements Case_Co1_Pr1_eos__Pr1_supply<MyTwoPC_Co1_2, MyTwoPC_Co1_1> {
	public static final MyTwoPC_Co1_1_Cases cast = null;
	public final MyTwoPC_Co1_1.Branch_Co1_Pr1_eos__Pr1_supply_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected MyTwoPC_Co1_1_Cases(org.scribble.runtime.session.SessionEndpoint<MyTwoPC, Co1> se, boolean dummy, MyTwoPC_Co1_1.Branch_Co1_Pr1_eos__Pr1_supply_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public MyTwoPC_Co1_1 receive(Pr1 role, supply op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(MyTwoPC.supply)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new MyTwoPC_Co1_1(this.se, true);
	}

	public MyTwoPC_Co1_1 receive(supply op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(MyTwoPC.Pr1, op);
	}

	public MyTwoPC_Co1_2 receive(Pr1 role, eos op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(MyTwoPC.eos)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new MyTwoPC_Co1_2(this.se, true);
	}

	public MyTwoPC_Co1_2 receive(eos op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(MyTwoPC.Pr1, op);
	}

	@Override
	public Branch_Co1_Pr1_eos__Pr1_supply.Branch_Co1_Pr1_eos__Pr1_supply_Enum getOp() {
		return this.op;
	}
}