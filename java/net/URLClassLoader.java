// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   URLClassLoader.java

package java.net;

import java.io.IOException;
import java.security.*;
import java.util.Enumeration;
import java.util.jar.Manifest;

// Referenced classes of package java.net:
//			URL, URLStreamHandlerFactory

public class URLClassLoader extends SecureClassLoader
{

	public URLClassLoader(URL urls[])
	{
		throw new RuntimeException("Stub!");
	}

	public URLClassLoader(URL urls[], ClassLoader parent)
	{
		throw new RuntimeException("Stub!");
	}

	public URLClassLoader(URL searchUrls[], ClassLoader parent, URLStreamHandlerFactory factory)
	{
		throw new RuntimeException("Stub!");
	}

	protected void addURL(URL url)
	{
		throw new RuntimeException("Stub!");
	}

	public Enumeration findResources(String name)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected PermissionCollection getPermissions(CodeSource codesource)
	{
		throw new RuntimeException("Stub!");
	}

	public URL[] getURLs()
	{
		throw new RuntimeException("Stub!");
	}

	public static URLClassLoader newInstance(URL urls[])
	{
		throw new RuntimeException("Stub!");
	}

	public static URLClassLoader newInstance(URL urls[], ClassLoader parentCl)
	{
		throw new RuntimeException("Stub!");
	}

	protected Class findClass(String clsName)
		throws ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public URL findResource(String name)
	{
		throw new RuntimeException("Stub!");
	}

	protected Package definePackage(String packageName, Manifest manifest, URL url)
		throws IllegalArgumentException
	{
		throw new RuntimeException("Stub!");
	}
}
