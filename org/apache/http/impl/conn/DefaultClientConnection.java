// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DefaultClientConnection.java

package org.apache.http.impl.conn;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.*;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.impl.SocketHttpClientConnection;
import org.apache.http.io.*;
import org.apache.http.params.HttpParams;

public class DefaultClientConnection extends SocketHttpClientConnection
	implements OperatedClientConnection
{

	public DefaultClientConnection()
	{
		throw new RuntimeException("Stub!");
	}

	public final HttpHost getTargetHost()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isSecure()
	{
		throw new RuntimeException("Stub!");
	}

	public final Socket getSocket()
	{
		throw new RuntimeException("Stub!");
	}

	public void opening(Socket sock, HttpHost target)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void openCompleted(boolean secure, HttpParams params)
		throws IOException
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

	protected HttpMessageParser createResponseParser(SessionInputBuffer buffer, HttpResponseFactory responseFactory, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public void update(Socket sock, HttpHost target, boolean secure, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public HttpResponse receiveResponseHeader()
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void sendRequestHeader(HttpRequest request)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}
}
