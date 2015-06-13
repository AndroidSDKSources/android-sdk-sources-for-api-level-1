// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DatagramPacket.java

package java.net;


// Referenced classes of package java.net:
//			SocketException, InetAddress, SocketAddress

public final class DatagramPacket
{

	public DatagramPacket(byte data[], int length)
	{
		throw new RuntimeException("Stub!");
	}

	public DatagramPacket(byte data[], int offset, int length)
	{
		throw new RuntimeException("Stub!");
	}

	public DatagramPacket(byte data[], int offset, int length, InetAddress host, int aPort)
	{
		throw new RuntimeException("Stub!");
	}

	public DatagramPacket(byte data[], int length, InetAddress host, int port)
	{
		throw new RuntimeException("Stub!");
	}

	public DatagramPacket(byte data[], int length, SocketAddress sockAddr)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public DatagramPacket(byte data[], int offset, int length, SocketAddress sockAddr)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized InetAddress getAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized byte[] getData()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getLength()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getOffset()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getPort()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setAddress(InetAddress addr)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setData(byte buf[], int anOffset, int aLength)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setData(byte buf[])
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setLength(int len)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setPort(int aPort)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized SocketAddress getSocketAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSocketAddress(SocketAddress sockAddr)
	{
		throw new RuntimeException("Stub!");
	}
}
