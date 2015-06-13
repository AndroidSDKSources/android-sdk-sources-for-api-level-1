// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SelectorProvider.java

package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.*;

// Referenced classes of package java.nio.channels.spi:
//			AbstractSelector

public abstract class SelectorProvider
{

	protected SelectorProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized SelectorProvider provider()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract DatagramChannel openDatagramChannel()
		throws IOException;

	public abstract Pipe openPipe()
		throws IOException;

	public abstract AbstractSelector openSelector()
		throws IOException;

	public abstract ServerSocketChannel openServerSocketChannel()
		throws IOException;

	public abstract SocketChannel openSocketChannel()
		throws IOException;

	public Channel inheritedChannel()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
