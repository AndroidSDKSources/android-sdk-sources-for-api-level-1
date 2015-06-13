// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DefaultClientConnectionOperator.java

package org.apache.http.impl.conn;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class DefaultClientConnectionOperator
	implements ClientConnectionOperator
{

	protected SchemeRegistry schemeRegistry;

	public DefaultClientConnectionOperator(SchemeRegistry schemes)
	{
		throw new RuntimeException("Stub!");
	}

	public OperatedClientConnection createConnection()
	{
		throw new RuntimeException("Stub!");
	}

	public void openConnection(OperatedClientConnection conn, HttpHost target, InetAddress local, HttpContext context, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void updateSecureConnection(OperatedClientConnection conn, HttpHost target, HttpContext context, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void prepareSocket(Socket sock, HttpContext context, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
