// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MediaScannerConnection.java

package android.media;

import android.content.*;
import android.net.Uri;
import android.os.IBinder;

public class MediaScannerConnection
	implements ServiceConnection
{
	public static interface MediaScannerConnectionClient
	{

		public abstract void onMediaScannerConnected();

		public abstract void onScanCompleted(String s, Uri uri);
	}


	public MediaScannerConnection(Context context, MediaScannerConnectionClient client)
	{
		throw new RuntimeException("Stub!");
	}

	public void connect()
	{
		throw new RuntimeException("Stub!");
	}

	public void disconnect()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean isConnected()
	{
		throw new RuntimeException("Stub!");
	}

	public void scanFile(String path, String mimeType)
	{
		throw new RuntimeException("Stub!");
	}

	public void onServiceConnected(ComponentName className, IBinder service)
	{
		throw new RuntimeException("Stub!");
	}

	public void onServiceDisconnected(ComponentName className)
	{
		throw new RuntimeException("Stub!");
	}
}
