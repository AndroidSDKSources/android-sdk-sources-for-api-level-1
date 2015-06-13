// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ServerSocketChannel.java

package java.nio.channels;

import java.io.IOException;
import java.net.ServerSocket;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.SelectorProvider;

// Referenced classes of package java.nio.channels:
//			SocketChannel

public abstract class ServerSocketChannel extends AbstractSelectableChannel
{

	protected ServerSocketChannel(SelectorProvider selectorProvider)
	{
		super((SelectorProvider)null);
		throw new RuntimeException("Stub!");
	}

	public static ServerSocketChannel open()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final int validOps()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract ServerSocket socket();

	public abstract SocketChannel accept()
		throws IOException;
}
