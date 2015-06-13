// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpService.java

package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.*;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.protocol:
//			HttpProcessor, HttpRequestHandlerResolver, HttpExpectationVerifier, HttpContext

public class HttpService
{

	public HttpService(HttpProcessor proc, ConnectionReuseStrategy connStrategy, HttpResponseFactory responseFactory)
	{
		throw new RuntimeException("Stub!");
	}

	public void setHttpProcessor(HttpProcessor processor)
	{
		throw new RuntimeException("Stub!");
	}

	public void setConnReuseStrategy(ConnectionReuseStrategy connStrategy)
	{
		throw new RuntimeException("Stub!");
	}

	public void setResponseFactory(HttpResponseFactory responseFactory)
	{
		throw new RuntimeException("Stub!");
	}

	public void setHandlerResolver(HttpRequestHandlerResolver handlerResolver)
	{
		throw new RuntimeException("Stub!");
	}

	public void setExpectationVerifier(HttpExpectationVerifier expectationVerifier)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpParams getParams()
	{
		throw new RuntimeException("Stub!");
	}

	public void setParams(HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public void handleRequest(HttpServerConnection conn, HttpContext context)
		throws IOException, HttpException
	{
		throw new RuntimeException("Stub!");
	}

	protected void handleException(HttpException ex, HttpResponse response)
	{
		throw new RuntimeException("Stub!");
	}

	protected void doService(HttpRequest request, HttpResponse response, HttpContext context)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}
}
