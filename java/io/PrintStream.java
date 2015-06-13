// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PrintStream.java

package java.io;

import java.util.Locale;

// Referenced classes of package java.io:
//			FilterOutputStream, OutputStream, Closeable, UnsupportedEncodingException, 
//			FileNotFoundException, IOException, File

public class PrintStream extends FilterOutputStream
	implements Appendable, Closeable
{

	public PrintStream(OutputStream out)
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(OutputStream out, boolean autoflush)
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(OutputStream out, boolean autoflush, String enc)
		throws UnsupportedEncodingException
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(File file)
		throws FileNotFoundException
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(File file, String csn)
		throws FileNotFoundException, UnsupportedEncodingException
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(String fileName)
		throws FileNotFoundException
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	public PrintStream(String fileName, String csn)
		throws FileNotFoundException, UnsupportedEncodingException
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	public boolean checkError()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void close()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void flush()
	{
		throw new RuntimeException("Stub!");
	}

	public transient PrintStream format(String format, Object args[])
	{
		throw new RuntimeException("Stub!");
	}

	public transient PrintStream format(Locale l, String format, Object args[])
	{
		throw new RuntimeException("Stub!");
	}

	public transient PrintStream printf(String format, Object args[])
	{
		throw new RuntimeException("Stub!");
	}

	public transient PrintStream printf(Locale l, String format, Object args[])
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

	public synchronized void print(String str)
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

	public synchronized void println(String str)
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

	public void write(byte buffer[], int offset, int count)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void write(int oneByte)
	{
		throw new RuntimeException("Stub!");
	}

	public PrintStream append(char c)
	{
		throw new RuntimeException("Stub!");
	}

	public PrintStream append(CharSequence csq)
	{
		throw new RuntimeException("Stub!");
	}

	public PrintStream append(CharSequence csq, int start, int end)
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
