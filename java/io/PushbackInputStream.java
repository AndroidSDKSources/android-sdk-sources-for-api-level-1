// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PushbackInputStream.java

package java.io;


// Referenced classes of package java.io:
//			FilterInputStream, InputStream, IOException

public class PushbackInputStream extends FilterInputStream
{

	protected byte buf[];
	protected int pos;

	public PushbackInputStream(InputStream in)
	{
		super((InputStream)null);
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public PushbackInputStream(InputStream in, int size)
	{
		super((InputStream)null);
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public int available()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
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

	public int read(byte buffer[], int offset, int length)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public long skip(long count)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void unread(byte buffer[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void unread(byte buffer[], int offset, int length)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void unread(int oneByte)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void mark(int readlimit)
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
