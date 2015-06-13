// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Pipe.java

package java.nio.channels;

import java.io.IOException;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.SelectorProvider;

// Referenced classes of package java.nio.channels:
//			ReadableByteChannel, ScatteringByteChannel, WritableByteChannel, GatheringByteChannel

public abstract class Pipe
{
	public static abstract class SourceChannel extends AbstractSelectableChannel
		implements ReadableByteChannel, ScatteringByteChannel
	{

		public final int validOps()
		{
			throw new RuntimeException("Stub!");
		}

		protected SourceChannel(SelectorProvider provider)
		{
			super((SelectorProvider)null);
			throw new RuntimeException("Stub!");
		}
	}

	public static abstract class SinkChannel extends AbstractSelectableChannel
		implements WritableByteChannel, GatheringByteChannel
	{

		public final int validOps()
		{
			throw new RuntimeException("Stub!");
		}

		protected SinkChannel(SelectorProvider provider)
		{
			super((SelectorProvider)null);
			throw new RuntimeException("Stub!");
		}
	}


	protected Pipe()
	{
		throw new RuntimeException("Stub!");
	}

	public static Pipe open()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract SinkChannel sink();

	public abstract SourceChannel source();
}
