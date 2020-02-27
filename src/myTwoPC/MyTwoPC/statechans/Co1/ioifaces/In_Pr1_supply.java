package myTwoPC.MyTwoPC.statechans.Co1.ioifaces;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;

public interface In_Pr1_supply<__Succ extends Succ_In_Pr1_supply> {

	abstract public __Succ receive(Pr1 role, supply op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}