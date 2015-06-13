// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   OutputStream.java

package java.io;


// Referenced classes of package java.io:
//			Closeable, Flushable, IOException

public abstract class OutputStream
	implements Closeable, Flushable
{

	public OutputStream()
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void flush()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte buffer[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte buffer[], int offset, int count)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void write(int i)
		throws IOException;
}
