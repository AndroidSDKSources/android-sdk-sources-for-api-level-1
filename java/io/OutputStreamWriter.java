// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   OutputStreamWriter.java

package java.io;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

// Referenced classes of package java.io:
//			Writer, UnsupportedEncodingException, IOException, OutputStream

public class OutputStreamWriter extends Writer
{

	public OutputStreamWriter(OutputStream out)
	{
		throw new RuntimeException("Stub!");
	}

	public OutputStreamWriter(OutputStream out, String enc)
		throws UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public OutputStreamWriter(OutputStream out, Charset cs)
	{
		throw new RuntimeException("Stub!");
	}

	public OutputStreamWriter(OutputStream out, CharsetEncoder enc)
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

	public String getEncoding()
	{
		throw new RuntimeException("Stub!");
	}

	public void write(char buf[], int offset, int count)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(int oneChar)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(String str, int offset, int count)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
