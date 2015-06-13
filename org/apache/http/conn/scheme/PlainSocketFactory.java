// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PlainSocketFactory.java

package org.apache.http.conn.scheme;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.conn.scheme:
//			SocketFactory, HostNameResolver

public final class PlainSocketFactory
	implements SocketFactory
{

	public PlainSocketFactory(HostNameResolver nameResolver)
	{
		throw new RuntimeException("Stub!");
	}

	public PlainSocketFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public static PlainSocketFactory getSocketFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public Socket createSocket()
	{
		throw new RuntimeException("Stub!");
	}

	public Socket connectSocket(Socket sock, String host, int port, InetAddress localAddress, int localPort, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isSecure(Socket sock)
		throws IllegalArgumentException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}
}
