// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ZipOutputStream.java

package java.util.zip;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package java.util.zip:
//			DeflaterOutputStream, Deflater, ZipEntry

public class ZipOutputStream extends DeflaterOutputStream
{

	public static final int DEFLATED = 8;
	public static final int STORED = 0;

	public ZipOutputStream(OutputStream p1)
	{
		super((OutputStream)null, (Deflater)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void closeEntry()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void finish()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void putNextEntry(ZipEntry ze)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setComment(String comment)
	{
		throw new RuntimeException("Stub!");
	}

	public void setLevel(int level)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMethod(int method)
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte buffer[], int off, int nbytes)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
