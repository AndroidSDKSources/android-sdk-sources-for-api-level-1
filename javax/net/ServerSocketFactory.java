// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ServerSocketFactory.java

package javax.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

public abstract class ServerSocketFactory
{

	protected ServerSocketFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized ServerSocketFactory getDefault()
	{
		throw new RuntimeException("Stub!");
	}

	public ServerSocket createServerSocket()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract ServerSocket createServerSocket(int i)
		throws IOException;

	public abstract ServerSocket createServerSocket(int i, int j)
		throws IOException;

	public abstract ServerSocket createServerSocket(int i, int j, InetAddress inetaddress)
		throws IOException;
}
