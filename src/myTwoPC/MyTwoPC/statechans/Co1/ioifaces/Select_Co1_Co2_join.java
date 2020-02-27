package myTwoPC.MyTwoPC.statechans.Co1.ioifaces;

import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.statechans.Co1.*;

public interface Select_Co1_Co2_join<__Succ1 extends Succ_Out_Co2_join> extends Out_Co2_join<__Succ1>, Succ_In_Pr1_eos {
	public static final Select_Co1_Co2_join<?> cast = null;

	@Override
	default Select_Co1_Co2_join<?> to(Select_Co1_Co2_join<?> cast) {
		return (Select_Co1_Co2_join<?>) this;
	}

	default MyTwoPC_Co1_2 to(MyTwoPC_Co1_2 cast) {
		return (MyTwoPC_Co1_2) this;
	}
}