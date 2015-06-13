// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpEntityWrapper.java

package org.apache.http.entity;

import java.io.*;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public class HttpEntityWrapper
	implements HttpEntity
{

	protected HttpEntity wrappedEntity;

	public HttpEntityWrapper(HttpEntity wrapped)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isRepeatable()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isChunked()
	{
		throw new RuntimeException("Stub!");
	}

	public long getContentLength()
	{
		throw new RuntimeException("Stub!");
	}

	public Header getContentType()
	{
		throw new RuntimeException("Stub!");
	}

	public Header getContentEncoding()
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream getContent()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeTo(OutputStream outstream)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isStreaming()
	{
		throw new RuntimeException("Stub!");
	}

	public void consumeContent()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
