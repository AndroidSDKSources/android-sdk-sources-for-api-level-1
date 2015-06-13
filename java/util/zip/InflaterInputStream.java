// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InflaterInputStream.java

package java.util.zip;

import java.io.*;

// Referenced classes of package java.util.zip:
//			Inflater

public class InflaterInputStream extends FilterInputStream
{

	protected Inflater inf;
	protected byte buf[];
	protected int len;

	public InflaterInputStream(InputStream is)
	{
		super((InputStream)null);
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public InflaterInputStream(InputStream is, Inflater inf)
	{
		super((InputStream)null);
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public InflaterInputStream(InputStream is, Inflater inf, int bsize)
	{
		super((InputStream)null);
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public int read()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte buffer[], int off, int nbytes)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void fill()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public long skip(long nbytes)
		throws IOException
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

	public void reset()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean markSupported()
	{
		throw new RuntimeException("Stub!");
	}
}
