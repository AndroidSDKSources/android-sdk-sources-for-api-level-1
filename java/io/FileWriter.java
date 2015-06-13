// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FileWriter.java

package java.io;

import java.nio.charset.CharsetEncoder;

// Referenced classes of package java.io:
//			OutputStreamWriter, OutputStream, IOException, File, 
//			FileDescriptor

public class FileWriter extends OutputStreamWriter
{

	public FileWriter(File file)
		throws IOException
	{
		super((OutputStream)null, (CharsetEncoder)null);
		throw new RuntimeException("Stub!");
	}

	public FileWriter(File file, boolean append)
		throws IOException
	{
		super((OutputStream)null, (CharsetEncoder)null);
		throw new RuntimeException("Stub!");
	}

	public FileWriter(FileDescriptor fd)
	{
		super((OutputStream)null, (CharsetEncoder)null);
		throw new RuntimeException("Stub!");
	}

	public FileWriter(String filename)
		throws IOException
	{
		super((OutputStream)null, (CharsetEncoder)null);
		throw new RuntimeException("Stub!");
	}

	public FileWriter(String filename, boolean append)
		throws IOException
	{
		super((OutputStream)null, (CharsetEncoder)null);
		throw new RuntimeException("Stub!");
	}
}
