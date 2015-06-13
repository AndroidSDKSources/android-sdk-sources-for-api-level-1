// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FutureTask.java

package java.util.concurrent;


// Referenced classes of package java.util.concurrent:
//			Future, ExecutionException, TimeoutException, Callable, 
//			TimeUnit

public class FutureTask
	implements Future, Runnable
{

	public FutureTask(Callable callable)
	{
		throw new RuntimeException("Stub!");
	}

	public FutureTask(Runnable runnable, Object result)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isCancelled()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isDone()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean cancel(boolean mayInterruptIfRunning)
	{
		throw new RuntimeException("Stub!");
	}

	public Object get()
		throws InterruptedException, ExecutionException
	{
		throw new RuntimeException("Stub!");
	}

	public Object get(long timeout, TimeUnit unit)
		throws InterruptedException, ExecutionException, TimeoutException
	{
		throw new RuntimeException("Stub!");
	}

	protected void done()
	{
		throw new RuntimeException("Stub!");
	}

	protected void set(Object v)
	{
		throw new RuntimeException("Stub!");
	}

	protected void setException(Throwable t)
	{
		throw new RuntimeException("Stub!");
	}

	public void run()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean runAndReset()
	{
		throw new RuntimeException("Stub!");
	}
}
