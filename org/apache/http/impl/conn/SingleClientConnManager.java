// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SingleClientConnManager.java

package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.*;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.impl.conn:
//			AbstractPooledConnAdapter, AbstractPoolEntry

public class SingleClientConnManager
	implements ClientConnectionManager
{
	protected class ConnAdapter extends AbstractPooledConnAdapter
	{

		final SingleClientConnManager this$0;

		protected ConnAdapter(PoolEntry entry, HttpRoute route)
		{
			this$0 = SingleClientConnManager.this;
			super((ClientConnectionManager)null, (AbstractPoolEntry)null);
			throw new RuntimeException("Stub!");
		}
	}

	protected class PoolEntry extends AbstractPoolEntry
	{

		final SingleClientConnManager this$0;

		protected void close()
			throws IOException
		{
			throw new RuntimeException("Stub!");
		}

		protected void shutdown()
			throws IOException
		{
			throw new RuntimeException("Stub!");
		}

		protected PoolEntry()
		{
			this$0 = SingleClientConnManager.this;
			super((ClientConnectionOperator)null, (HttpRoute)null);
			throw new RuntimeException("Stub!");
		}
	}


	public static final String MISUSE_MESSAGE = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
	protected SchemeRegistry schemeRegistry;
	protected ClientConnectionOperator connOperator;
	protected PoolEntry uniquePoolEntry;
	protected ConnAdapter managedConn;
	protected long lastReleaseTime;
	protected long connectionExpiresTime;
	protected boolean alwaysShutDown;
	protected volatile boolean isShutDown;

	public SingleClientConnManager(HttpParams params, SchemeRegistry schreg)
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}

	public SchemeRegistry getSchemeRegistry()
	{
		throw new RuntimeException("Stub!");
	}

	protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schreg)
	{
		throw new RuntimeException("Stub!");
	}

	protected final void assertStillUp()
		throws IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public final ClientConnectionRequest requestConnection(HttpRoute route, Object state)
	{
		throw new RuntimeException("Stub!");
	}

	public ManagedClientConnection getConnection(HttpRoute route, Object state)
	{
		throw new RuntimeException("Stub!");
	}

	public void releaseConnection(ManagedClientConnection conn, long validDuration, TimeUnit timeUnit)
	{
		throw new RuntimeException("Stub!");
	}

	public void closeExpiredConnections()
	{
		throw new RuntimeException("Stub!");
	}

	public void closeIdleConnections(long idletime, TimeUnit tunit)
	{
		throw new RuntimeException("Stub!");
	}

	public void shutdown()
	{
		throw new RuntimeException("Stub!");
	}

	protected void revokeConnection()
	{
		throw new RuntimeException("Stub!");
	}
}
