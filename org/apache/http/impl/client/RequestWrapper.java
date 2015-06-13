// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RequestWrapper.java

package org.apache.http.impl.client;

import java.net.URI;
import org.apache.http.*;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.AbstractHttpMessage;

public class RequestWrapper extends AbstractHttpMessage
	implements HttpUriRequest
{

	public RequestWrapper(HttpRequest request)
		throws ProtocolException
	{
		throw new RuntimeException("Stub!");
	}

	public void resetHeaders()
	{
		throw new RuntimeException("Stub!");
	}

	public String getMethod()
	{
		throw new RuntimeException("Stub!");
	}

	public void setMethod(String method)
	{
		throw new RuntimeException("Stub!");
	}

	public ProtocolVersion getProtocolVersion()
	{
		throw new RuntimeException("Stub!");
	}

	public void setProtocolVersion(ProtocolVersion version)
	{
		throw new RuntimeException("Stub!");
	}

	public URI getURI()
	{
		throw new RuntimeException("Stub!");
	}

	public void setURI(URI uri)
	{
		throw new RuntimeException("Stub!");
	}

	public RequestLine getRequestLine()
	{
		throw new RuntimeException("Stub!");
	}

	public void abort()
		throws UnsupportedOperationException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAborted()
	{
		throw new RuntimeException("Stub!");
	}

	public HttpRequest getOriginal()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isRepeatable()
	{
		throw new RuntimeException("Stub!");
	}

	public int getExecCount()
	{
		throw new RuntimeException("Stub!");
	}

	public void incrementExecCount()
	{
		throw new RuntimeException("Stub!");
	}
}
