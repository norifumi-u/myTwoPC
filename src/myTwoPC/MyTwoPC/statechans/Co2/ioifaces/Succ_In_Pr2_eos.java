package myTwoPC.MyTwoPC.statechans.Co2.ioifaces;

public interface Succ_In_Pr2_eos {

	default Receive_Co2_Co1_join<?> to(Receive_Co2_Co1_join<?> cast) {
		return (Receive_Co2_Co1_join<?>) this;
	}
}