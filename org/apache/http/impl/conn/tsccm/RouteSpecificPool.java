// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RouteSpecificPool.java

package org.apache.http.impl.conn.tsccm;

import java.util.LinkedList;
import java.util.Queue;
import org.apache.http.conn.routing.HttpRoute;

// Referenced classes of package org.apache.http.impl.conn.tsccm:
//			BasicPoolEntry, WaitingThread

public class RouteSpecificPool
{

	protected final HttpRoute route;
	protected final int maxEntries;
	protected final LinkedList freeEntries;
	protected final Queue waitingThreads;
	protected int numEntries;

	public RouteSpecificPool(HttpRoute route, int maxEntries)
	{
		throw new RuntimeException("Stub!");
	}

	public final HttpRoute getRoute()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getMaxEntries()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isUnused()
	{
		throw new RuntimeException("Stub!");
	}

	public int getCapacity()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getEntryCount()
	{
		throw new RuntimeException("Stub!");
	}

	public BasicPoolEntry allocEntry(Object state)
	{
		throw new RuntimeException("Stub!");
	}

	public void freeEntry(BasicPoolEntry entry)
	{
		throw new RuntimeException("Stub!");
	}

	public void createdEntry(BasicPoolEntry entry)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean deleteEntry(BasicPoolEntry entry)
	{
		throw new RuntimeException("Stub!");
	}

	public void dropEntry()
	{
		throw new RuntimeException("Stub!");
	}

	public void queueThread(WaitingThread wt)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasThread()
	{
		throw new RuntimeException("Stub!");
	}

	public WaitingThread nextThread()
	{
		throw new RuntimeException("Stub!");
	}

	public void removeThread(WaitingThread wt)
	{
		throw new RuntimeException("Stub!");
	}
}
