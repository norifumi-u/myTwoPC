package myTwoPC.MyTwoPC.statechans.Pr2.ioifaces;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;

public interface Out_Co2_eos<__Succ extends Succ_Out_Co2_eos> {

	abstract public __Succ send(Co2 role, eos op) throws org.scribble.main.ScribRuntimeException, IOException;
}