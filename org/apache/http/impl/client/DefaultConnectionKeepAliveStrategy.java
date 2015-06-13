// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DefaultConnectionKeepAliveStrategy.java

package org.apache.http.impl.client;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

public class DefaultConnectionKeepAliveStrategy
	implements ConnectionKeepAliveStrategy
{

	public DefaultConnectionKeepAliveStrategy()
	{
		throw new RuntimeException("Stub!");
	}

	public long getKeepAliveDuration(HttpResponse response, HttpContext context)
	{
		throw new RuntimeException("Stub!");
	}
}
