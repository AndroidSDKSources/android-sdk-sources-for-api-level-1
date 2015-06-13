// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConnRouteParams.java

package org.apache.http.conn.params;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.conn.params:
//			ConnRoutePNames

public class ConnRouteParams
	implements ConnRoutePNames
{

	public static final HttpHost NO_HOST = null;
	public static final HttpRoute NO_ROUTE = null;

	ConnRouteParams()
	{
		throw new RuntimeException("Stub!");
	}

	public static HttpHost getDefaultProxy(HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setDefaultProxy(HttpParams params, HttpHost proxy)
	{
		throw new RuntimeException("Stub!");
	}

	public static HttpRoute getForcedRoute(HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setForcedRoute(HttpParams params, HttpRoute route)
	{
		throw new RuntimeException("Stub!");
	}

	public static InetAddress getLocalAddress(HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setLocalAddress(HttpParams params, InetAddress local)
	{
		throw new RuntimeException("Stub!");
	}

}
