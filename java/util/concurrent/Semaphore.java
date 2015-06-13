// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Semaphore.java

package java.util.concurrent;

import java.io.Serializable;
import java.util.Collection;

// Referenced classes of package java.util.concurrent:
//			TimeUnit

public class Semaphore
	implements Serializable
{

	public Semaphore(int permits)
	{
		throw new RuntimeException("Stub!");
	}

	public Semaphore(int permits, boolean fair)
	{
		throw new RuntimeException("Stub!");
	}

	public void acquire()
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public void acquireUninterruptibly()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean tryAcquire()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean tryAcquire(long timeout, TimeUnit unit)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public void release()
	{
		throw new RuntimeException("Stub!");
	}

	public void acquire(int permits)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public void acquireUninterruptibly(int permits)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean tryAcquire(int permits)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean tryAcquire(int permits, long timeout, TimeUnit unit)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public void release(int permits)
	{
		throw new RuntimeException("Stub!");
	}

	public int availablePermits()
	{
		throw new RuntimeException("Stub!");
	}

	public int drainPermits()
	{
		throw new RuntimeException("Stub!");
	}

	protected void reducePermits(int reduction)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isFair()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean hasQueuedThreads()
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

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
