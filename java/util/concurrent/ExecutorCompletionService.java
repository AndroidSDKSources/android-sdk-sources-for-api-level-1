// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ExecutorCompletionService.java

package java.util.concurrent;


// Referenced classes of package java.util.concurrent:
//			CompletionService, Executor, BlockingQueue, Callable, 
//			Future, TimeUnit

public class ExecutorCompletionService
	implements CompletionService
{

	public ExecutorCompletionService(Executor executor)
	{
		throw new RuntimeException("Stub!");
	}

	public ExecutorCompletionService(Executor executor, BlockingQueue completionQueue)
	{
		throw new RuntimeException("Stub!");
	}

	public Future submit(Callable task)
	{
		throw new RuntimeException("Stub!");
	}

	public Future submit(Runnable task, Object result)
	{
		throw new RuntimeException("Stub!");
	}

	public Future take()
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public Future poll()
	{
		throw new RuntimeException("Stub!");
	}

	public Future poll(long timeout, TimeUnit unit)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}
}
