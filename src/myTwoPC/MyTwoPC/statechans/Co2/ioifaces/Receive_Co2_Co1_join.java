package myTwoPC.MyTwoPC.statechans.Co2.ioifaces;

import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;
import myTwoPC.MyTwoPC.statechans.Co2.*;

public interface Receive_Co2_Co1_join<__Succ1 extends Succ_In_Co1_join> extends In_Co1_join<__Succ1>, Succ_In_Pr2_eos {
	public static final Receive_Co2_Co1_join<?> cast = null;

	abstract public myTwoPC.MyTwoPC.statechans.Co2.EndSocket async(Co1 role, join op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_Co2_Co1_join<?> to(Receive_Co2_Co1_join<?> cast) {
		return (Receive_Co2_Co1_join<?>) this;
	}

	default MyTwoPC_Co2_2 to(MyTwoPC_Co2_2 cast) {
		return (MyTwoPC_Co2_2) this;
	}
}