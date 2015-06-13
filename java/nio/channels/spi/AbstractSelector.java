// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractSelector.java

package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Set;

// Referenced classes of package java.nio.channels.spi:
//			SelectorProvider, AbstractSelectableChannel, AbstractSelectionKey

public abstract class AbstractSelector extends Selector
{

	protected AbstractSelector(SelectorProvider selectorProvider)
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void implCloseSelector()
		throws IOException;

	public final boolean isOpen()
	{
		throw new RuntimeException("Stub!");
	}

	public final SelectorProvider provider()
	{
		throw new RuntimeException("Stub!");
	}

	protected final Set cancelledKeys()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract SelectionKey register(AbstractSelectableChannel abstractselectablechannel, int i, Object obj);

	protected final void deregister(AbstractSelectionKey key)
	{
		throw new RuntimeException("Stub!");
	}

	protected final void begin()
	{
		throw new RuntimeException("Stub!");
	}

	protected final void end()
	{
		throw new RuntimeException("Stub!");
	}
}
