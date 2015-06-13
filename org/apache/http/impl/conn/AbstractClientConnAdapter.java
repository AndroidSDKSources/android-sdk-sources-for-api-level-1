// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractClientConnAdapter.java

package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import org.apache.http.*;
import org.apache.http.conn.*;

public abstract class AbstractClientConnAdapter
	implements ManagedClientConnection
{

	protected AbstractClientConnAdapter(ClientConnectionManager mgr, OperatedClientConnection conn)
	{
		throw new RuntimeException("Stub!");
	}

	protected void detach()
	{
		throw new RuntimeException("Stub!");
	}

	protected OperatedClientConnection getWrappedConnection()
	{
		throw new RuntimeException("Stub!");
	}

	protected ClientConnectionManager getManager()
	{
		throw new RuntimeException("Stub!");
	}

	protected final void assertNotAborted()
		throws InterruptedIOException
	{
		throw new RuntimeException("Stub!");
	}

	protected final void assertValid(OperatedClientConnection wrappedConn)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isOpen()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isStale()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSocketTimeout(int timeout)
	{
		throw new RuntimeException("Stub!");
	}

	public int getSocketTimeout()
	{
		throw new RuntimeException("Stub!");
	}

	public HttpConnectionMetrics getMetrics()
	{
		throw new RuntimeException("Stub!");
	}

	public void flush()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isResponseAvailable(int timeout)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void receiveResponseEntity(HttpResponse response)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public HttpResponse receiveResponseHeader()
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void sendRequestEntity(HttpEntityEnclosingRequest request)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void sendRequestHeader(HttpRequest request)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public InetAddress getLocalAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLocalPort()
	{
		throw new RuntimeException("Stub!");
	}

	public InetAddress getRemoteAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public int getRemotePort()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isSecure()
	{
		throw new RuntimeException("Stub!");
	}

	public SSLSession getSSLSession()
	{
		throw new RuntimeException("Stub!");
	}

	public void markReusable()
	{
		throw new RuntimeException("Stub!");
	}

	public void unmarkReusable()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isMarkedReusable()
	{
		throw new RuntimeException("Stub!");
	}

	public void setIdleDuration(long duration, TimeUnit unit)
	{
		throw new RuntimeException("Stub!");
	}

	public void releaseConnection()
	{
		throw new RuntimeException("Stub!");
	}

	public void abortConnection()
	{
		throw new RuntimeException("Stub!");
	}
}
