package myTwoPC.MyTwoPC;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.scribble.core.type.name.Role;
import myTwoPC.MyTwoPC.roles.*;
import myTwoPC.MyTwoPC.ops.*;

public final class MyTwoPC extends org.scribble.runtime.session.Session {
	public static final List<String> IMPATH = new LinkedList<>();
	public static final String SOURCE = "getSource";
	public static final org.scribble.core.type.name.GProtoName PROTO = org.scribble.core.type.session.STypeFactory.parseGlobalProtocolName("myTwoPC.MyTwoPC");
	public static final Co2 Co2 = myTwoPC.MyTwoPC.roles.Co2.Co2;
	public static final Pr1 Pr1 = myTwoPC.MyTwoPC.roles.Pr1.Pr1;
	public static final Pr2 Pr2 = myTwoPC.MyTwoPC.roles.Pr2.Pr2;
	public static final Co1 Co1 = myTwoPC.MyTwoPC.roles.Co1.Co1;
	public static final eos eos = myTwoPC.MyTwoPC.ops.eos.eos;
	public static final join join = myTwoPC.MyTwoPC.ops.join.join;
	public static final supply supply = myTwoPC.MyTwoPC.ops.supply.supply;
	public static final List<Role> ROLES = Collections.unmodifiableList(Arrays.asList(new Role[] {Co2, Pr1, Pr2, Co1}));

	public MyTwoPC() {
		super(MyTwoPC.IMPATH, MyTwoPC.SOURCE, MyTwoPC.PROTO);
	}

	@Override
	public List<Role> getRoles() {
		return MyTwoPC.ROLES;
	}
}