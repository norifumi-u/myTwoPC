package myTwoPC.MyTwoPC.statechans.Co1.ioifaces;

public interface Succ_In_Pr1_supply {

	default Branch_Co1_Pr1_eos__Pr1_supply<?, ?> to(Branch_Co1_Pr1_eos__Pr1_supply<?, ?> cast) {
		return (Branch_Co1_Pr1_eos__Pr1_supply<?, ?>) this;
	}
}