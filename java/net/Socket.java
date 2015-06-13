// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Socket.java

package java.net;

import java.io.*;
import java.nio.channels.SocketChannel;

// Referenced classes of package java.net:
//			UnknownHostException, SocketException, Proxy, InetAddress, 
//			SocketImpl, SocketImplFactory, SocketAddress

public class Socket
{

	public Socket()
	{
		throw new RuntimeException("Stub!");
	}

	public Socket(Proxy proxy)
	{
		throw new RuntimeException("Stub!");
	}

	public Socket(String dstName, int dstPort)
		throws UnknownHostException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Socket(String dstName, int dstPort, InetAddress localAddress, int localPort)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Socket(String hostName, int port, boolean streaming)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Socket(InetAddress dstAddress, int dstPort)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Socket(InetAddress dstAddress, int dstPort, InetAddress localAddress, int localPort)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Socket(InetAddress addr, int port, boolean streaming)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected Socket(SocketImpl anImpl)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public InetAddress getInetAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream getInputStream()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getKeepAlive()
		throws SocketException
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

	public OutputStream getOutputStream()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int getPort()
	{
		throw new RuntimeException("Stub!");
	}

	public int getSoLinger()
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getReceiveBufferSize()
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getSendBufferSize()
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getSoTimeout()
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getTcpNoDelay()
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public void setKeepAlive(boolean value)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setSocketImplFactory(SocketImplFactory fac)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSendBufferSize(int size)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setReceiveBufferSize(int size)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public void setSoLinger(boolean on, int timeout)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSoTimeout(int timeout)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public void setTcpNoDelay(boolean on)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public void shutdownInput()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void shutdownOutput()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public SocketAddress getLocalSocketAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public SocketAddress getRemoteSocketAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isBound()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isConnected()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isClosed()
	{
		throw new RuntimeException("Stub!");
	}

	public void bind(SocketAddress localAddr)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void connect(SocketAddress remoteAddr)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void connect(SocketAddress remoteAddr, int timeout)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isInputShutdown()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isOutputShutdown()
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

	public void setOOBInline(boolean oobinline)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getOOBInline()
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public void setTrafficClass(int value)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public int getTrafficClass()
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public void sendUrgentData(int value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public SocketChannel getChannel()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPerformancePreferences(int connectionTime, int latency, int bandwidth)
	{
		throw new RuntimeException("Stub!");
	}
}
