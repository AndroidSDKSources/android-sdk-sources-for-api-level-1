// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SelectableChannel.java

package java.nio.channels;

import java.io.IOException;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.nio.channels.spi.SelectorProvider;

// Referenced classes of package java.nio.channels:
//			Channel, ClosedChannelException, Selector, SelectionKey

public abstract class SelectableChannel extends AbstractInterruptibleChannel
	implements Channel
{

	protected SelectableChannel()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Object blockingLock();

	public abstract SelectableChannel configureBlocking(boolean flag)
		throws IOException;

	public abstract boolean isBlocking();

	public abstract boolean isRegistered();

	public abstract SelectionKey keyFor(Selector selector);

	public abstract SelectorProvider provider();

	public final SelectionKey register(Selector selector, int operations)
		throws ClosedChannelException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract SelectionKey register(Selector selector, int i, Object obj)
		throws ClosedChannelException;

	public abstract int validOps();
}
