package myTwoPC.MyTwoPC.statechans.Co1.ioifaces;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;

public interface In_Pr1_eos<__Succ extends Succ_In_Pr1_eos> {

	abstract public __Succ receive(Pr1 role, eos op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}