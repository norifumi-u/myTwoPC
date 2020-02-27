package myTwoPC.MyTwoPC.statechans.Pr2.ioifaces;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;

public interface Out_Co2_supply<__Succ extends Succ_Out_Co2_supply> {

	abstract public __Succ send(Co2 role, supply op) throws org.scribble.main.ScribRuntimeException, IOException;
}