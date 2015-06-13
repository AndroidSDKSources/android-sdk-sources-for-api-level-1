// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ByteArrayInputStream.java

package java.io;


// Referenced classes of package java.io:
//			InputStream, IOException

public class ByteArrayInputStream extends InputStream
{

	protected byte buf[];
	protected int pos;
	protected int mark;
	protected int count;

	public ByteArrayInputStream(byte buf[])
	{
		this.buf = null;
		throw new RuntimeException("Stub!");
	}

	public ByteArrayInputStream(byte buf[], int offset, int length)
	{
		this.buf = null;
		throw new RuntimeException("Stub!");
	}

	public synchronized int available()
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
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
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int read(byte b[], int offset, int length)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void reset()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized long skip(long n)
	{
		throw new RuntimeException("Stub!");
	}
}
