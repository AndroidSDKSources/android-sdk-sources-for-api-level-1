// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LogManager.java

package java.util.logging;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

// Referenced classes of package java.util.logging:
//			Logger

public class LogManager
{

	public static final String LOGGING_MXBEAN_NAME = "java.util.logging:type=Logging";

	protected LogManager()
	{
		throw new RuntimeException("Stub!");
	}

	public void checkAccess()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean addLogger(Logger logger)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Logger getLogger(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Enumeration getLoggerNames()
	{
		throw new RuntimeException("Stub!");
	}

	public static LogManager getLogManager()
	{
		throw new RuntimeException("Stub!");
	}

	public String getProperty(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public void readConfiguration()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void readConfiguration(InputStream ins)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
	{
		throw new RuntimeException("Stub!");
	}
}
