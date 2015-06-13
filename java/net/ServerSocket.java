// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ServerSocket.java

package java.net;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;

// Referenced classes of package java.net:
//			SocketException, SocketImpl, InetAddress, Socket, 
//			SocketImplFactory, SocketAddress

public class ServerSocket
{

	public ServerSocket()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected ServerSocket(SocketImpl impl)
	{
		throw new RuntimeException("Stub!");
	}

	public ServerSocket(int aport)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public ServerSocket(int aport, int backlog)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public ServerSocket(int aport, int backlog, InetAddress localAddr)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Socket accept()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public InetAddress getInetAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLocalPort()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getSoTimeout()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected final void implAccept(Socket aSocket)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setSocketFactory(SocketImplFactory aFactory)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSoTimeout(int timeout)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public void bind(SocketAddress localAddr)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void bind(SocketAddress localAddr, int backlog)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public SocketAddress getLocalSocketAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isBound()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isClosed()
	{
		throw new RuntimeException("Stub!");
	}

	public void setReuseAddress(boolean reuse)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getReuseAddress()
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public void setReceiveBufferSize(int size)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public int getReceiveBufferSize()
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public ServerSocketChannel getChannel()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPerformancePreferences(int connectionTime, int latency, int bandwidth)
	{
		throw new RuntimeException("Stub!");
	}
}
