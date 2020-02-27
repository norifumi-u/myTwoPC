package myTwoPC.MyTwoPC.statechans.Pr2.ioifaces;

import myTwoPC.MyTwoPC.statechans.Pr2.EndSocket;

public interface Succ_Out_Co2_eos {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}