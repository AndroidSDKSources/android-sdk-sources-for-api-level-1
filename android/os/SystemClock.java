// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SystemClock.java

package android.os;


public final class SystemClock
{

	SystemClock()
	{
		throw new RuntimeException("Stub!");
	}

	public static void sleep(long ms)
	{
		throw new RuntimeException("Stub!");
	}

	public static native boolean setCurrentTimeMillis(long l);

	public static native long uptimeMillis();

	public static native long elapsedRealtime();

	public static native long currentThreadTimeMillis();
}
