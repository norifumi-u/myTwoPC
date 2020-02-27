package myTwoPC.MyTwoPC.statechans.Co2.ioifaces;

import myTwoPC.MyTwoPC.ops.*;

public interface Case_Co2_Pr2_eos__Pr2_supply<__Succ1 extends Succ_In_Pr2_eos, __Succ2 extends Succ_In_Pr2_supply> extends In_Pr2_eos<__Succ1>, In_Pr2_supply<__Succ2> {
	public static final Branch_Co2_Pr2_eos__Pr2_supply<?, ?> cast = null;

	abstract Branch_Co2_Pr2_eos__Pr2_supply.Branch_Co2_Pr2_eos__Pr2_supply_Enum getOp();

	abstract public __Succ1 receive(eos op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public __Succ2 receive(supply op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}