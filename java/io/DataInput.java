// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DataInput.java

package java.io;


// Referenced classes of package java.io:
//			IOException

public interface DataInput
{

	public abstract boolean readBoolean()
		throws IOException;

	public abstract byte readByte()
		throws IOException;

	public abstract char readChar()
		throws IOException;

	public abstract double readDouble()
		throws IOException;

	public abstract float readFloat()
		throws IOException;

	public abstract void readFully(byte abyte0[])
		throws IOException;

	public abstract void readFully(byte abyte0[], int i, int j)
		throws IOException;

	public abstract int readInt()
		throws IOException;

	public abstract String readLine()
		throws IOException;

	public abstract long readLong()
		throws IOException;

	public abstract short readShort()
		throws IOException;

	public abstract int readUnsignedByte()
		throws IOException;

	public abstract int readUnsignedShort()
		throws IOException;

	public abstract String readUTF()
		throws IOException;

	public abstract int skipBytes(int i)
		throws IOException;
}
