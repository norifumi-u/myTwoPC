package myTwoPC.MyTwoPC.statechans.Co1.ioifaces;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;

public interface Out_Co2_join<__Succ extends Succ_Out_Co2_join> {

	abstract public __Succ send(Co2 role, join op) throws org.scribble.main.ScribRuntimeException, IOException;
}