// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ScheduledExecutorService.java

package java.util.concurrent;


// Referenced classes of package java.util.concurrent:
//			ExecutorService, TimeUnit, ScheduledFuture, Callable

public interface ScheduledExecutorService
	extends ExecutorService
{

	public abstract ScheduledFuture schedule(Runnable runnable, long l, TimeUnit timeunit);

	public abstract ScheduledFuture schedule(Callable callable, long l, TimeUnit timeunit);

	public abstract ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l, long l1, TimeUnit timeunit);

	public abstract ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l, long l1, TimeUnit timeunit);
}
