// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ContentObserver.java

package android.database;

import android.os.Handler;

public abstract class ContentObserver
{

	public ContentObserver(Handler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean deliverSelfNotifications()
	{
		throw new RuntimeException("Stub!");
	}

	public void onChange(boolean selfChange)
	{
		throw new RuntimeException("Stub!");
	}

	public final void dispatchChange(boolean selfChange)
	{
		throw new RuntimeException("Stub!");
	}
}
