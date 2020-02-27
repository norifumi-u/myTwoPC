package myTwoPC.MyTwoPC.statechans.Co2;

import myTwoPC.MyTwoPC.ops.*;
import myTwoPC.MyTwoPC.statechans.Co2.ioifaces.*;

public interface MyTwoPC_Co2_1_Handler extends Handle_Co2_Pr2_eos__Pr2_supply<MyTwoPC_Co2_2, MyTwoPC_Co2_1> {

	@Override
	abstract public void receive(MyTwoPC_Co2_1 schan, supply op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(MyTwoPC_Co2_2 schan, eos op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}