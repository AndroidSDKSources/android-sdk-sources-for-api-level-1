// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CharArrayWriter.java

package java.io;


// Referenced classes of package java.io:
//			Writer, IOException

public class CharArrayWriter extends Writer
{

	protected char buf[];
	protected int count;

	public CharArrayWriter()
	{
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public CharArrayWriter(int initialSize)
	{
		buf = null;
		throw new RuntimeException("Stub!");
	}

	public void close()
	{
		throw new RuntimeException("Stub!");
	}

	public void flush()
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
	{
		throw new RuntimeException("Stub!");
	}

	public int size()
	{
		throw new RuntimeException("Stub!");
	}

	public char[] toCharArray()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public void write(char c[], int offset, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public void write(int oneChar)
	{
		throw new RuntimeException("Stub!");
	}

	public void write(String str, int offset, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public void writeTo(Writer out)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public CharArrayWriter append(char c)
	{
		throw new RuntimeException("Stub!");
	}

	public CharArrayWriter append(CharSequence csq)
	{
		throw new RuntimeException("Stub!");
	}

	public CharArrayWriter append(CharSequence csq, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile Writer append(CharSequence x0, int x1, int x2)
		throws IOException
	{
		return append(x0, x1, x2);
	}

	public volatile Writer append(CharSequence x0)
		throws IOException
	{
		return append(x0);
	}

	public volatile Writer append(char x0)
		throws IOException
	{
		return append(x0);
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
