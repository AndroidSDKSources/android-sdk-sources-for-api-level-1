// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SocketImpl.java

package java.net;

import java.io.*;

// Referenced classes of package java.net:
//			SocketOptions, SocketException, InetAddress, SocketAddress

public abstract class SocketImpl
	implements SocketOptions
{

	protected InetAddress address;
	protected int port;
	protected FileDescriptor fd;
	protected int localport;
	protected int receiveTimeout;

	public SocketImpl()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void accept(SocketImpl socketimpl)
		throws IOException;

	protected abstract int available()
		throws IOException;

	protected abstract void bind(InetAddress inetaddress, int i)
		throws IOException;

	protected abstract void close()
		throws IOException;

	protected abstract void connect(String s, int i)
		throws IOException;

	protected abstract void connect(InetAddress inetaddress, int i)
		throws IOException;

	protected abstract void create(boolean flag)
		throws IOException;

	protected FileDescriptor getFileDescriptor()
	{
		throw new RuntimeException("Stub!");
	}

	protected InetAddress getInetAddress()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract InputStream getInputStream()
		throws IOException;

	protected int getLocalPort()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Object getOption(int i)
		throws SocketException;

	protected abstract OutputStream getOutputStream()
		throws IOException;

	protected int getPort()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void listen(int i)
		throws IOException;

	public abstract void setOption(int i, Object obj)
		throws SocketException;

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	protected void shutdownInput()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void shutdownOutput()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void connect(SocketAddress socketaddress, int i)
		throws IOException;

	protected boolean supportsUrgentData()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void sendUrgentData(int i)
		throws IOException;

	protected void setPerformancePreferences(int connectionTime, int latency, int bandwidth)
	{
		throw new RuntimeException("Stub!");
	}
}
