// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpRequestExecutor.java

package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.*;

// Referenced classes of package org.apache.http.protocol:
//			HttpContext, HttpProcessor

public class HttpRequestExecutor
{

	public HttpRequestExecutor()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean canResponseHaveBody(HttpRequest request, HttpResponse response)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpResponse execute(HttpRequest request, HttpClientConnection conn, HttpContext context)
		throws IOException, HttpException
	{
		throw new RuntimeException("Stub!");
	}

	public void preProcess(HttpRequest request, HttpProcessor processor, HttpContext context)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected HttpResponse doSendRequest(HttpRequest request, HttpClientConnection conn, HttpContext context)
		throws IOException, HttpException
	{
		throw new RuntimeException("Stub!");
	}

	protected HttpResponse doReceiveResponse(HttpRequest request, HttpClientConnection conn, HttpContext context)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void postProcess(HttpResponse response, HttpProcessor processor, HttpContext context)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}
}
