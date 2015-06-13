// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BlockingQueue.java

package java.util.concurrent;

import java.util.Collection;
import java.util.Queue;

// Referenced classes of package java.util.concurrent:
//			TimeUnit

public interface BlockingQueue
	extends Queue
{

	public abstract boolean offer(Object obj);

	public abstract boolean offer(Object obj, long l, TimeUnit timeunit)
		throws InterruptedException;

	public abstract Object poll(long l, TimeUnit timeunit)
		throws InterruptedException;

	public abstract Object take()
		throws InterruptedException;

	public abstract void put(Object obj)
		throws InterruptedException;

	public abstract int remainingCapacity();

	public abstract boolean add(Object obj);

	public abstract int drainTo(Collection collection);

	public abstract int drainTo(Collection collection, int i);
}
