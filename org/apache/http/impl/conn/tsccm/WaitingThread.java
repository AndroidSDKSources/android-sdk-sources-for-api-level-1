// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WaitingThread.java

package org.apache.http.impl.conn.tsccm;

import java.util.Date;
import java.util.concurrent.locks.Condition;

// Referenced classes of package org.apache.http.impl.conn.tsccm:
//			RouteSpecificPool

public class WaitingThread
{

	public WaitingThread(Condition cond, RouteSpecificPool pool)
	{
		throw new RuntimeException("Stub!");
	}

	public final Condition getCondition()
	{
		throw new RuntimeException("Stub!");
	}

	public final RouteSpecificPool getPool()
	{
		throw new RuntimeException("Stub!");
	}

	public final Thread getThread()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean await(Date deadline)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public void wakeup()
	{
		throw new RuntimeException("Stub!");
	}

	public void interrupt()
	{
		throw new RuntimeException("Stub!");
	}
}
