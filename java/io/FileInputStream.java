// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FileInputStream.java

package java.io;

import java.nio.channels.FileChannel;

// Referenced classes of package java.io:
//			InputStream, Closeable, FileNotFoundException, IOException, 
//			File, FileDescriptor

public class FileInputStream extends InputStream
	implements Closeable
{

	public FileInputStream(File file)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public FileInputStream(FileDescriptor fd)
	{
		throw new RuntimeException("Stub!");
	}

	public FileInputStream(String fileName)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public int available()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public FileChannel getChannel()
	{
		throw new RuntimeException("Stub!");
	}

	public final FileDescriptor getFD()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte buffer[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte buffer[], int offset, int count)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public long skip(long count)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
