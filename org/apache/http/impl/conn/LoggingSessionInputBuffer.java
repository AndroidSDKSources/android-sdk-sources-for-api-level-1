// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LoggingSessionInputBuffer.java

package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.impl.conn:
//			Wire

public class LoggingSessionInputBuffer
	implements SessionInputBuffer
{

	public LoggingSessionInputBuffer(SessionInputBuffer in, Wire wire)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isDataAvailable(int timeout)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte b[], int off, int len)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte b[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String readLine()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int readLine(CharArrayBuffer buffer)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public HttpTransportMetrics getMetrics()
	{
		throw new RuntimeException("Stub!");
	}
}
