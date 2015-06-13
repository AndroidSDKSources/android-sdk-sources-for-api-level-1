// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AtomicIntegerFieldUpdater.java

package java.util.concurrent.atomic;


public abstract class AtomicIntegerFieldUpdater
{

	protected AtomicIntegerFieldUpdater()
	{
		throw new RuntimeException("Stub!");
	}

	public static AtomicIntegerFieldUpdater newUpdater(Class tclass, String fieldName)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean compareAndSet(Object obj, int i, int j);

	public abstract boolean weakCompareAndSet(Object obj, int i, int j);

	public abstract void set(Object obj, int i);

	public abstract int get(Object obj);

	public int getAndSet(Object obj, int newValue)
	{
		throw new RuntimeException("Stub!");
	}

	public int getAndIncrement(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public int getAndDecrement(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public int getAndAdd(Object obj, int delta)
	{
		throw new RuntimeException("Stub!");
	}

	public int incrementAndGet(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public int decrementAndGet(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public int addAndGet(Object obj, int delta)
	{
		throw new RuntimeException("Stub!");
	}
}
