// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SocketChannel.java

package java.nio.channels;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.SelectorProvider;

// Referenced classes of package java.nio.channels:
//			ByteChannel, ScatteringByteChannel, GatheringByteChannel

public abstract class SocketChannel extends AbstractSelectableChannel
	implements ByteChannel, ScatteringByteChannel, GatheringByteChannel
{

	protected SocketChannel(SelectorProvider selectorProvider)
	{
		super((SelectorProvider)null);
		throw new RuntimeException("Stub!");
	}

	public static SocketChannel open()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public static SocketChannel open(SocketAddress address)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final int validOps()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Socket socket();

	public abstract boolean isConnected();

	public abstract boolean isConnectionPending();

	public abstract boolean connect(SocketAddress socketaddress)
		throws IOException;

	public abstract boolean finishConnect()
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
