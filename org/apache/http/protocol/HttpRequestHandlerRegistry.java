// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpRequestHandlerRegistry.java

package org.apache.http.protocol;

import java.util.Map;

// Referenced classes of package org.apache.http.protocol:
//			HttpRequestHandlerResolver, HttpRequestHandler

public class HttpRequestHandlerRegistry
	implements HttpRequestHandlerResolver
{

	public HttpRequestHandlerRegistry()
	{
		throw new RuntimeException("Stub!");
	}

	public void register(String pattern, HttpRequestHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public void unregister(String pattern)
	{
		throw new RuntimeException("Stub!");
	}

	public void setHandlers(Map map)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpRequestHandler lookup(String requestURI)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean matchUriRequestPattern(String pattern, String requestUri)
	{
		throw new RuntimeException("Stub!");
	}
}
