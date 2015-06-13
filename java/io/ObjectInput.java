// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ObjectInput.java

package java.io;


// Referenced classes of package java.io:
//			DataInput, IOException

public interface ObjectInput
	extends DataInput
{

	public abstract int available()
		throws IOException;

	public abstract void close()
		throws IOException;

	public abstract int read()
		throws IOException;

	public abstract int read(byte abyte0[])
		throws IOException;

	public abstract int read(byte abyte0[], int i, int j)
		throws IOException;

	public abstract Object readObject()
		throws ClassNotFoundException, IOException;

	public abstract long skip(long l)
		throws IOException;
}
