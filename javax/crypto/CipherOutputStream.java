// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CipherOutputStream.java

package javax.crypto;

import java.io.*;

// Referenced classes of package javax.crypto:
//			Cipher

public class CipherOutputStream extends FilterOutputStream
{

	public CipherOutputStream(OutputStream os, Cipher c)
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	protected CipherOutputStream(OutputStream os)
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	public void write(int b)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte b[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte b[], int off, int len)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void flush()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
