// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StringBufferInputStream.java

package java.io;


// Referenced classes of package java.io:
//			InputStream

/**
 * @deprecated Class StringBufferInputStream is deprecated
 */

public class StringBufferInputStream extends InputStream
{

	protected String buffer;
	protected int count;
	protected int pos;

	public StringBufferInputStream(String str)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int available()
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
