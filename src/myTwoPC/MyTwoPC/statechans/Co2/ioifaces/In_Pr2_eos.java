package myTwoPC.MyTwoPC.statechans.Co2.ioifaces;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;

public interface In_Pr2_eos<__Succ extends Succ_In_Pr2_eos> {

	abstract public __Succ receive(Pr2 role, eos op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}