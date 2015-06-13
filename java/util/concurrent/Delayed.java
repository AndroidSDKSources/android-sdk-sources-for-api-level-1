// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Delayed.java

package java.util.concurrent;


// Referenced classes of package java.util.concurrent:
//			TimeUnit

public interface Delayed
	extends Comparable
{

	public abstract long getDelay(TimeUnit timeunit);
}
