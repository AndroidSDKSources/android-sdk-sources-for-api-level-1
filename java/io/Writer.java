// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Writer.java

package java.io;


// Referenced classes of package java.io:
//			Closeable, Flushable, IOException

public abstract class Writer
	implements Appendable, Closeable, Flushable
{

	protected Object lock;

	protected Writer()
	{
		throw new RuntimeException("Stub!");
	}

	protected Writer(Object lock)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void close()
		throws IOException;

	public abstract void flush()
		throws IOException;

	public void write(char buf[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void write(char ac[], int i, int j)
		throws IOException;

	public void write(int oneChar)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(String str)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(String str, int offset, int count)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Writer append(char c)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Writer append(CharSequence csq)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Writer append(CharSequence csq, int start, int end)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public volatile Appendable append(CharSequence x0, int x1, int x2)
		throws IOException
	{
		return append(x0, x1, x2);
	}

	public volatile Appendable append(CharSequence x0)
		throws IOException
	{
		return append(x0);
	}

	public volatile Appendable append(char x0)
		throws IOException
	{
		return append(x0);
	}
}
