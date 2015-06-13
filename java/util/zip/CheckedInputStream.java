// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CheckedInputStream.java

package java.util.zip;

import java.io.*;

// Referenced classes of package java.util.zip:
//			Checksum

public class CheckedInputStream extends FilterInputStream
{

	public CheckedInputStream(InputStream is, Checksum csum)
	{
		super((InputStream)null);
		throw new RuntimeException("Stub!");
	}

	public int read()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte buf[], int off, int nbytes)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Checksum getChecksum()
	{
		throw new RuntimeException("Stub!");
	}

	public long skip(long nbytes)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
