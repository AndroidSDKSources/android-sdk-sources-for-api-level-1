// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicHttpRequest.java

package org.apache.http.message;

import org.apache.http.*;

// Referenced classes of package org.apache.http.message:
//			AbstractHttpMessage

public class BasicHttpRequest extends AbstractHttpMessage
	implements HttpRequest
{

	public BasicHttpRequest(String method, String uri)
	{
		throw new RuntimeException("Stub!");
	}

	public BasicHttpRequest(String method, String uri, ProtocolVersion ver)
	{
		throw new RuntimeException("Stub!");
	}

	public BasicHttpRequest(RequestLine requestline)
	{
		throw new RuntimeException("Stub!");
	}

	public ProtocolVersion getProtocolVersion()
	{
		throw new RuntimeException("Stub!");
	}

	public RequestLine getRequestLine()
	{
		throw new RuntimeException("Stub!");
	}
}
