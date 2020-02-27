package myTwoPC.MyTwoPC.statechans.Co2.ioifaces;

import myTwoPC.MyTwoPC.ops.*;

public interface Handle_Co2_Pr2_eos__Pr2_supply<__Succ1 extends Succ_In_Pr2_eos, __Succ2 extends Succ_In_Pr2_supply> extends Callback_Pr2_eos<__Succ1>, Callback_Pr2_supply<__Succ2> {

	abstract public void receive(__Succ1 schan, eos op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, supply op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}