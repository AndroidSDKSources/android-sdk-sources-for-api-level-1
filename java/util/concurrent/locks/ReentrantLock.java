// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ReentrantLock.java

package java.util.concurrent.locks;

import java.io.Serializable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

// Referenced classes of package java.util.concurrent.locks:
//			Lock, Condition

public class ReentrantLock
	implements Lock, Serializable
{

	public ReentrantLock()
	{
		throw new RuntimeException("Stub!");
	}

	public ReentrantLock(boolean fair)
	{
		throw new RuntimeException("Stub!");
	}

	public void lock()
	{
		throw new RuntimeException("Stub!");
	}

	public void lockInterruptibly()
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean tryLock()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean tryLock(long timeout, TimeUnit unit)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public void unlock()
	{
		throw new RuntimeException("Stub!");
	}

	public Condition newCondition()
	{
		throw new RuntimeException("Stub!");
	}

	public int getHoldCount()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isHeldByCurrentThread()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isLocked()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isFair()
	{
		throw new RuntimeException("Stub!");
	}

	protected Thread getOwner()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean hasQueuedThreads()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean hasQueuedThread(Thread thread)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getQueueLength()
	{
		throw new RuntimeException("Stub!");
	}

	protected Collection getQueuedThreads()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasWaiters(Condition condition)
	{
		throw new RuntimeException("Stub!");
	}

	public int getWaitQueueLength(Condition condition)
	{
		throw new RuntimeException("Stub!");
	}

	protected Collection getWaitingThreads(Condition condition)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
