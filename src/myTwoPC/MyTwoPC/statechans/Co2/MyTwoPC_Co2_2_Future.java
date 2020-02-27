package myTwoPC.MyTwoPC.statechans.Co2;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class MyTwoPC_Co2_2_Future extends org.scribble.runtime.util.ScribFuture {

	protected MyTwoPC_Co2_2_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public MyTwoPC_Co2_2_Future sync() throws IOException {
		super.get();
		return this;
	}
}