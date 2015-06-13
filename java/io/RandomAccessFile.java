// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RandomAccessFile.java

package java.io;

import java.nio.channels.FileChannel;

// Referenced classes of package java.io:
//			DataInput, DataOutput, Closeable, FileNotFoundException, 
//			IOException, File, FileDescriptor

public class RandomAccessFile
	implements DataInput, DataOutput, Closeable
{

	public RandomAccessFile(File file, String mode)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public RandomAccessFile(String fileName, String mode)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized FileChannel getChannel()
	{
		throw new RuntimeException("Stub!");
	}

	public final FileDescriptor getFD()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public long getFilePointer()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public long length()
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

	public final boolean readBoolean()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final byte readByte()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final char readChar()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final double readDouble()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final float readFloat()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void readFully(byte buffer[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void readFully(byte buffer[], int offset, int count)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final int readInt()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final String readLine()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final long readLong()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final short readShort()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final int readUnsignedByte()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final int readUnsignedShort()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final String readUTF()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void seek(long pos)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setLength(long newLength)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int skipBytes(int count)
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

	public final void writeBoolean(boolean val)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeByte(int val)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeBytes(String str)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeChar(int val)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeChars(String str)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeDouble(double val)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeFloat(float val)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeInt(int val)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeLong(long val)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeShort(int val)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeUTF(String str)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
