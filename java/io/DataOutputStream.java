// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DataOutputStream.java

package java.io;


// Referenced classes of package java.io:
//			FilterOutputStream, OutputStream, DataOutput, IOException

public class DataOutputStream extends FilterOutputStream
	implements DataOutput
{

	protected int written;

	public DataOutputStream(OutputStream out)
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	public void flush()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final int size()
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
