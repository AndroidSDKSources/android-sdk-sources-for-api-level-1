// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IsolatedContext.java

package android.test;

import android.content.*;
import android.net.Uri;
import java.util.List;

public class IsolatedContext extends ContextWrapper
{

	public IsolatedContext(ContentResolver resolver, Context targetContext)
	{
		super((Context)null);
		throw new RuntimeException("Stub!");
	}

	public List getAndClearBroadcastIntents()
	{
		throw new RuntimeException("Stub!");
	}

	public ContentResolver getContentResolver()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean bindService(Intent service, ServiceConnection conn, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendBroadcast(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendOrderedBroadcast(Intent intent, String receiverPermission)
	{
		throw new RuntimeException("Stub!");
	}

	public int checkUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public Object getSystemService(String name)
	{
		throw new RuntimeException("Stub!");
	}
}
