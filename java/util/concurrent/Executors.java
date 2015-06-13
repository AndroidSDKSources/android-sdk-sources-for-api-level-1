// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Executors.java

package java.util.concurrent;

import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;

// Referenced classes of package java.util.concurrent:
//			ExecutorService, ThreadFactory, ScheduledExecutorService, Callable

public class Executors
{

	Executors()
	{
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newFixedThreadPool(int nThreads)
	{
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newFixedThreadPool(int nThreads, ThreadFactory threadFactory)
	{
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newSingleThreadExecutor()
	{
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory)
	{
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newCachedThreadPool()
	{
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService newCachedThreadPool(ThreadFactory threadFactory)
	{
		throw new RuntimeException("Stub!");
	}

	public static ScheduledExecutorService newSingleThreadScheduledExecutor()
	{
		throw new RuntimeException("Stub!");
	}

	public static ScheduledExecutorService newSingleThreadScheduledExecutor(ThreadFactory threadFactory)
	{
		throw new RuntimeException("Stub!");
	}

	public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize)
	{
		throw new RuntimeException("Stub!");
	}

	public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize, ThreadFactory threadFactory)
	{
		throw new RuntimeException("Stub!");
	}

	public static ExecutorService unconfigurableExecutorService(ExecutorService executor)
	{
		throw new RuntimeException("Stub!");
	}

	public static ScheduledExecutorService unconfigurableScheduledExecutorService(ScheduledExecutorService executor)
	{
		throw new RuntimeException("Stub!");
	}

	public static ThreadFactory defaultThreadFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public static ThreadFactory privilegedThreadFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public static Callable callable(Runnable task, Object result)
	{
		throw new RuntimeException("Stub!");
	}

	public static Callable callable(Runnable task)
	{
		throw new RuntimeException("Stub!");
	}

	public static Callable callable(PrivilegedAction action)
	{
		throw new RuntimeException("Stub!");
	}

	public static Callable callable(PrivilegedExceptionAction action)
	{
		throw new RuntimeException("Stub!");
	}

	public static Callable privilegedCallable(Callable callable)
	{
		throw new RuntimeException("Stub!");
	}

	public static Callable privilegedCallableUsingCurrentClassLoader(Callable callable)
	{
		throw new RuntimeException("Stub!");
	}
}
