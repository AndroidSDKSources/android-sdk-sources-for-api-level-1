// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractPooledConnAdapter.java

package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package org.apache.http.impl.conn:
//			AbstractClientConnAdapter, AbstractPoolEntry

public abstract class AbstractPooledConnAdapter extends AbstractClientConnAdapter
{

	protected volatile AbstractPoolEntry poolEntry;

	protected AbstractPooledConnAdapter(ClientConnectionManager manager, AbstractPoolEntry entry)
	{
		super((ClientConnectionManager)null, (OperatedClientConnection)null);
		throw new RuntimeException("Stub!");
	}

	protected final void assertAttached()
	{
		throw new RuntimeException("Stub!");
	}

	protected void detach()
	{
		throw new RuntimeException("Stub!");
	}

	public HttpRoute getRoute()
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

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void shutdown()
		throws IOException
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
}
