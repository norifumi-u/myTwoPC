package myTwoPC.MyTwoPC.statechans.Co1.ioifaces;

import myTwoPC.MyTwoPC.statechans.Co1.EndSocket;

public interface Succ_Out_Co2_join {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}