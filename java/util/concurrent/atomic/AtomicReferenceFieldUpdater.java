// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AtomicReferenceFieldUpdater.java

package java.util.concurrent.atomic;


public abstract class AtomicReferenceFieldUpdater
{

	protected AtomicReferenceFieldUpdater()
	{
		throw new RuntimeException("Stub!");
	}

	public static AtomicReferenceFieldUpdater newUpdater(Class tclass, Class vclass, String fieldName)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean compareAndSet(Object obj, Object obj1, Object obj2);

	public abstract boolean weakCompareAndSet(Object obj, Object obj1, Object obj2);

	public abstract void set(Object obj, Object obj1);

	public abstract Object get(Object obj);

	public Object getAndSet(Object obj, Object newValue)
	{
		throw new RuntimeException("Stub!");
	}
}
