// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractInterruptibleChannel.java

package java.nio.channels.spi;

import java.io.IOException;
import java.nio.channels.*;

public abstract class AbstractInterruptibleChannel
	implements Channel, InterruptibleChannel
{

	protected AbstractInterruptibleChannel()
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized boolean isOpen()
	{
		throw new RuntimeException("Stub!");
	}

	public final void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected final void begin()
	{
		throw new RuntimeException("Stub!");
	}

	protected final void end(boolean success)
		throws AsynchronousCloseException
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void implCloseChannel()
		throws IOException;
}
