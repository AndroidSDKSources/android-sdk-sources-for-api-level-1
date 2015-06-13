// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Deflater.java

package java.util.zip;


public class Deflater
{

	public static final int BEST_COMPRESSION = 9;
	public static final int BEST_SPEED = 1;
	public static final int DEFAULT_COMPRESSION = -1;
	public static final int DEFAULT_STRATEGY = 0;
	public static final int DEFLATED = 8;
	public static final int FILTERED = 1;
	public static final int HUFFMAN_ONLY = 2;
	public static final int NO_COMPRESSION = 0;

	public Deflater()
	{
		throw new RuntimeException("Stub!");
	}

	public Deflater(int level)
	{
		throw new RuntimeException("Stub!");
	}

	public Deflater(int level, boolean noHeader)
	{
		throw new RuntimeException("Stub!");
	}

	public int deflate(byte buf[])
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int deflate(byte buf[], int off, int nbytes)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void end()
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void finish()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean finished()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getAdler()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getTotalIn()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getTotalOut()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean needsInput()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void reset()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDictionary(byte buf[])
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setDictionary(byte buf[], int off, int nbytes)
	{
		throw new RuntimeException("Stub!");
	}

	public void setInput(byte buf[])
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setInput(byte buf[], int off, int nbytes)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setLevel(int level)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setStrategy(int strategy)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized long getBytesRead()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized long getBytesWritten()
	{
		throw new RuntimeException("Stub!");
	}
}
