package myTwoPC.MyTwoPC.statechans.Co1.ioifaces;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;

public interface Callback_Pr1_eos<__Succ extends Succ_In_Pr1_eos> {

	abstract public void receive(__Succ schan, eos op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}