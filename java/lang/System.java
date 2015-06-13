// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   System.java

package java.lang;

import java.io.*;
import java.nio.channels.Channel;
import java.util.Map;
import java.util.Properties;

// Referenced classes of package java.lang:
//			Object, RuntimeException, String, SecurityManager

public final class System
{

	public static final InputStream in = null;
	public static final PrintStream out = null;
	public static final PrintStream err = null;

	System()
	{
		throw new RuntimeException("Stub!");
	}

	public static void setIn(InputStream newIn)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setOut(PrintStream newOut)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setErr(PrintStream newErr)
	{
		throw new RuntimeException("Stub!");
	}

	public static native void arraycopy(Object obj, int i, Object obj1, int j, int k);

	public static native long currentTimeMillis();

	public static native long nanoTime();

	public static void exit(int code)
	{
		throw new RuntimeException("Stub!");
	}

	public static void gc()
	{
		throw new RuntimeException("Stub!");
	}

	public static String getenv(String var)
	{
		throw new RuntimeException("Stub!");
	}

	public static Map getenv()
	{
		throw new RuntimeException("Stub!");
	}

	public static Channel inheritedChannel()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public static Properties getProperties()
	{
		throw new RuntimeException("Stub!");
	}

	public static String getProperty(String prop)
	{
		throw new RuntimeException("Stub!");
	}

	public static String getProperty(String prop, String defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public static String setProperty(String prop, String value)
	{
		throw new RuntimeException("Stub!");
	}

	public static String clearProperty(String key)
	{
		throw new RuntimeException("Stub!");
	}

	public static SecurityManager getSecurityManager()
	{
		throw new RuntimeException("Stub!");
	}

	public static native int identityHashCode(Object obj);

	public static void load(String pathName)
	{
		throw new RuntimeException("Stub!");
	}

	public static void loadLibrary(String libName)
	{
		throw new RuntimeException("Stub!");
	}

	public static void runFinalization()
	{
		throw new RuntimeException("Stub!");
	}

	public static void runFinalizersOnExit(boolean flag)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setProperties(Properties p)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setSecurityManager(SecurityManager sm)
	{
		throw new RuntimeException("Stub!");
	}

	public static native String mapLibraryName(String s);

}
