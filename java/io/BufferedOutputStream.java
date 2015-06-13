// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BufferedOutputStream.java

package java.io;


// Referenced classes of package java.io:
//			FilterOutputStream, OutputStream, IOException

public class BufferedOutputStream extends FilterOutputStream
{

	protected byte buf[];
	protected int count;

	public BufferedOutputStream(OutputStream out)
	{
		super((OutputStream)null);
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public BufferedOutputStream(OutputStream out, int size)
	{
		super((OutputStream)null);
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public synchronized void flush()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void write(byte buffer[], int offset, int length)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void write(int oneByte)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
