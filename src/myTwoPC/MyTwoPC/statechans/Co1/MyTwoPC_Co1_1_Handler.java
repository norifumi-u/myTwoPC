package myTwoPC.MyTwoPC.statechans.Co1;

import myTwoPC.MyTwoPC.ops.*;
import myTwoPC.MyTwoPC.statechans.Co1.ioifaces.*;

public interface MyTwoPC_Co1_1_Handler extends Handle_Co1_Pr1_eos__Pr1_supply<MyTwoPC_Co1_2, MyTwoPC_Co1_1> {

	@Override
	abstract public void receive(MyTwoPC_Co1_1 schan, supply op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(MyTwoPC_Co1_2 schan, eos op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}