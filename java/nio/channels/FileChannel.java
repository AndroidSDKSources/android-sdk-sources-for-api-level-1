// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FileChannel.java

package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.spi.AbstractInterruptibleChannel;

// Referenced classes of package java.nio.channels:
//			GatheringByteChannel, ScatteringByteChannel, ByteChannel, FileLock, 
//			ReadableByteChannel, WritableByteChannel

public abstract class FileChannel extends AbstractInterruptibleChannel
	implements GatheringByteChannel, ScatteringByteChannel, ByteChannel
{
	public static class MapMode
	{

		public static final MapMode PRIVATE = null;
		public static final MapMode READ_ONLY = null;
		public static final MapMode READ_WRITE = null;

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}


		MapMode()
		{
			throw new RuntimeException("Stub!");
		}
	}


	protected FileChannel()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void force(boolean flag)
		throws IOException;

	public final FileLock lock()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract FileLock lock(long l, long l1, boolean flag)
		throws IOException;

	public abstract MappedByteBuffer map(MapMode mapmode, long l, long l1)
		throws IOException;

	public abstract long position()
		throws IOException;

	public abstract FileChannel position(long l)
		throws IOException;

	public abstract int read(ByteBuffer bytebuffer)
		throws IOException;

	public abstract int read(ByteBuffer bytebuffer, long l)
		throws IOException;

	public final long read(ByteBuffer buffers[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract long read(ByteBuffer abytebuffer[], int i, int j)
		throws IOException;

	public abstract long size()
		throws IOException;

	public abstract long transferFrom(ReadableByteChannel readablebytechannel, long l, long l1)
		throws IOException;

	public abstract long transferTo(long l, long l1, WritableByteChannel writablebytechannel)
		throws IOException;

	public abstract FileChannel truncate(long l)
		throws IOException;

	public final FileLock tryLock()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract FileLock tryLock(long l, long l1, boolean flag)
		throws IOException;

	public abstract int write(ByteBuffer bytebuffer)
		throws IOException;

	public abstract int write(ByteBuffer bytebuffer, long l)
		throws IOException;

	public final long write(ByteBuffer buffers[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract long write(ByteBuffer abytebuffer[], int i, int j)
		throws IOException;
}
