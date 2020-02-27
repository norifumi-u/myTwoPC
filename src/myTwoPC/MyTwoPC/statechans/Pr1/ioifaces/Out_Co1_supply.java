package myTwoPC.MyTwoPC.statechans.Pr1.ioifaces;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;

public interface Out_Co1_supply<__Succ extends Succ_Out_Co1_supply> {

	abstract public __Succ send(Co1 role, supply op) throws org.scribble.main.ScribRuntimeException, IOException;
}