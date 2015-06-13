// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SynchronousQueue.java

package java.util.concurrent;

import java.io.Serializable;
import java.util.*;

// Referenced classes of package java.util.concurrent:
//			BlockingQueue, TimeUnit

public class SynchronousQueue extends AbstractQueue
	implements BlockingQueue, Serializable
{

	public SynchronousQueue()
	{
		throw new RuntimeException("Stub!");
	}

	public SynchronousQueue(boolean fair)
	{
		throw new RuntimeException("Stub!");
	}

	public void put(Object o)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean offer(Object o, long timeout, TimeUnit unit)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public Object take()
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public Object poll(long timeout, TimeUnit unit)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean offer(Object o)
	{
		throw new RuntimeException("Stub!");
	}

	public Object poll()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isEmpty()
	{
		throw new RuntimeException("Stub!");
	}

	public int size()
	{
		throw new RuntimeException("Stub!");
	}

	public int remainingCapacity()
	{
		throw new RuntimeException("Stub!");
	}

	public void clear()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean contains(Object o)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean remove(Object o)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean containsAll(Collection c)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean removeAll(Collection c)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean retainAll(Collection c)
	{
		throw new RuntimeException("Stub!");
	}

	public Object peek()
	{
		throw new RuntimeException("Stub!");
	}

	public Iterator iterator()
	{
		throw new RuntimeException("Stub!");
	}

	public Object[] toArray()
	{
		throw new RuntimeException("Stub!");
	}

	public Object[] toArray(Object a[])
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
}
