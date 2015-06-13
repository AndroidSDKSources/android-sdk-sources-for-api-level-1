// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FilterWriter.java

package java.io;


// Referenced classes of package java.io:
//			Writer, IOException

public abstract class FilterWriter extends Writer
{

	protected Writer out;

	protected FilterWriter(Writer out)
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

	public void write(char buffer[], int offset, int count)
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
