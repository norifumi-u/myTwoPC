package myTwoPC.MyTwoPC.statechans.Co1.ioifaces;

import myTwoPC.MyTwoPC.ops.*;

public interface Handle_Co1_Pr1_eos__Pr1_supply<__Succ1 extends Succ_In_Pr1_eos, __Succ2 extends Succ_In_Pr1_supply> extends Callback_Pr1_eos<__Succ1>, Callback_Pr1_supply<__Succ2> {

	abstract public void receive(__Succ1 schan, eos op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, supply op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}