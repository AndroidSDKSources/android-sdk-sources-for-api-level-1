// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractConnPool.java

package org.apache.http.impl.conn.tsccm;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.IdleConnectionHandler;

// Referenced classes of package org.apache.http.impl.conn.tsccm:
//			RefQueueHandler, BasicPoolEntry, PoolEntryRequest

public abstract class AbstractConnPool
	implements RefQueueHandler
{

	protected final Lock poolLock;
	protected Set issuedConnections;
	protected IdleConnectionHandler idleConnHandler;
	protected int numConnections;
	protected ReferenceQueue refQueue;
	protected volatile boolean isShutDown;

	protected AbstractConnPool()
	{
		throw new RuntimeException("Stub!");
	}

	public void enableConnectionGC()
		throws IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public final BasicPoolEntry getEntry(HttpRoute route, Object state, long timeout, TimeUnit tunit)
		throws ConnectionPoolTimeoutException, InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract PoolEntryRequest requestPoolEntry(HttpRoute httproute, Object obj);

	public abstract void freeEntry(BasicPoolEntry basicpoolentry, boolean flag, long l, TimeUnit timeunit);

	public void handleReference(Reference ref)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void handleLostEntry(HttpRoute httproute);

	public void closeIdleConnections(long idletime, TimeUnit tunit)
	{
		throw new RuntimeException("Stub!");
	}

	public void closeExpiredConnections()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void deleteClosedConnections();

	public void shutdown()
	{
		throw new RuntimeException("Stub!");
	}

	protected void closeConnection(OperatedClientConnection conn)
	{
		throw new RuntimeException("Stub!");
	}
}
