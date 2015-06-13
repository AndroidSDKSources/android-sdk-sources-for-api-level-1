// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   JarFile.java

package java.util.jar;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

// Referenced classes of package java.util.jar:
//			JarEntry, Manifest

public class JarFile extends ZipFile
{

	public static final String MANIFEST_NAME = "META-INF/MANIFEST.MF";

	public JarFile(File file)
		throws IOException
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}

	public JarFile(File file, boolean verify)
		throws IOException
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}

	public JarFile(File file, boolean verify, int mode)
		throws IOException
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}

	public JarFile(String filename)
		throws IOException
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}

	public JarFile(String filename, boolean verify)
		throws IOException
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}

	public Enumeration entries()
	{
		throw new RuntimeException("Stub!");
	}

	public JarEntry getJarEntry(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public Manifest getManifest()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream getInputStream(ZipEntry ze)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public ZipEntry getEntry(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
