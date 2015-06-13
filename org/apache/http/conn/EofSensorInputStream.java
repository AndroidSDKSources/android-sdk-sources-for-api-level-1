// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EofSensorInputStream.java

package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.apache.http.conn:
//			ConnectionReleaseTrigger, EofSensorWatcher

public class EofSensorInputStream extends InputStream
	implements ConnectionReleaseTrigger
{

	protected InputStream wrappedStream;

	public EofSensorInputStream(InputStream in, EofSensorWatcher watcher)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean isReadAllowed()
		throws IOException
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

	public int available()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void checkEOF(int eof)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void checkClose()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void checkAbort()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void releaseConnection()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void abortConnection()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
