// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   GZIPInputStream.java

package java.util.zip;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package java.util.zip:
//			InflaterInputStream, Inflater, CRC32

public class GZIPInputStream extends InflaterInputStream
{

	protected CRC32 crc;
	protected boolean eos;
	public static final int GZIP_MAGIC = 35615;

	public GZIPInputStream(InputStream is)
		throws IOException
	{
		super((InputStream)null, (Inflater)null, 0);
		throw new RuntimeException("Stub!");
	}

	public GZIPInputStream(InputStream is, int size)
		throws IOException
	{
		super((InputStream)null, (Inflater)null, 0);
		throw new RuntimeException("Stub!");
	}

	public int read(byte buffer[], int off, int nbytes)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
