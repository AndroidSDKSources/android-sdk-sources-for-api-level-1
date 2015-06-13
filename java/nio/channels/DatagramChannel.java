// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DatagramChannel.java

package java.nio.channels;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.SelectorProvider;

// Referenced classes of package java.nio.channels:
//			ByteChannel, ScatteringByteChannel, GatheringByteChannel

public abstract class DatagramChannel extends AbstractSelectableChannel
	implements ByteChannel, ScatteringByteChannel, GatheringByteChannel
{

	protected DatagramChannel(SelectorProvider selectorProvider)
	{
		super((SelectorProvider)null);
		throw new RuntimeException("Stub!");
	}

	public static DatagramChannel open()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final int validOps()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract DatagramSocket socket();

	public abstract boolean isConnected();

	public abstract DatagramChannel connect(SocketAddress socketaddress)
		throws IOException;

	public abstract DatagramChannel disconnect()
		throws IOException;

	public abstract SocketAddress receive(ByteBuffer bytebuffer)
		throws IOException;

	public abstract int send(ByteBuffer bytebuffer, SocketAddress socketaddress)
		throws IOException;

	public abstract int read(ByteBuffer bytebuffer)
		throws IOException;

	public abstract long read(ByteBuffer abytebuffer[], int i, int j)
		throws IOException;

	public final synchronized long read(ByteBuffer targets[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int write(ByteBuffer bytebuffer)
		throws IOException;

	public abstract long write(ByteBuffer abytebuffer[], int i, int j)
		throws IOException;

	public final synchronized long write(ByteBuffer sources[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
