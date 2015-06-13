// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConnManagerParams.java

package org.apache.http.conn.params;

import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.conn.params:
//			ConnManagerPNames, ConnPerRoute

public final class ConnManagerParams
	implements ConnManagerPNames
{

	public static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 20;

	public ConnManagerParams()
	{
		throw new RuntimeException("Stub!");
	}

	public static long getTimeout(HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setTimeout(HttpParams params, long timeout)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setMaxConnectionsPerRoute(HttpParams params, ConnPerRoute connPerRoute)
	{
		throw new RuntimeException("Stub!");
	}

	public static ConnPerRoute getMaxConnectionsPerRoute(HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setMaxTotalConnections(HttpParams params, int maxTotalConnections)
	{
		throw new RuntimeException("Stub!");
	}

	public static int getMaxTotalConnections(HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}
}
