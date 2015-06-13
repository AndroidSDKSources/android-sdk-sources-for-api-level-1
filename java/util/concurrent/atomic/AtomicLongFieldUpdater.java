// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AtomicLongFieldUpdater.java

package java.util.concurrent.atomic;


public abstract class AtomicLongFieldUpdater
{

	protected AtomicLongFieldUpdater()
	{
		throw new RuntimeException("Stub!");
	}

	public static AtomicLongFieldUpdater newUpdater(Class tclass, String fieldName)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean compareAndSet(Object obj, long l, long l1);

	public abstract boolean weakCompareAndSet(Object obj, long l, long l1);

	public abstract void set(Object obj, long l);

	public abstract long get(Object obj);

	public long getAndSet(Object obj, long newValue)
	{
		throw new RuntimeException("Stub!");
	}

	public long getAndIncrement(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public long getAndDecrement(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public long getAndAdd(Object obj, long delta)
	{
		throw new RuntimeException("Stub!");
	}

	public long incrementAndGet(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public long decrementAndGet(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public long addAndGet(Object obj, long delta)
	{
		throw new RuntimeException("Stub!");
	}
}
