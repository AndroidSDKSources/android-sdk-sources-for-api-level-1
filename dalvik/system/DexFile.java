// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DexFile.java

package dalvik.system;

import java.io.*;
import java.util.Enumeration;

public final class DexFile
{

	public DexFile(File file)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public DexFile(String fileName)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Class loadClass(String name, ClassLoader loader)
	{
		throw new RuntimeException("Stub!");
	}

	public Enumeration entries()
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public static native boolean isDexOptNeeded(String s)
		throws FileNotFoundException, IOException;
}
