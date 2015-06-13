// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LoggingSessionOutputBuffer.java

package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.impl.conn:
//			Wire

public class LoggingSessionOutputBuffer
	implements SessionOutputBuffer
{

	public LoggingSessionOutputBuffer(SessionOutputBuffer out, Wire wire)
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte b[], int off, int len)
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

	public void flush()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeLine(CharArrayBuffer buffer)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeLine(String s)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public HttpTransportMetrics getMetrics()
	{
		throw new RuntimeException("Stub!");
	}
}
