// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CompletionService.java

package java.util.concurrent;


// Referenced classes of package java.util.concurrent:
//			Callable, Future, TimeUnit

public interface CompletionService
{

	public abstract Future submit(Callable callable);

	public abstract Future submit(Runnable runnable, Object obj);

	public abstract Future take()
		throws InterruptedException;

	public abstract Future poll();

	public abstract Future poll(long l, TimeUnit timeunit)
		throws InterruptedException;
}
