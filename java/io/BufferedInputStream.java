// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BufferedInputStream.java

package java.io;


// Referenced classes of package java.io:
//			FilterInputStream, InputStream, IOException

public class BufferedInputStream extends FilterInputStream
{

	protected volatile byte buf[];
	protected int count;
	protected int marklimit;
	protected int markpos;
	protected int pos;

	public BufferedInputStream(InputStream in)
	{
		super((InputStream)null);
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public BufferedInputStream(InputStream in, int size)
	{
		super((InputStream)null);
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public synchronized int available()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void mark(int readlimit)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean markSupported()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int read()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int read(byte buffer[], int offset, int length)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void reset()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized long skip(long amount)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
