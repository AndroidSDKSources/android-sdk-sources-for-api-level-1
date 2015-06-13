// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FilterInputStream.java

package java.io;


// Referenced classes of package java.io:
//			InputStream, IOException

public class FilterInputStream extends InputStream
{

	protected volatile InputStream in;

	protected FilterInputStream(InputStream in)
	{
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

	public synchronized void mark(int readlimit)
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

	public int read(byte buffer[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte buffer[], int offset, int count)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void reset()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public long skip(long count)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
