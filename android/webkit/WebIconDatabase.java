// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WebIconDatabase.java

package android.webkit;

import android.graphics.Bitmap;

public final class WebIconDatabase
{
	public static interface IconListener
	{

		public abstract void onReceivedIcon(String s, Bitmap bitmap);
	}


	WebIconDatabase()
	{
		throw new RuntimeException("Stub!");
	}

	public void open(String path)
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
	{
		throw new RuntimeException("Stub!");
	}

	public void removeAllIcons()
	{
		throw new RuntimeException("Stub!");
	}

	public void requestIconForPageUrl(String url, IconListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void retainIconForPageUrl(String url)
	{
		throw new RuntimeException("Stub!");
	}

	public void releaseIconForPageUrl(String url)
	{
		throw new RuntimeException("Stub!");
	}

	public static WebIconDatabase getInstance()
	{
		throw new RuntimeException("Stub!");
	}
}
