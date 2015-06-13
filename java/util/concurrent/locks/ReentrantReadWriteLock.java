// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ReentrantReadWriteLock.java

package java.util.concurrent.locks;

import java.io.Serializable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

// Referenced classes of package java.util.concurrent.locks:
//			ReadWriteLock, Condition, Lock

public class ReentrantReadWriteLock
	implements ReadWriteLock, Serializable
{
	public static class WriteLock
		implements Lock, Serializable
	{

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

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}

		protected WriteLock(ReentrantReadWriteLock lock)
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static class ReadLock
		implements Lock, Serializable
	{

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

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}

		protected ReadLock(ReentrantReadWriteLock lock)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public ReentrantReadWriteLock()
	{
		throw new RuntimeException("Stub!");
	}

	public ReentrantReadWriteLock(boolean fair)
	{
		throw new RuntimeException("Stub!");
	}

	public WriteLock writeLock()
	{
		throw new RuntimeException("Stub!");
	}

	public ReadLock readLock()
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

	public int getReadLockCount()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isWriteLocked()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isWriteLockedByCurrentThread()
	{
		throw new RuntimeException("Stub!");
	}

	public int getWriteHoldCount()
	{
		throw new RuntimeException("Stub!");
	}

	protected Collection getQueuedWriterThreads()
	{
		throw new RuntimeException("Stub!");
	}

	protected Collection getQueuedReaderThreads()
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

	public volatile Lock writeLock()
	{
		return writeLock();
	}

	public volatile Lock readLock()
	{
		return readLock();
	}
}
