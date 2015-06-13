// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DatagramSocket.java

package java.net;

import java.io.IOException;
import java.nio.channels.DatagramChannel;

// Referenced classes of package java.net:
//			SocketException, InetAddress, DatagramSocketImpl, SocketAddress, 
//			DatagramPacket, DatagramSocketImplFactory

public class DatagramSocket
{

	public DatagramSocket()
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public DatagramSocket(int aPort)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public DatagramSocket(int aPort, InetAddress addr)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	protected DatagramSocket(DatagramSocketImpl socketImpl)
	{
		throw new RuntimeException("Stub!");
	}

	public DatagramSocket(SocketAddress localAddr)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
	{
		throw new RuntimeException("Stub!");
	}

	public void connect(InetAddress anAddress, int aPort)
	{
		throw new RuntimeException("Stub!");
	}

	public void disconnect()
	{
		throw new RuntimeException("Stub!");
	}

	public InetAddress getInetAddress()
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

	public int getPort()
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

	public synchronized void receive(DatagramPacket pack)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void send(DatagramPacket pack)
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

	public synchronized void setSoTimeout(int timeout)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setDatagramSocketImplFactory(DatagramSocketImplFactory fac)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void bind(SocketAddress localAddr)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public void connect(SocketAddress remoteAddr)
		throws SocketException
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

	public SocketAddress getRemoteSocketAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public SocketAddress getLocalSocketAddress()
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

	public void setBroadcast(boolean broadcast)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getBroadcast()
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

	public boolean isClosed()
	{
		throw new RuntimeException("Stub!");
	}

	public DatagramChannel getChannel()
	{
		throw new RuntimeException("Stub!");
	}
}
