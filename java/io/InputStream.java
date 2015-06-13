// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InputStream.java

package java.io;


// Referenced classes of package java.io:
//			Closeable, IOException

public abstract class InputStream
	implements Closeable
{

	public InputStream()
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

	public void mark(int readlimit)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean markSupported()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int read()
		throws IOException;

	public int read(byte b[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte b[], int offset, int length)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void reset()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public long skip(long n)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
