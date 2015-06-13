// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractHttpServerConnection.java

package org.apache.http.impl;

import java.io.IOException;
import org.apache.http.*;
import org.apache.http.impl.entity.EntityDeserializer;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.io.*;
import org.apache.http.params.HttpParams;

public abstract class AbstractHttpServerConnection
	implements HttpServerConnection
{

	public AbstractHttpServerConnection()
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

	protected HttpRequestFactory createHttpRequestFactory()
	{
		throw new RuntimeException("Stub!");
	}

	protected HttpMessageParser createRequestParser(SessionInputBuffer buffer, HttpRequestFactory requestFactory, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	protected HttpMessageWriter createResponseWriter(SessionOutputBuffer buffer, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	protected void init(SessionInputBuffer inbuffer, SessionOutputBuffer outbuffer, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpRequest receiveRequestHeader()
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void receiveRequestEntity(HttpEntityEnclosingRequest request)
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

	public void sendResponseHeader(HttpResponse response)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void sendResponseEntity(HttpResponse response)
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
