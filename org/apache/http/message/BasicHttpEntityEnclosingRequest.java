// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicHttpEntityEnclosingRequest.java

package org.apache.http.message;

import org.apache.http.*;

// Referenced classes of package org.apache.http.message:
//			BasicHttpRequest

public class BasicHttpEntityEnclosingRequest extends BasicHttpRequest
	implements HttpEntityEnclosingRequest
{

	public BasicHttpEntityEnclosingRequest(String method, String uri)
	{
		super((RequestLine)null);
		throw new RuntimeException("Stub!");
	}

	public BasicHttpEntityEnclosingRequest(String method, String uri, ProtocolVersion ver)
	{
		super((RequestLine)null);
		throw new RuntimeException("Stub!");
	}

	public BasicHttpEntityEnclosingRequest(RequestLine requestline)
	{
		super((RequestLine)null);
		throw new RuntimeException("Stub!");
	}

	public HttpEntity getEntity()
	{
		throw new RuntimeException("Stub!");
	}

	public void setEntity(HttpEntity entity)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean expectContinue()
	{
		throw new RuntimeException("Stub!");
	}
}
