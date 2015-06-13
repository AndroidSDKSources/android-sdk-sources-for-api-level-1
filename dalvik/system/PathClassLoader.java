// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PathClassLoader.java

package dalvik.system;

import java.net.URL;

public class PathClassLoader extends ClassLoader
{

	public PathClassLoader(String path, ClassLoader parent)
	{
		throw new RuntimeException("Stub!");
	}

	public PathClassLoader(String path, String libPath, ClassLoader parent)
	{
		throw new RuntimeException("Stub!");
	}

	protected Class findClass(String name)
		throws ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	protected URL findResource(String name)
	{
		throw new RuntimeException("Stub!");
	}

	protected String findLibrary(String libname)
	{
		throw new RuntimeException("Stub!");
	}

	protected Package getPackage(String name)
	{
		throw new RuntimeException("Stub!");
	}
}
