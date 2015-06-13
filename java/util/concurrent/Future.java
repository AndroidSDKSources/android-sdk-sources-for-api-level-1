// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Future.java

package java.util.concurrent;


// Referenced classes of package java.util.concurrent:
//			ExecutionException, TimeoutException, TimeUnit

public interface Future
{

	public abstract boolean cancel(boolean flag);

	public abstract boolean isCancelled();

	public abstract boolean isDone();

	public abstract Object get()
		throws InterruptedException, ExecutionException;

	public abstract Object get(long l, TimeUnit timeunit)
		throws InterruptedException, ExecutionException, TimeoutException;
}
