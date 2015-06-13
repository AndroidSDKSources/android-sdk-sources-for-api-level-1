// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Service.java

package android.app;

import android.content.*;
import android.content.res.Configuration;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.app:
//			Application

public abstract class Service extends ContextWrapper
	implements ComponentCallbacks
{

	public Service()
	{
		super((Context)null);
		throw new RuntimeException("Stub!");
	}

	public final Application getApplication()
	{
		throw new RuntimeException("Stub!");
	}

	public void onCreate()
	{
		throw new RuntimeException("Stub!");
	}

	public void onStart(Intent intent, int startId)
	{
		throw new RuntimeException("Stub!");
	}

	public void onDestroy()
	{
		throw new RuntimeException("Stub!");
	}

	public void onConfigurationChanged(Configuration newConfig)
	{
		throw new RuntimeException("Stub!");
	}

	public void onLowMemory()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract IBinder onBind(Intent intent);

	public boolean onUnbind(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public void onRebind(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public final void stopSelf()
	{
		throw new RuntimeException("Stub!");
	}

	public final void stopSelf(int startId)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean stopSelfResult(int startId)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setForeground(boolean isForeground)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dump(FileDescriptor fd, PrintWriter writer, String args[])
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}
}
