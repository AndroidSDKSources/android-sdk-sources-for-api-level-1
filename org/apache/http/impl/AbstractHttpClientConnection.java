// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractHttpClientConnection.java

package org.apache.http.impl;

import java.io.IOException;
import org.apache.http.*;
import org.apache.http.impl.entity.EntityDeserializer;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.io.*;
import org.apache.http.params.HttpParams;

public abstract class AbstractHttpClientConnection
	implements HttpClientConnection
{

	public AbstractHttpClientConnection()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void assertOpen()
		throws IllegalStateException;

	protected EntityDeserializer createEntityDeserializer()
	{
		throw new RuntimeException("Stub!");
	}

	protected EntitySerializer createEntitySerializer()
	{
		throw new RuntimeException("Stub!");
	}

	protected HttpResponseFactory createHttpResponseFactory()
	{
		throw new RuntimeException("Stub!");
	}

	protected HttpMessageParser createResponseParser(SessionInputBuffer buffer, HttpResponseFactory responseFactory, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	protected HttpMessageWriter createRequestWriter(SessionOutputBuffer buffer, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	protected void init(SessionInputBuffer inbuffer, SessionOutputBuffer outbuffer, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isResponseAvailable(int timeout)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void sendRequestHeader(HttpRequest request)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void sendRequestEntity(HttpEntityEnclosingRequest request)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void doFlush()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void flush()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public HttpResponse receiveResponseHeader()
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void receiveResponseEntity(HttpResponse response)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isStale()
	{
		throw new RuntimeException("Stub!");
	}

	public HttpConnectionMetrics getMetrics()
	{
		throw new RuntimeException("Stub!");
	}
}
