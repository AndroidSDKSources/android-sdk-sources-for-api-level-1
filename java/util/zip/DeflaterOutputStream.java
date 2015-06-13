// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DeflaterOutputStream.java

package java.util.zip;

import java.io.*;

// Referenced classes of package java.util.zip:
//			Deflater

public class DeflaterOutputStream extends FilterOutputStream
{

	protected byte buf[];
	protected Deflater def;

	public DeflaterOutputStream(OutputStream os, Deflater def)
	{
		super((OutputStream)null);
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public DeflaterOutputStream(OutputStream os)
	{
		super((OutputStream)null);
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public DeflaterOutputStream(OutputStream os, Deflater def, int bsize)
	{
		super((OutputStream)null);
		buf = null;
		throw new RuntimeException("Stub!");
	}

	protected void deflate()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void finish()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(int i)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte buffer[], int off, int nbytes)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
