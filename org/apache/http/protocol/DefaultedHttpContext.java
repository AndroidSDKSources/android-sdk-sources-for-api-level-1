// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DefaultedHttpContext.java

package org.apache.http.protocol;


// Referenced classes of package org.apache.http.protocol:
//			HttpContext

public final class DefaultedHttpContext
	implements HttpContext
{

	public DefaultedHttpContext(HttpContext local, HttpContext defaults)
	{
		throw new RuntimeException("Stub!");
	}

	public Object getAttribute(String id)
	{
		throw new RuntimeException("Stub!");
	}

	public Object removeAttribute(String id)
	{
		throw new RuntimeException("Stub!");
	}

	public void setAttribute(String id, Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpContext getDefaults()
	{
		throw new RuntimeException("Stub!");
	}
}
