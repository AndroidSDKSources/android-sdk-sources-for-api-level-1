// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Condition.java

package java.util.concurrent.locks;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public interface Condition
{

	public abstract void await()
		throws InterruptedException;

	public abstract void awaitUninterruptibly();

	public abstract long awaitNanos(long l)
		throws InterruptedException;

	public abstract boolean await(long l, TimeUnit timeunit)
		throws InterruptedException;

	public abstract boolean awaitUntil(Date date)
		throws InterruptedException;

	public abstract void signal();

	public abstract void signalAll();
}
