package myTwoPC.MyTwoPC.statechans.Pr2.ioifaces;

import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.statechans.Pr2.*;

public interface Select_Pr2_Co2_eos__Co2_supply<__Succ1 extends Succ_Out_Co2_eos, __Succ2 extends Succ_Out_Co2_supply> extends Out_Co2_eos<__Succ1>, Out_Co2_supply<__Succ2>, Succ_Out_Co2_supply {
	public static final Select_Pr2_Co2_eos__Co2_supply<?, ?> cast = null;

	@Override
	default Select_Pr2_Co2_eos__Co2_supply<?, ?> to(Select_Pr2_Co2_eos__Co2_supply<?, ?> cast) {
		return (Select_Pr2_Co2_eos__Co2_supply<?, ?>) this;
	}

	default MyTwoPC_Pr2_1 to(MyTwoPC_Pr2_1 cast) {
		return (MyTwoPC_Pr2_1) this;
	}
}