// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SocketFactory.java

package javax.net;

import java.io.IOException;
import java.net.*;

public abstract class SocketFactory
{

	protected SocketFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized SocketFactory getDefault()
	{
		throw new RuntimeException("Stub!");
	}

	public Socket createSocket()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Socket createSocket(String s, int i)
		throws IOException, UnknownHostException;

	public abstract Socket createSocket(String s, int i, InetAddress inetaddress, int j)
		throws IOException, UnknownHostException;

	public abstract Socket createSocket(InetAddress inetaddress, int i)
		throws IOException;

	public abstract Socket createSocket(InetAddress inetaddress, int i, InetAddress inetaddress1, int j)
		throws IOException;
}
