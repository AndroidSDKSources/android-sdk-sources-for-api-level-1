// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Log.java

package android.util;


public final class Log
{

	public static final int VERBOSE = 2;
	public static final int DEBUG = 3;
	public static final int INFO = 4;
	public static final int WARN = 5;
	public static final int ERROR = 6;
	public static final int ASSERT = 7;

	Log()
	{
		throw new RuntimeException("Stub!");
	}

	public static int v(String tag, String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public static int v(String tag, String msg, Throwable tr)
	{
		throw new RuntimeException("Stub!");
	}

	public static int d(String tag, String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public static int d(String tag, String msg, Throwable tr)
	{
		throw new RuntimeException("Stub!");
	}

	public static int i(String tag, String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public static int i(String tag, String msg, Throwable tr)
	{
		throw new RuntimeException("Stub!");
	}

	public static int w(String tag, String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public static int w(String tag, String msg, Throwable tr)
	{
		throw new RuntimeException("Stub!");
	}

	public static native boolean isLoggable(String s, int j);

	public static int w(String tag, Throwable tr)
	{
		throw new RuntimeException("Stub!");
	}

	public static int e(String tag, String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public static int e(String tag, String msg, Throwable tr)
	{
		throw new RuntimeException("Stub!");
	}

	public static String getStackTraceString(Throwable tr)
	{
		throw new RuntimeException("Stub!");
	}

	public static native int println(int j, String s, String s1);
}
