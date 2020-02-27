package myTwoPC.MyTwoPC.statechans.Co2.ioifaces;

import myTwoPC.MyTwoPC.statechans.Co2.EndSocket;

public interface Succ_In_Co1_join {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}