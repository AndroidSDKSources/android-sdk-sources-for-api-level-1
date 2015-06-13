// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SyncBasicHttpContext.java

package org.apache.http.protocol;


// Referenced classes of package org.apache.http.protocol:
//			BasicHttpContext, HttpContext

public class SyncBasicHttpContext extends BasicHttpContext
{

	public SyncBasicHttpContext(HttpContext parentContext)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Object getAttribute(String id)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setAttribute(String id, Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Object removeAttribute(String id)
	{
		throw new RuntimeException("Stub!");
	}
}
