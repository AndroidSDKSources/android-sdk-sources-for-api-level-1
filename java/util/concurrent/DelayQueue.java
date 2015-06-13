// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DelayQueue.java

package java.util.concurrent;

import java.util.*;

// Referenced classes of package java.util.concurrent:
//			Delayed, BlockingQueue, TimeUnit

public class DelayQueue extends AbstractQueue
	implements BlockingQueue
{

	public DelayQueue()
	{
		throw new RuntimeException("Stub!");
	}

	public DelayQueue(Collection c)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean offer(Delayed o)
	{
		throw new RuntimeException("Stub!");
	}

	public void put(Delayed o)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean offer(Delayed o, long timeout, TimeUnit unit)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean add(Delayed o)
	{
		throw new RuntimeException("Stub!");
	}

	public Delayed take()
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public Delayed poll(long time, TimeUnit unit)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public Delayed poll()
	{
		throw new RuntimeException("Stub!");
	}

	public Delayed peek()
	{
		throw new RuntimeException("Stub!");
	}

	public int size()
	{
		throw new RuntimeException("Stub!");
	}

	public int drainTo(Collection c)
	{
		throw new RuntimeException("Stub!");
	}

	public int drainTo(Collection c, int maxElements)
	{
		throw new RuntimeException("Stub!");
	}

	public void clear()
	{
		throw new RuntimeException("Stub!");
	}

	public int remainingCapacity()
	{
		throw new RuntimeException("Stub!");
	}

	public Object[] toArray()
	{
		throw new RuntimeException("Stub!");
	}

	public Object[] toArray(Object array[])
	{
		throw new RuntimeException("Stub!");
	}

	public boolean remove(Object o)
	{
		throw new RuntimeException("Stub!");
	}

	public Iterator iterator()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile boolean add(Object x0)
	{
		return add((Delayed)x0);
	}

	public volatile Object peek()
	{
		return peek();
	}

	public volatile Object poll()
	{
		return poll();
	}

	public volatile boolean offer(Object x0)
	{
		return offer((Delayed)x0);
	}

	public volatile void put(Object x0)
		throws InterruptedException
	{
		put((Delayed)x0);
	}

	public volatile Object take()
		throws InterruptedException
	{
		return take();
	}

	public volatile Object poll(long x0, TimeUnit x1)
		throws InterruptedException
	{
		return poll(x0, x1);
	}

	public volatile boolean offer(Object x0, long x1, TimeUnit x2)
		throws InterruptedException
	{
		return offer((Delayed)x0, x1, x2);
	}
}
