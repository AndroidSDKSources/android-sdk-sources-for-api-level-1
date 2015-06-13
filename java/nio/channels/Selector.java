// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Selector.java

package java.nio.channels;

import java.io.IOException;
import java.nio.channels.spi.SelectorProvider;
import java.util.Set;

public abstract class Selector
{

	protected Selector()
	{
		throw new RuntimeException("Stub!");
	}

	public static Selector open()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void close()
		throws IOException;

	public abstract boolean isOpen();

	public abstract Set keys();

	public abstract SelectorProvider provider();

	public abstract int select()
		throws IOException;

	public abstract int select(long l)
		throws IOException;

	public abstract Set selectedKeys();

	public abstract int selectNow()
		throws IOException;

	public abstract Selector wakeup();
}
