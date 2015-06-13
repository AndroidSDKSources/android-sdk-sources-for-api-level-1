// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ClassLoader.java

package java.lang;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.ProtectionDomain;
import java.util.Enumeration;

// Referenced classes of package java.lang:
//			Object, RuntimeException, ClassFormatError, ClassNotFoundException, 
//			IllegalArgumentException, String, Class, Package

public abstract class ClassLoader
{

	protected ClassLoader()
	{
		throw new RuntimeException("Stub!");
	}

	protected ClassLoader(ClassLoader parentLoader)
	{
		throw new RuntimeException("Stub!");
	}

	public static ClassLoader getSystemClassLoader()
	{
		throw new RuntimeException("Stub!");
	}

	public static URL getSystemResource(String resName)
	{
		throw new RuntimeException("Stub!");
	}

	public static Enumeration getSystemResources(String resName)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public static InputStream getSystemResourceAsStream(String resName)
	{
		throw new RuntimeException("Stub!");
	}

	protected final Class defineClass(byte classRep[], int offset, int length)
		throws ClassFormatError
	{
		throw new RuntimeException("Stub!");
	}

	protected final Class defineClass(String className, byte classRep[], int offset, int length)
		throws ClassFormatError
	{
		throw new RuntimeException("Stub!");
	}

	protected final Class defineClass(String className, byte classRep[], int offset, int length, ProtectionDomain protectionDomain)
		throws ClassFormatError
	{
		throw new RuntimeException("Stub!");
	}

	protected final Class defineClass(String name, ByteBuffer b, ProtectionDomain protectionDomain)
		throws ClassFormatError
	{
		throw new RuntimeException("Stub!");
	}

	protected Class findClass(String className)
		throws ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	protected final Class findLoadedClass(String className)
	{
		throw new RuntimeException("Stub!");
	}

	protected final Class findSystemClass(String className)
		throws ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public final ClassLoader getParent()
	{
		throw new RuntimeException("Stub!");
	}

	public URL getResource(String resName)
	{
		throw new RuntimeException("Stub!");
	}

	public Enumeration getResources(String resName)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream getResourceAsStream(String resName)
	{
		throw new RuntimeException("Stub!");
	}

	public Class loadClass(String className)
		throws ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	protected Class loadClass(String className, boolean resolve)
		throws ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	protected final void resolveClass(Class clazz)
	{
		throw new RuntimeException("Stub!");
	}

	protected URL findResource(String resName)
	{
		throw new RuntimeException("Stub!");
	}

	protected Enumeration findResources(String resName)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected String findLibrary(String libName)
	{
		throw new RuntimeException("Stub!");
	}

	protected Package getPackage(String name)
	{
		throw new RuntimeException("Stub!");
	}

	protected Package[] getPackages()
	{
		throw new RuntimeException("Stub!");
	}

	protected Package definePackage(String name, String specTitle, String specVersion, String specVendor, String implTitle, String implVersion, String implVendor, 
			URL sealBase)
		throws IllegalArgumentException
	{
		throw new RuntimeException("Stub!");
	}

	protected final void setSigners(Class c, Object signers[])
	{
		throw new RuntimeException("Stub!");
	}

	public void setClassAssertionStatus(String cname, boolean enable)
	{
		throw new RuntimeException("Stub!");
	}

	public void setPackageAssertionStatus(String pname, boolean enable)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDefaultAssertionStatus(boolean enable)
	{
		throw new RuntimeException("Stub!");
	}

	public void clearAssertionStatus()
	{
		throw new RuntimeException("Stub!");
	}
}
