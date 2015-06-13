// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ObjectOutput.java

package java.io;


// Referenced classes of package java.io:
//			DataOutput, IOException

public interface ObjectOutput
	extends DataOutput
{

	public abstract void close()
		throws IOException;

	public abstract void flush()
		throws IOException;

	public abstract void write(byte abyte0[])
		throws IOException;

	public abstract void write(byte abyte0[], int i, int j)
		throws IOException;

	public abstract void write(int i)
		throws IOException;

	public abstract void writeObject(Object obj)
		throws IOException;
}
