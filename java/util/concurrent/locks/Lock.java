// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Lock.java

package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;

// Referenced classes of package java.util.concurrent.locks:
//			Condition

public interface Lock
{

	public abstract void lock();

	public abstract void lockInterruptibly()
		throws InterruptedException;

	public abstract boolean tryLock();

	public abstract boolean tryLock(long l, TimeUnit timeunit)
		throws InterruptedException;

	public abstract void unlock();

	public abstract Condition newCondition();
}
