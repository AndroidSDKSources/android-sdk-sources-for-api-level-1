// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MulticastSocket.java

package java.net;

import java.io.IOException;

// Referenced classes of package java.net:
//			DatagramSocket, DatagramSocketImpl, SocketException, SocketAddress, 
//			InetAddress, NetworkInterface, DatagramPacket

public class MulticastSocket extends DatagramSocket
{

	public MulticastSocket()
		throws IOException
	{
		super((DatagramSocketImpl)null);
		throw new RuntimeException("Stub!");
	}

	public MulticastSocket(int aPort)
		throws IOException
	{
		super((DatagramSocketImpl)null);
		throw new RuntimeException("Stub!");
	}

	public MulticastSocket(SocketAddress localAddr)
		throws IOException
	{
		super((DatagramSocketImpl)null);
		throw new RuntimeException("Stub!");
	}

	public InetAddress getInterface()
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public NetworkInterface getNetworkInterface()
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public int getTimeToLive()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public byte getTTL()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void joinGroup(InetAddress groupAddr)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void joinGroup(SocketAddress groupAddress, NetworkInterface netInterface)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void leaveGroup(InetAddress groupAddr)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void leaveGroup(SocketAddress groupAddress, NetworkInterface netInterface)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void send(DatagramPacket pack, byte ttl)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setInterface(InetAddress addr)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public void setNetworkInterface(NetworkInterface netInterface)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public void setTimeToLive(int ttl)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setTTL(byte ttl)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getLoopbackMode()
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public void setLoopbackMode(boolean loop)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}
}
