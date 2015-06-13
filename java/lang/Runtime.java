// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Runtime.java

package java.lang;

import java.io.*;

// Referenced classes of package java.lang:
//			Object, RuntimeException, String, Process, 
//			Thread

public class Runtime
{

	Runtime()
	{
		throw new RuntimeException("Stub!");
	}

	public Process exec(String progArray[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Process exec(String progArray[], String envp[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Process exec(String progArray[], String envp[], File directory)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Process exec(String prog)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Process exec(String prog, String envp[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Process exec(String prog, String envp[], File directory)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void exit(int code)
	{
		throw new RuntimeException("Stub!");
	}

	public native long freeMemory();

	public native void gc();

	public static Runtime getRuntime()
	{
		throw new RuntimeException("Stub!");
	}

	public void load(String pathName)
	{
		throw new RuntimeException("Stub!");
	}

	public void loadLibrary(String libName)
	{
		throw new RuntimeException("Stub!");
	}

	public void runFinalization()
	{
		throw new RuntimeException("Stub!");
	}

	public static void runFinalizersOnExit(boolean run)
	{
		throw new RuntimeException("Stub!");
	}

	public native long totalMemory();

	public void traceInstructions(boolean enable)
	{
		throw new RuntimeException("Stub!");
	}

	public void traceMethodCalls(boolean enable)
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream getLocalizedInputStream(InputStream stream)
	{
		throw new RuntimeException("Stub!");
	}

	public OutputStream getLocalizedOutputStream(OutputStream stream)
	{
		throw new RuntimeException("Stub!");
	}

	public void addShutdownHook(Thread hook)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean removeShutdownHook(Thread hook)
	{
		throw new RuntimeException("Stub!");
	}

	public void halt(int code)
	{
		throw new RuntimeException("Stub!");
	}

	public int availableProcessors()
	{
		throw new RuntimeException("Stub!");
	}

	public native long maxMemory();
}
