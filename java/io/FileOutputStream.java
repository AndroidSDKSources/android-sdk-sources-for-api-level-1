// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FileOutputStream.java

package java.io;

import java.nio.channels.FileChannel;

// Referenced classes of package java.io:
//			OutputStream, Closeable, FileNotFoundException, IOException, 
//			File, FileDescriptor

public class FileOutputStream extends OutputStream
	implements Closeable
{

	public FileOutputStream(File file)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public FileOutputStream(File file, boolean append)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public FileOutputStream(FileDescriptor fd)
	{
		throw new RuntimeException("Stub!");
	}

	public FileOutputStream(String filename)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public FileOutputStream(String filename, boolean append)
		throws FileNotFoundException
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

	public void write(byte buffer[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte buffer[], int offset, int count)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(int oneByte)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
