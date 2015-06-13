// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PrintWriter.java

package java.io;

import java.util.Locale;

// Referenced classes of package java.io:
//			Writer, FileNotFoundException, UnsupportedEncodingException, IOException, 
//			OutputStream, File

public class PrintWriter extends Writer
{

	protected Writer out;

	public PrintWriter(OutputStream out)
	{
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(OutputStream out, boolean autoflush)
	{
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(Writer wr)
	{
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(Writer wr, boolean autoflush)
	{
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(File file)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(File file, String csn)
		throws FileNotFoundException, UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(String fileName)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public PrintWriter(String fileName, String csn)
		throws FileNotFoundException, UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean checkError()
	{
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

	public transient PrintWriter format(String format, Object args[])
	{
		throw new RuntimeException("Stub!");
	}

	public transient PrintWriter format(Locale l, String format, Object args[])
	{
		throw new RuntimeException("Stub!");
	}

	public transient PrintWriter printf(String format, Object args[])
	{
		throw new RuntimeException("Stub!");
	}

	public transient PrintWriter printf(Locale l, String format, Object args[])
	{
		throw new RuntimeException("Stub!");
	}

	public void print(char charArray[])
	{
		throw new RuntimeException("Stub!");
	}

	public void print(char ch)
	{
		throw new RuntimeException("Stub!");
	}

	public void print(double dnum)
	{
		throw new RuntimeException("Stub!");
	}

	public void print(float fnum)
	{
		throw new RuntimeException("Stub!");
	}

	public void print(int inum)
	{
		throw new RuntimeException("Stub!");
	}

	public void print(long lnum)
	{
		throw new RuntimeException("Stub!");
	}

	public void print(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public void print(String str)
	{
		throw new RuntimeException("Stub!");
	}

	public void print(boolean bool)
	{
		throw new RuntimeException("Stub!");
	}

	public void println()
	{
		throw new RuntimeException("Stub!");
	}

	public void println(char charArray[])
	{
		throw new RuntimeException("Stub!");
	}

	public void println(char ch)
	{
		throw new RuntimeException("Stub!");
	}

	public void println(double dnum)
	{
		throw new RuntimeException("Stub!");
	}

	public void println(float fnum)
	{
		throw new RuntimeException("Stub!");
	}

	public void println(int inum)
	{
		throw new RuntimeException("Stub!");
	}

	public void println(long lnum)
	{
		throw new RuntimeException("Stub!");
	}

	public void println(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public void println(String str)
	{
		throw new RuntimeException("Stub!");
	}

	public void println(boolean bool)
	{
		throw new RuntimeException("Stub!");
	}

	protected void setError()
	{
		throw new RuntimeException("Stub!");
	}

	public void write(char buf[])
	{
		throw new RuntimeException("Stub!");
	}

	public void write(char buf[], int offset, int count)
	{
		throw new RuntimeException("Stub!");
	}

	public void write(int oneChar)
	{
		throw new RuntimeException("Stub!");
	}

	public void write(String str)
	{
		throw new RuntimeException("Stub!");
	}

	public void write(String str, int offset, int count)
	{
		throw new RuntimeException("Stub!");
	}

	public PrintWriter append(char c)
	{
		throw new RuntimeException("Stub!");
	}

	public PrintWriter append(CharSequence csq)
	{
		throw new RuntimeException("Stub!");
	}

	public PrintWriter append(CharSequence csq, int start, int end)
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
