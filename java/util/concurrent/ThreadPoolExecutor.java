// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ThreadPoolExecutor.java

package java.util.concurrent;

import java.util.List;

// Referenced classes of package java.util.concurrent:
//			AbstractExecutorService, TimeUnit, BlockingQueue, ThreadFactory, 
//			RejectedExecutionHandler

public class ThreadPoolExecutor extends AbstractExecutorService
{
	public static class DiscardOldestPolicy
		implements RejectedExecutionHandler
	{

		public void rejectedExecution(Runnable r, ThreadPoolExecutor e)
		{
			throw new RuntimeException("Stub!");
		}

		public DiscardOldestPolicy()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static class DiscardPolicy
		implements RejectedExecutionHandler
	{

		public void rejectedExecution(Runnable r, ThreadPoolExecutor e)
		{
			throw new RuntimeException("Stub!");
		}

		public DiscardPolicy()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static class AbortPolicy
		implements RejectedExecutionHandler
	{

		public void rejectedExecution(Runnable r, ThreadPoolExecutor e)
		{
			throw new RuntimeException("Stub!");
		}

		public AbortPolicy()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static class CallerRunsPolicy
		implements RejectedExecutionHandler
	{

		public void rejectedExecution(Runnable r, ThreadPoolExecutor e)
		{
			throw new RuntimeException("Stub!");
		}

		public CallerRunsPolicy()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue workQueue)
	{
		throw new RuntimeException("Stub!");
	}

	public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue workQueue, ThreadFactory threadFactory)
	{
		throw new RuntimeException("Stub!");
	}

	public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue workQueue, RejectedExecutionHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue workQueue, ThreadFactory threadFactory, 
			RejectedExecutionHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public void execute(Runnable command)
	{
		throw new RuntimeException("Stub!");
	}

	public void shutdown()
	{
		throw new RuntimeException("Stub!");
	}

	public List shutdownNow()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isShutdown()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isTerminating()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isTerminated()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean awaitTermination(long timeout, TimeUnit unit)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}

	public void setThreadFactory(ThreadFactory threadFactory)
	{
		throw new RuntimeException("Stub!");
	}

	public ThreadFactory getThreadFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public void setRejectedExecutionHandler(RejectedExecutionHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public RejectedExecutionHandler getRejectedExecutionHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public BlockingQueue getQueue()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean remove(Runnable task)
	{
		throw new RuntimeException("Stub!");
	}

	public void purge()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCorePoolSize(int corePoolSize)
	{
		throw new RuntimeException("Stub!");
	}

	public int getCorePoolSize()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean prestartCoreThread()
	{
		throw new RuntimeException("Stub!");
	}

	public int prestartAllCoreThreads()
	{
		throw new RuntimeException("Stub!");
	}

	public void setMaximumPoolSize(int maximumPoolSize)
	{
		throw new RuntimeException("Stub!");
	}

	public int getMaximumPoolSize()
	{
		throw new RuntimeException("Stub!");
	}

	public void setKeepAliveTime(long time, TimeUnit unit)
	{
		throw new RuntimeException("Stub!");
	}

	public long getKeepAliveTime(TimeUnit unit)
	{
		throw new RuntimeException("Stub!");
	}

	public int getPoolSize()
	{
		throw new RuntimeException("Stub!");
	}

	public int getActiveCount()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLargestPoolSize()
	{
		throw new RuntimeException("Stub!");
	}

	public long getTaskCount()
	{
		throw new RuntimeException("Stub!");
	}

	public long getCompletedTaskCount()
	{
		throw new RuntimeException("Stub!");
	}

	protected void beforeExecute(Thread t, Runnable r)
	{
		throw new RuntimeException("Stub!");
	}

	protected void afterExecute(Runnable r, Throwable t)
	{
		throw new RuntimeException("Stub!");
	}

	protected void terminated()
	{
		throw new RuntimeException("Stub!");
	}
}
