// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WebHistoryItem.java

package android.webkit;

import android.graphics.Bitmap;

public class WebHistoryItem
	implements Cloneable
{

	WebHistoryItem()
	{
		throw new RuntimeException("Stub!");
	}

	public int getId()
	{
		throw new RuntimeException("Stub!");
	}

	public String getUrl()
	{
		throw new RuntimeException("Stub!");
	}

	public String getTitle()
	{
		throw new RuntimeException("Stub!");
	}

	public Bitmap getFavicon()
	{
		throw new RuntimeException("Stub!");
	}

	protected synchronized WebHistoryItem clone()
	{
		throw new RuntimeException("Stub!");
	}

	protected volatile Object clone()
		throws CloneNotSupportedException
	{
		return clone();
	}
}
