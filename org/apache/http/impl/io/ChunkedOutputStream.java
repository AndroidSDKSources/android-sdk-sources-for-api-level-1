// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ChunkedOutputStream.java

package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;

public class ChunkedOutputStream extends OutputStream
{

	public ChunkedOutputStream(SessionOutputBuffer out, int bufferSize)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public ChunkedOutputStream(SessionOutputBuffer out)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void flushCache()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void flushCacheWithAppend(byte bufferToAppend[], int off, int len)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void writeClosingChunk()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void finish()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(int b)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte b[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte src[], int off, int len)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void flush()
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
