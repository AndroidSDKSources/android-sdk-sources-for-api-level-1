// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractPoolEntry.java

package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public abstract class AbstractPoolEntry
{

	protected final ClientConnectionOperator connOperator;
	protected final OperatedClientConnection connection;
	protected volatile HttpRoute route;
	protected volatile Object state;
	protected volatile RouteTracker tracker;

	protected AbstractPoolEntry(ClientConnectionOperator connOperator, HttpRoute route)
	{
		throw new RuntimeException("Stub!");
	}

	public Object getState()
	{
		throw new RuntimeException("Stub!");
	}

	public void setState(Object state)
	{
		throw new RuntimeException("Stub!");
	}

	public void open(HttpRoute route, HttpContext context, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void tunnelTarget(boolean secure, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void tunnelProxy(HttpHost next, boolean secure, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void layerProtocol(HttpContext context, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void shutdownEntry()
	{
		throw new RuntimeException("Stub!");
	}
}
