// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ZipFile.java

package java.util.zip;

import java.io.*;
import java.util.Enumeration;

// Referenced classes of package java.util.zip:
//			ZipException, ZipEntry

public class ZipFile
{

	public static final int OPEN_READ = 1;
	public static final int OPEN_DELETE = 4;

	public ZipFile(File file)
		throws ZipException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public ZipFile(File file, int mode)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public ZipFile(String name)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Enumeration entries()
	{
		throw new RuntimeException("Stub!");
	}

	public ZipEntry getEntry(String entryName)
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream getInputStream(ZipEntry entry)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public int size()
	{
		throw new RuntimeException("Stub!");
	}
}
