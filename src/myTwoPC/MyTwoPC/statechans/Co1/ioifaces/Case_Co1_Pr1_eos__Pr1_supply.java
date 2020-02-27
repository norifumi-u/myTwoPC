package myTwoPC.MyTwoPC.statechans.Co1.ioifaces;

import myTwoPC.MyTwoPC.ops.*;

public interface Case_Co1_Pr1_eos__Pr1_supply<__Succ1 extends Succ_In_Pr1_eos, __Succ2 extends Succ_In_Pr1_supply> extends In_Pr1_eos<__Succ1>, In_Pr1_supply<__Succ2> {
	public static final Branch_Co1_Pr1_eos__Pr1_supply<?, ?> cast = null;

	abstract Branch_Co1_Pr1_eos__Pr1_supply.Branch_Co1_Pr1_eos__Pr1_supply_Enum getOp();

	abstract public __Succ1 receive(eos op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public __Succ2 receive(supply op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}