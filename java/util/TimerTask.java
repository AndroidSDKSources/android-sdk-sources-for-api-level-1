// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TimerTask.java

package java.util;


public abstract class TimerTask
	implements Runnable
{

	protected TimerTask()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean cancel()
	{
		throw new RuntimeException("Stub!");
	}

	public long scheduledExecutionTime()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void run();
}
