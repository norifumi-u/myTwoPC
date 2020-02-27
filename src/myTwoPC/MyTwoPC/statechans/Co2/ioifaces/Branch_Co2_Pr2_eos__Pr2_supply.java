package myTwoPC.MyTwoPC.statechans.Co2.ioifaces;

import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.statechans.Co2.*;

public interface Branch_Co2_Pr2_eos__Pr2_supply<__Succ1 extends Succ_In_Pr2_eos, __Succ2 extends Succ_In_Pr2_supply> extends Succ_In_Pr2_supply {
	public static final Branch_Co2_Pr2_eos__Pr2_supply<?, ?> cast = null;

	abstract Case_Co2_Pr2_eos__Pr2_supply<__Succ1, __Succ2> branch(Pr2 role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(Pr2 role, Handle_Co2_Pr2_eos__Pr2_supply<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(Pr2 role, Handle_Co2_Pr2_eos__Pr2_supply<Succ_In_Pr2_eos, Succ_In_Pr2_supply> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_Co2_Pr2_eos__Pr2_supply<?, ?> to(Branch_Co2_Pr2_eos__Pr2_supply<?, ?> cast) {
		return (Branch_Co2_Pr2_eos__Pr2_supply<?, ?>) this;
	}

	default MyTwoPC_Co2_1 to(MyTwoPC_Co2_1 cast) {
		return (MyTwoPC_Co2_1) this;
	}

public enum Branch_Co2_Pr2_eos__Pr2_supply_Enum implements org.scribble.runtime.session.OpEnum {
	supply, eos
}
}