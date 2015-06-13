// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CharArrayReader.java

package java.io;


// Referenced classes of package java.io:
//			Reader, IOException

public class CharArrayReader extends Reader
{

	protected char buf[];
	protected int pos;
	protected int markedPos;
	protected int count;

	public CharArrayReader(char buf[])
	{
		this.buf = null;
		throw new RuntimeException("Stub!");
	}

	public CharArrayReader(char buf[], int offset, int length)
	{
		this.buf = null;
		throw new RuntimeException("Stub!");
	}

	public void close()
	{
		throw new RuntimeException("Stub!");
	}

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

	public int read(char buffer[], int offset, int len)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

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

	public long skip(long n)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
