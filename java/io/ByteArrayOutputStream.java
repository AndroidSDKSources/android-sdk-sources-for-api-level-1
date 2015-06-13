// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ByteArrayOutputStream.java

package java.io;


// Referenced classes of package java.io:
//			OutputStream, IOException, UnsupportedEncodingException

public class ByteArrayOutputStream extends OutputStream
{

	protected byte buf[];
	protected int count;

	public ByteArrayOutputStream()
	{
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public ByteArrayOutputStream(int size)
	{
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void reset()
	{
		throw new RuntimeException("Stub!");
	}

	public int size()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized byte[] toByteArray()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString(int hibyte)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString(String enc)
		throws UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void write(byte buffer[], int offset, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void write(int oneByte)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void writeTo(OutputStream out)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
