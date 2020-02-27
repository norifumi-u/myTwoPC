package myTwoPC.MyTwoPC.statechans.Pr1.ioifaces;

import myTwoPC.MyTwoPC.statechans.Pr1.EndSocket;

public interface Succ_Out_Co1_eos {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}