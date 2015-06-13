// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Reader.java

package java.io;

import java.nio.CharBuffer;

// Referenced classes of package java.io:
//			Closeable, IOException

public abstract class Reader
	implements Readable, Closeable
{

	protected Object lock;

	protected Reader()
	{
		throw new RuntimeException("Stub!");
	}

	protected Reader(Object lock)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void close()
		throws IOException;

	public void mark(int readLimit)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean markSupported()
	{
		throw new RuntimeException("Stub!");
	}

	public int read()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(char buf[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int read(char ac[], int i, int j)
		throws IOException;

	public boolean ready()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public long skip(long count)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(CharBuffer target)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
