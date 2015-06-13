// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CountDownTimer.java

package android.os;


public abstract class CountDownTimer
{

	public CountDownTimer(long millisInFuture, long countDownInterval)
	{
		throw new RuntimeException("Stub!");
	}

	public final void cancel()
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized CountDownTimer start()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void onTick(long l);

	public abstract void onFinish();
}
