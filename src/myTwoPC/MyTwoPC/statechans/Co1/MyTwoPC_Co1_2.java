package myTwoPC.MyTwoPC.statechans.Co1;

import java.io.IOException;
import myTwoPC.MyTwoPC.*;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;
import myTwoPC.MyTwoPC.statechans.Co1.ioifaces.*;

public final class MyTwoPC_Co1_2 extends org.scribble.runtime.statechans.OutputSocket<MyTwoPC, Co1> implements Select_Co1_Co2_join<EndSocket> {
	public static final MyTwoPC_Co1_2 cast = null;

	protected MyTwoPC_Co1_2(org.scribble.runtime.session.SessionEndpoint<MyTwoPC, Co1> se, boolean dummy) {
		super(se);
	}

	public myTwoPC.MyTwoPC.statechans.Co1.EndSocket send(Co2 role, join op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, MyTwoPC.join);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}