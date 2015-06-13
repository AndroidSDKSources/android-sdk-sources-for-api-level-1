// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SocketHttpClientConnection.java

package org.apache.http.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.HttpInetConnection;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.impl:
//			AbstractHttpClientConnection

public class SocketHttpClientConnection extends AbstractHttpClientConnection
	implements HttpInetConnection
{

	public SocketHttpClientConnection()
	{
		throw new RuntimeException("Stub!");
	}

	protected void assertNotOpen()
	{
		throw new RuntimeException("Stub!");
	}

	protected void assertOpen()
	{
		throw new RuntimeException("Stub!");
	}

	protected SessionInputBuffer createSessionInputBuffer(Socket socket, int buffersize, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected SessionOutputBuffer createSessionOutputBuffer(Socket socket, int buffersize, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void bind(Socket socket, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isOpen()
	{
		throw new RuntimeException("Stub!");
	}

	protected Socket getSocket()
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

	public void setSocketTimeout(int timeout)
	{
		throw new RuntimeException("Stub!");
	}

	public int getSocketTimeout()
	{
		throw new RuntimeException("Stub!");
	}

	public void shutdown()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
