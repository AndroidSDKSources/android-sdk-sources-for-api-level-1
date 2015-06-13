// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Logger.java

package java.util.logging;

import java.util.ResourceBundle;

// Referenced classes of package java.util.logging:
//			Handler, Filter, Level, LogRecord

public class Logger
{

	public static final Logger global = null;

	protected Logger(String name, String resourceBundleName)
	{
		throw new RuntimeException("Stub!");
	}

	public static Logger getAnonymousLogger()
	{
		throw new RuntimeException("Stub!");
	}

	public static Logger getAnonymousLogger(String resourceBundleName)
	{
		throw new RuntimeException("Stub!");
	}

	public static Logger getLogger(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public static Logger getLogger(String name, String resourceBundleName)
	{
		throw new RuntimeException("Stub!");
	}

	public void addHandler(Handler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public Handler[] getHandlers()
	{
		throw new RuntimeException("Stub!");
	}

	public void removeHandler(Handler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public Filter getFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public void setFilter(Filter newFilter)
	{
		throw new RuntimeException("Stub!");
	}

	public Level getLevel()
	{
		throw new RuntimeException("Stub!");
	}

	public void setLevel(Level newLevel)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getUseParentHandlers()
	{
		throw new RuntimeException("Stub!");
	}

	public void setUseParentHandlers(boolean notifyParentHandlers)
	{
		throw new RuntimeException("Stub!");
	}

	public Logger getParent()
	{
		throw new RuntimeException("Stub!");
	}

	public void setParent(Logger parent)
	{
		throw new RuntimeException("Stub!");
	}

	public String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public ResourceBundle getResourceBundle()
	{
		throw new RuntimeException("Stub!");
	}

	public String getResourceBundleName()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isLoggable(Level l)
	{
		throw new RuntimeException("Stub!");
	}

	public void entering(String sourceClass, String sourceMethod)
	{
		throw new RuntimeException("Stub!");
	}

	public void entering(String sourceClass, String sourceMethod, Object param)
	{
		throw new RuntimeException("Stub!");
	}

	public void entering(String sourceClass, String sourceMethod, Object params[])
	{
		throw new RuntimeException("Stub!");
	}

	public void exiting(String sourceClass, String sourceMethod)
	{
		throw new RuntimeException("Stub!");
	}

	public void exiting(String sourceClass, String sourceMethod, Object result)
	{
		throw new RuntimeException("Stub!");
	}

	public void throwing(String sourceClass, String sourceMethod, Throwable thrown)
	{
		throw new RuntimeException("Stub!");
	}

	public void severe(String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void warning(String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void info(String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void config(String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void fine(String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void finer(String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void finest(String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void log(Level logLevel, String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void log(Level logLevel, String msg, Object param)
	{
		throw new RuntimeException("Stub!");
	}

	public void log(Level logLevel, String msg, Object params[])
	{
		throw new RuntimeException("Stub!");
	}

	public void log(Level logLevel, String msg, Throwable thrown)
	{
		throw new RuntimeException("Stub!");
	}

	public void log(LogRecord record)
	{
		throw new RuntimeException("Stub!");
	}

	public void logp(Level logLevel, String sourceClass, String sourceMethod, String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void logp(Level logLevel, String sourceClass, String sourceMethod, String msg, Object param)
	{
		throw new RuntimeException("Stub!");
	}

	public void logp(Level logLevel, String sourceClass, String sourceMethod, String msg, Object params[])
	{
		throw new RuntimeException("Stub!");
	}

	public void logp(Level logLevel, String sourceClass, String sourceMethod, String msg, Throwable thrown)
	{
		throw new RuntimeException("Stub!");
	}

	public void logrb(Level logLevel, String sourceClass, String sourceMethod, String bundleName, String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void logrb(Level logLevel, String sourceClass, String sourceMethod, String bundleName, String msg, Object param)
	{
		throw new RuntimeException("Stub!");
	}

	public void logrb(Level logLevel, String sourceClass, String sourceMethod, String bundleName, String msg, Object params[])
	{
		throw new RuntimeException("Stub!");
	}

	public void logrb(Level logLevel, String sourceClass, String sourceMethod, String bundleName, String msg, Throwable thrown)
	{
		throw new RuntimeException("Stub!");
	}

}
