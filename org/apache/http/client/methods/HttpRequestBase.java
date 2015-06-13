// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpRequestBase.java

package org.apache.http.client.methods;

import java.io.IOException;
import java.net.URI;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.message.AbstractHttpMessage;

// Referenced classes of package org.apache.http.client.methods:
//			HttpUriRequest, AbortableHttpRequest

public abstract class HttpRequestBase extends AbstractHttpMessage
	implements HttpUriRequest, AbortableHttpRequest, Cloneable
{

	public HttpRequestBase()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract String getMethod();

	public ProtocolVersion getProtocolVersion()
	{
		throw new RuntimeException("Stub!");
	}

	public URI getURI()
	{
		throw new RuntimeException("Stub!");
	}

	public RequestLine getRequestLine()
	{
		throw new RuntimeException("Stub!");
	}

	public void setURI(URI uri)
	{
		throw new RuntimeException("Stub!");
	}

	public void setConnectionRequest(ClientConnectionRequest connRequest)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setReleaseTrigger(ConnectionReleaseTrigger releaseTrigger)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void abort()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAborted()
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}
}
