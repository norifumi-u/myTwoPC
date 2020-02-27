package myTwoPC.MyTwoPC.statechans.Co2.ioifaces;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;

public interface Callback_Pr2_supply<__Succ extends Succ_In_Pr2_supply> {

	abstract public void receive(__Succ schan, supply op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}