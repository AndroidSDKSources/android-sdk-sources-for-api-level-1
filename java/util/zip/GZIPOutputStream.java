// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   GZIPOutputStream.java

package java.util.zip;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package java.util.zip:
//			DeflaterOutputStream, Deflater, CRC32

public class GZIPOutputStream extends DeflaterOutputStream
{

	protected CRC32 crc;

	public GZIPOutputStream(OutputStream os)
		throws IOException
	{
		super((OutputStream)null, (Deflater)null, 0);
		throw new RuntimeException("Stub!");
	}

	public GZIPOutputStream(OutputStream os, int size)
		throws IOException
	{
		super((OutputStream)null, (Deflater)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void finish()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte buffer[], int off, int nbytes)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
