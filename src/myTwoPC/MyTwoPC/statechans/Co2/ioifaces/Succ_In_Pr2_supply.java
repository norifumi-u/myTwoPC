package myTwoPC.MyTwoPC.statechans.Co2.ioifaces;

public interface Succ_In_Pr2_supply {

	default Branch_Co2_Pr2_eos__Pr2_supply<?, ?> to(Branch_Co2_Pr2_eos__Pr2_supply<?, ?> cast) {
		return (Branch_Co2_Pr2_eos__Pr2_supply<?, ?>) this;
	}
}