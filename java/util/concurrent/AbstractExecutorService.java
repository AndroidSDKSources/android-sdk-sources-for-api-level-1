// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractExecutorService.java

package java.util.concurrent;

import java.util.Collection;
import java.util.List;

// Referenced classes of package java.util.concurrent:
//			ExecutorService, ExecutionException, TimeoutException, Future, 
//			Callable, TimeUnit

public abstract class AbstractExecutorService
	implements ExecutorService
{

	public AbstractExecutorService()
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

	public Object invokeAny(Collection tasks)
		throws InterruptedException, ExecutionException
	{
		throw new RuntimeException("Stub!");
	}

	public Object invokeAny(Collection tasks, long timeout, TimeUnit unit)
		throws InterruptedException, ExecutionException, TimeoutException
	{
		throw new RuntimeException("Stub!");
	}

	public List invokeAll(Collection tasks)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public List invokeAll(Collection tasks, long timeout, TimeUnit unit)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}
}
