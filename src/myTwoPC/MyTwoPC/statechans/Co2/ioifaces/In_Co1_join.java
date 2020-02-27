package myTwoPC.MyTwoPC.statechans.Co2.ioifaces;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;

public interface In_Co1_join<__Succ extends Succ_In_Co1_join> {

	abstract public __Succ receive(Co1 role, join op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}