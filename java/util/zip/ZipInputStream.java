// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ZipInputStream.java

package java.util.zip;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package java.util.zip:
//			InflaterInputStream, Inflater, ZipEntry

public class ZipInputStream extends InflaterInputStream
{

	public ZipInputStream(InputStream stream)
	{
		super((InputStream)null, (Inflater)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void closeEntry()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public ZipEntry getNextEntry()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte buffer[], int start, int length)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public long skip(long value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int available()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected ZipEntry createZipEntry(String name)
	{
		throw new RuntimeException("Stub!");
	}
}
