// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DatagramSocketImpl.java

package java.net;

import java.io.FileDescriptor;
import java.io.IOException;

// Referenced classes of package java.net:
//			SocketOptions, SocketException, InetAddress, SocketAddress, 
//			NetworkInterface, DatagramPacket

public abstract class DatagramSocketImpl
	implements SocketOptions
{

	protected FileDescriptor fd;
	protected int localPort;

	public DatagramSocketImpl()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void bind(int i, InetAddress inetaddress)
		throws SocketException;

	protected abstract void close();

	protected abstract void create()
		throws SocketException;

	protected FileDescriptor getFileDescriptor()
	{
		throw new RuntimeException("Stub!");
	}

	protected int getLocalPort()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Object getOption(int i)
		throws SocketException;

	protected abstract byte getTTL()
		throws IOException;

	protected abstract int getTimeToLive()
		throws IOException;

	protected abstract void join(InetAddress inetaddress)
		throws IOException;

	protected abstract void joinGroup(SocketAddress socketaddress, NetworkInterface networkinterface)
		throws IOException;

	protected abstract void leave(InetAddress inetaddress)
		throws IOException;

	protected abstract void leaveGroup(SocketAddress socketaddress, NetworkInterface networkinterface)
		throws IOException;

	protected abstract int peek(InetAddress inetaddress)
		throws IOException;

	protected abstract void receive(DatagramPacket datagrampacket)
		throws IOException;

	protected abstract void send(DatagramPacket datagrampacket)
		throws IOException;

	public abstract void setOption(int i, Object obj)
		throws SocketException;

	protected abstract void setTimeToLive(int i)
		throws IOException;

	protected abstract void setTTL(byte byte0)
		throws IOException;

	protected void connect(InetAddress inetAddr, int port)
		throws SocketException
	{
		throw new RuntimeException("Stub!");
	}

	protected void disconnect()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract int peekData(DatagramPacket datagrampacket)
		throws IOException;
}
