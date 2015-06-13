// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TokenWatcher.java

package android.os;


// Referenced classes of package android.os:
//			Handler, IBinder

public abstract class TokenWatcher
{

	public TokenWatcher(Handler h, String tag)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void acquired();

	public abstract void released();

	public void acquire(IBinder token, String tag)
	{
		throw new RuntimeException("Stub!");
	}

	public void cleanup(IBinder token, boolean unlink)
	{
		throw new RuntimeException("Stub!");
	}

	public void release(IBinder token)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAcquired()
	{
		throw new RuntimeException("Stub!");
	}

	public void dump()
	{
		throw new RuntimeException("Stub!");
	}
}
