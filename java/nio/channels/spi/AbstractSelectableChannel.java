// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractSelectableChannel.java

package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.*;

// Referenced classes of package java.nio.channels.spi:
//			SelectorProvider

public abstract class AbstractSelectableChannel extends SelectableChannel
{

	protected AbstractSelectableChannel(SelectorProvider selectorProvider)
	{
		throw new RuntimeException("Stub!");
	}

	public final SelectorProvider provider()
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized boolean isRegistered()
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized SelectionKey keyFor(Selector selector)
	{
		throw new RuntimeException("Stub!");
	}

	public final SelectionKey register(Selector selector, int interestSet, Object attachment)
		throws ClosedChannelException
	{
		throw new RuntimeException("Stub!");
	}

	protected final synchronized void implCloseChannel()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void implCloseSelectableChannel()
		throws IOException;

	public final boolean isBlocking()
	{
		throw new RuntimeException("Stub!");
	}

	public final Object blockingLock()
	{
		throw new RuntimeException("Stub!");
	}

	public final SelectableChannel configureBlocking(boolean blockingMode)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void implConfigureBlocking(boolean flag)
		throws IOException;
}
