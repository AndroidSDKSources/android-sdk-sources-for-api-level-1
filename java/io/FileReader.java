// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FileReader.java

package java.io;

import java.nio.charset.Charset;

// Referenced classes of package java.io:
//			InputStreamReader, InputStream, FileNotFoundException, File, 
//			FileDescriptor

public class FileReader extends InputStreamReader
{

	public FileReader(File file)
		throws FileNotFoundException
	{
		super((InputStream)null, (Charset)null);
		throw new RuntimeException("Stub!");
	}

	public FileReader(FileDescriptor fd)
	{
		super((InputStream)null, (Charset)null);
		throw new RuntimeException("Stub!");
	}

	public FileReader(String filename)
		throws FileNotFoundException
	{
		super((InputStream)null, (Charset)null);
		throw new RuntimeException("Stub!");
	}
}
