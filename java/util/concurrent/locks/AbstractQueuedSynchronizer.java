// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractQueuedSynchronizer.java

package java.util.concurrent.locks;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// Referenced classes of package java.util.concurrent.locks:
//			Condition

public abstract class AbstractQueuedSynchronizer
	implements Serializable
{
	public class ConditionObject
		implements Condition, Serializable
	{

		final AbstractQueuedSynchronizer this$0;

		public final void signal()
		{
			throw new RuntimeException("Stub!");
		}

		public final void signalAll()
		{
			throw new RuntimeException("Stub!");
		}

		public final void awaitUninterruptibly()
		{
			throw new RuntimeException("Stub!");
		}

		public final void await()
			throws InterruptedException
		{
			throw new RuntimeException("Stub!");
		}

		public final long awaitNanos(long nanosTimeout)
			throws InterruptedException
		{
			throw new RuntimeException("Stub!");
		}

		public final boolean awaitUntil(Date deadline)
			throws InterruptedException
		{
			throw new RuntimeException("Stub!");
		}

		public final boolean await(long time, TimeUnit unit)
			throws InterruptedException
		{
			throw new RuntimeException("Stub!");
		}

		protected final boolean hasWaiters()
		{
			throw new RuntimeException("Stub!");
		}

		protected final int getWaitQueueLength()
		{
			throw new RuntimeException("Stub!");
		}

		protected final Collection getWaitingThreads()
		{
			throw new RuntimeException("Stub!");
		}

		public ConditionObject()
		{
			this$0 = AbstractQueuedSynchronizer.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}


	protected AbstractQueuedSynchronizer()
	{
		throw new RuntimeException("Stub!");
	}

	protected final int getState()
	{
		throw new RuntimeException("Stub!");
	}

	protected final void setState(int newState)
	{
		throw new RuntimeException("Stub!");
	}

	protected final boolean compareAndSetState(int expect, int update)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean tryAcquire(int arg)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean tryRelease(int arg)
	{
		throw new RuntimeException("Stub!");
	}

	protected int tryAcquireShared(int arg)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean tryReleaseShared(int arg)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean isHeldExclusively()
	{
		throw new RuntimeException("Stub!");
	}

	public final void acquire(int arg)
	{
		throw new RuntimeException("Stub!");
	}

	public final void acquireInterruptibly(int arg)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean tryAcquireNanos(int arg, long nanosTimeout)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean release(int arg)
	{
		throw new RuntimeException("Stub!");
	}

	public final void acquireShared(int arg)
	{
		throw new RuntimeException("Stub!");
	}

	public final void acquireSharedInterruptibly(int arg)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean tryAcquireSharedNanos(int arg, long nanosTimeout)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean releaseShared(int arg)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean hasQueuedThreads()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean hasContended()
	{
		throw new RuntimeException("Stub!");
	}

	public final Thread getFirstQueuedThread()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isQueued(Thread thread)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getQueueLength()
	{
		throw new RuntimeException("Stub!");
	}

	public final Collection getQueuedThreads()
	{
		throw new RuntimeException("Stub!");
	}

	public final Collection getExclusiveQueuedThreads()
	{
		throw new RuntimeException("Stub!");
	}

	public final Collection getSharedQueuedThreads()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean owns(ConditionObject condition)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean hasWaiters(ConditionObject condition)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getWaitQueueLength(ConditionObject condition)
	{
		throw new RuntimeException("Stub!");
	}

	public final Collection getWaitingThreads(ConditionObject condition)
	{
		throw new RuntimeException("Stub!");
	}
}
