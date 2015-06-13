// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractSessionOutputBuffer.java

package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

public abstract class AbstractSessionOutputBuffer
	implements SessionOutputBuffer
{

	public AbstractSessionOutputBuffer()
	{
		throw new RuntimeException("Stub!");
	}

	protected void init(OutputStream outstream, int buffersize, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	protected void flushBuffer()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void flush()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte b[], int off, int len)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte b[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(int b)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeLine(String s)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeLine(CharArrayBuffer s)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public HttpTransportMetrics getMetrics()
	{
		throw new RuntimeException("Stub!");
	}
}
