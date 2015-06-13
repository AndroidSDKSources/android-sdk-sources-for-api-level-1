// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractSessionInputBuffer.java

package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

public abstract class AbstractSessionInputBuffer
	implements SessionInputBuffer
{

	public AbstractSessionInputBuffer()
	{
		throw new RuntimeException("Stub!");
	}

	protected void init(InputStream instream, int buffersize, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	protected int fillBuffer()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean hasBufferedData()
	{
		throw new RuntimeException("Stub!");
	}

	public int read()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte b[], int off, int len)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte b[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int readLine(CharArrayBuffer charbuffer)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String readLine()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public HttpTransportMetrics getMetrics()
	{
		throw new RuntimeException("Stub!");
	}
}
