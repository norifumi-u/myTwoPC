package myTwoPC.MyTwoPC.statechans.Co1.ioifaces;

import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.statechans.Co1.*;

public interface Branch_Co1_Pr1_eos__Pr1_supply<__Succ1 extends Succ_In_Pr1_eos, __Succ2 extends Succ_In_Pr1_supply> extends Succ_In_Pr1_supply {
	public static final Branch_Co1_Pr1_eos__Pr1_supply<?, ?> cast = null;

	abstract Case_Co1_Pr1_eos__Pr1_supply<__Succ1, __Succ2> branch(Pr1 role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(Pr1 role, Handle_Co1_Pr1_eos__Pr1_supply<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(Pr1 role, Handle_Co1_Pr1_eos__Pr1_supply<Succ_In_Pr1_eos, Succ_In_Pr1_supply> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_Co1_Pr1_eos__Pr1_supply<?, ?> to(Branch_Co1_Pr1_eos__Pr1_supply<?, ?> cast) {
		return (Branch_Co1_Pr1_eos__Pr1_supply<?, ?>) this;
	}

	default MyTwoPC_Co1_1 to(MyTwoPC_Co1_1 cast) {
		return (MyTwoPC_Co1_1) this;
	}

public enum Branch_Co1_Pr1_eos__Pr1_supply_Enum implements org.scribble.runtime.session.OpEnum {
	supply, eos
}
}