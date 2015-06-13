// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WebSyncManager.java

package android.webkit;

import android.content.Context;
import android.os.Handler;

// Referenced classes of package android.webkit:
//			WebViewDatabase

abstract class WebSyncManager
	implements Runnable
{

	protected Handler mHandler;
	protected WebViewDatabase mDataBase;
	protected static final String LOGTAG = "websync";

	protected WebSyncManager(Context context, String name)
	{
		throw new RuntimeException("Stub!");
	}

	protected Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}

	public void run()
	{
		throw new RuntimeException("Stub!");
	}

	public void sync()
	{
		throw new RuntimeException("Stub!");
	}

	public void resetSync()
	{
		throw new RuntimeException("Stub!");
	}

	public void startSync()
	{
		throw new RuntimeException("Stub!");
	}

	public void stopSync()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onSyncInit()
	{
		throw new RuntimeException("Stub!");
	}
}
