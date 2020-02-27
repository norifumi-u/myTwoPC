package myTwoPC.MyTwoPC.statechans.Co1.ioifaces;

public interface Succ_In_Pr1_eos {

	default Select_Co1_Co2_join<?> to(Select_Co1_Co2_join<?> cast) {
		return (Select_Co1_Co2_join<?>) this;
	}
}