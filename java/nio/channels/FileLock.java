// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FileLock.java

package java.nio.channels;

import java.io.IOException;

// Referenced classes of package java.nio.channels:
//			FileChannel

public abstract class FileLock
{

	protected FileLock(FileChannel channel, long position, long size, boolean shared)
	{
		throw new RuntimeException("Stub!");
	}

	public final FileChannel channel()
	{
		throw new RuntimeException("Stub!");
	}

	public final long position()
	{
		throw new RuntimeException("Stub!");
	}

	public final long size()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isShared()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean overlaps(long start, long length)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isValid();

	public abstract void release()
		throws IOException;

	public final String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
