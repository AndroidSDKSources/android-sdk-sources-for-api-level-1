// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ExecutorService.java

package java.util.concurrent;

import java.util.Collection;
import java.util.List;

// Referenced classes of package java.util.concurrent:
//			Executor, ExecutionException, TimeoutException, TimeUnit, 
//			Callable, Future

public interface ExecutorService
	extends Executor
{

	public abstract void shutdown();

	public abstract List shutdownNow();

	public abstract boolean isShutdown();

	public abstract boolean isTerminated();

	public abstract boolean awaitTermination(long l, TimeUnit timeunit)
		throws InterruptedException;

	public abstract Future submit(Callable callable);

	public abstract Future submit(Runnable runnable, Object obj);

	public abstract Future submit(Runnable runnable);

	public abstract List invokeAll(Collection collection)
		throws InterruptedException;

	public abstract List invokeAll(Collection collection, long l, TimeUnit timeunit)
		throws InterruptedException;

	public abstract Object invokeAny(Collection collection)
		throws InterruptedException, ExecutionException;

	public abstract Object invokeAny(Collection collection, long l, TimeUnit timeunit)
		throws InterruptedException, ExecutionException, TimeoutException;
}
