// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ScheduledThreadPoolExecutor.java

package java.util.concurrent;

import java.util.List;

// Referenced classes of package java.util.concurrent:
//			ThreadPoolExecutor, TimeUnit, BlockingQueue, ThreadFactory, 
//			RejectedExecutionHandler, ScheduledExecutorService, ScheduledFuture, Callable, 
//			Future

public class ScheduledThreadPoolExecutor extends ThreadPoolExecutor
	implements ScheduledExecutorService
{

	public ScheduledThreadPoolExecutor(int corePoolSize)
	{
		super(0, 0, 0L, (TimeUnit)null, (BlockingQueue)null, (ThreadFactory)null, (RejectedExecutionHandler)null);
		throw new RuntimeException("Stub!");
	}

	public ScheduledThreadPoolExecutor(int corePoolSize, ThreadFactory threadFactory)
	{
		super(0, 0, 0L, (TimeUnit)null, (BlockingQueue)null, (ThreadFactory)null, (RejectedExecutionHandler)null);
		throw new RuntimeException("Stub!");
	}

	public ScheduledThreadPoolExecutor(int corePoolSize, RejectedExecutionHandler handler)
	{
		super(0, 0, 0L, (TimeUnit)null, (BlockingQueue)null, (ThreadFactory)null, (RejectedExecutionHandler)null);
		throw new RuntimeException("Stub!");
	}

	public ScheduledThreadPoolExecutor(int corePoolSize, ThreadFactory threadFactory, RejectedExecutionHandler handler)
	{
		super(0, 0, 0L, (TimeUnit)null, (BlockingQueue)null, (ThreadFactory)null, (RejectedExecutionHandler)null);
		throw new RuntimeException("Stub!");
	}

	public boolean remove(Runnable task)
	{
		throw new RuntimeException("Stub!");
	}

	public ScheduledFuture schedule(Runnable command, long delay, TimeUnit unit)
	{
		throw new RuntimeException("Stub!");
	}

	public ScheduledFuture schedule(Callable callable, long delay, TimeUnit unit)
	{
		throw new RuntimeException("Stub!");
	}

	public ScheduledFuture scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit)
	{
		throw new RuntimeException("Stub!");
	}

	public ScheduledFuture scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit)
	{
		throw new RuntimeException("Stub!");
	}

	public void execute(Runnable command)
	{
		throw new RuntimeException("Stub!");
	}

	public Future submit(Runnable task)
	{
		throw new RuntimeException("Stub!");
	}

	public Future submit(Runnable task, Object result)
	{
		throw new RuntimeException("Stub!");
	}

	public Future submit(Callable task)
	{
		throw new RuntimeException("Stub!");
	}

	public void setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getContinueExistingPeriodicTasksAfterShutdownPolicy()
	{
		throw new RuntimeException("Stub!");
	}

	public void setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getExecuteExistingDelayedTasksAfterShutdownPolicy()
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

	public BlockingQueue getQueue()
	{
		throw new RuntimeException("Stub!");
	}
}
