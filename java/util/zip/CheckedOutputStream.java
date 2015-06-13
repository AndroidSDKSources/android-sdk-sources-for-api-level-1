// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CheckedOutputStream.java

package java.util.zip;

import java.io.*;

// Referenced classes of package java.util.zip:
//			Checksum

public class CheckedOutputStream extends FilterOutputStream
{

	public CheckedOutputStream(OutputStream os, Checksum cs)
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	public Checksum getChecksum()
	{
		throw new RuntimeException("Stub!");
	}

	public void write(int val)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte buf[], int off, int nbytes)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
