// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StreamHandler.java

package java.util.logging;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

// Referenced classes of package java.util.logging:
//			Handler, Formatter, LogRecord

public class StreamHandler extends Handler
{

	public StreamHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public StreamHandler(OutputStream os, Formatter formatter)
	{
		throw new RuntimeException("Stub!");
	}

	protected void setOutputStream(OutputStream os)
	{
		throw new RuntimeException("Stub!");
	}

	public void setEncoding(String encoding)
		throws SecurityException, UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
	{
		throw new RuntimeException("Stub!");
	}

	public void flush()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void publish(LogRecord record)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isLoggable(LogRecord record)
	{
		throw new RuntimeException("Stub!");
	}
}
