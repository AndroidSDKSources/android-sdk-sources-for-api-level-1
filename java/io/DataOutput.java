// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DataOutput.java

package java.io;


// Referenced classes of package java.io:
//			IOException

public interface DataOutput
{

	public abstract void write(byte abyte0[])
		throws IOException;

	public abstract void write(byte abyte0[], int i, int j)
		throws IOException;

	public abstract void write(int i)
		throws IOException;

	public abstract void writeBoolean(boolean flag)
		throws IOException;

	public abstract void writeByte(int i)
		throws IOException;

	public abstract void writeBytes(String s)
		throws IOException;

	public abstract void writeChar(int i)
		throws IOException;

	public abstract void writeChars(String s)
		throws IOException;

	public abstract void writeDouble(double d)
		throws IOException;

	public abstract void writeFloat(float f)
		throws IOException;

	public abstract void writeInt(int i)
		throws IOException;

	public abstract void writeLong(long l)
		throws IOException;

	public abstract void writeShort(int i)
		throws IOException;

	public abstract void writeUTF(String s)
		throws IOException;
}
