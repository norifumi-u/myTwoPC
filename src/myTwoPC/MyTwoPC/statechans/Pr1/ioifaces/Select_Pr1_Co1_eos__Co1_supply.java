package myTwoPC.MyTwoPC.statechans.Pr1.ioifaces;

import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.statechans.Pr1.*;

public interface Select_Pr1_Co1_eos__Co1_supply<__Succ1 extends Succ_Out_Co1_eos, __Succ2 extends Succ_Out_Co1_supply> extends Out_Co1_eos<__Succ1>, Out_Co1_supply<__Succ2>, Succ_Out_Co1_supply {
	public static final Select_Pr1_Co1_eos__Co1_supply<?, ?> cast = null;

	@Override
	default Select_Pr1_Co1_eos__Co1_supply<?, ?> to(Select_Pr1_Co1_eos__Co1_supply<?, ?> cast) {
		return (Select_Pr1_Co1_eos__Co1_supply<?, ?>) this;
	}

	default MyTwoPC_Pr1_1 to(MyTwoPC_Pr1_1 cast) {
		return (MyTwoPC_Pr1_1) this;
	}
}