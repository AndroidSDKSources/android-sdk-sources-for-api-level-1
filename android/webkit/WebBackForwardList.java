// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WebBackForwardList.java

package android.webkit;

import java.io.Serializable;

// Referenced classes of package android.webkit:
//			WebHistoryItem

public class WebBackForwardList
	implements Cloneable, Serializable
{

	WebBackForwardList()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized WebHistoryItem getCurrentItem()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getCurrentIndex()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized WebHistoryItem getItemAtIndex(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getSize()
	{
		throw new RuntimeException("Stub!");
	}

	protected synchronized WebBackForwardList clone()
	{
		throw new RuntimeException("Stub!");
	}

	protected volatile Object clone()
		throws CloneNotSupportedException
	{
		return clone();
	}
}
