// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpRouteDirector.java

package org.apache.http.conn.routing;


// Referenced classes of package org.apache.http.conn.routing:
//			RouteInfo

public interface HttpRouteDirector
{

	public static final int UNREACHABLE = -1;
	public static final int COMPLETE = 0;
	public static final int CONNECT_TARGET = 1;
	public static final int CONNECT_PROXY = 2;
	public static final int TUNNEL_TARGET = 3;
	public static final int TUNNEL_PROXY = 4;
	public static final int LAYER_PROTOCOL = 5;

	public abstract int nextStep(RouteInfo routeinfo, RouteInfo routeinfo1);
}
