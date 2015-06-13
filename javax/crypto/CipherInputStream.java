// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CipherInputStream.java

package javax.crypto;

import java.io.*;

// Referenced classes of package javax.crypto:
//			Cipher

public class CipherInputStream extends FilterInputStream
{

	public CipherInputStream(InputStream is, Cipher c)
	{
		super((InputStream)null);
		throw new RuntimeException("Stub!");
	}

	protected CipherInputStream(InputStream is)
	{
		super((InputStream)null);
		throw new RuntimeException("Stub!");
	}

	public int read()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte b[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte b[], int off, int len)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public long skip(long n)
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

	public boolean markSupported()
	{
		throw new RuntimeException("Stub!");
	}
}
