// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Handler.java

package java.util.logging;

import java.io.UnsupportedEncodingException;

// Referenced classes of package java.util.logging:
//			LogRecord, ErrorManager, Filter, Formatter, 
//			Level

public abstract class Handler
{

	protected Handler()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void close();

	public abstract void flush();

	public abstract void publish(LogRecord logrecord);

	public String getEncoding()
	{
		throw new RuntimeException("Stub!");
	}

	public ErrorManager getErrorManager()
	{
		throw new RuntimeException("Stub!");
	}

	public Filter getFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter getFormatter()
	{
		throw new RuntimeException("Stub!");
	}

	public Level getLevel()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isLoggable(LogRecord record)
	{
		throw new RuntimeException("Stub!");
	}

	protected void reportError(String msg, Exception ex, int code)
	{
		throw new RuntimeException("Stub!");
	}

	public void setEncoding(String encoding)
		throws SecurityException, UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public void setErrorManager(ErrorManager em)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFilter(Filter newFilter)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFormatter(Formatter newFormatter)
	{
		throw new RuntimeException("Stub!");
	}

	public void setLevel(Level newLevel)
	{
		throw new RuntimeException("Stub!");
	}
}
