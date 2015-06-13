// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   JarInputStream.java

package java.util.jar;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

// Referenced classes of package java.util.jar:
//			Manifest, JarEntry

public class JarInputStream extends ZipInputStream
{

	public JarInputStream(InputStream stream, boolean verify)
		throws IOException
	{
		super((InputStream)null);
		throw new RuntimeException("Stub!");
	}

	public JarInputStream(InputStream stream)
		throws IOException
	{
		super((InputStream)null);
		throw new RuntimeException("Stub!");
	}

	public Manifest getManifest()
	{
		throw new RuntimeException("Stub!");
	}

	public JarEntry getNextJarEntry()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte buffer[], int offset, int length)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public ZipEntry getNextEntry()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected ZipEntry createZipEntry(String name)
	{
		throw new RuntimeException("Stub!");
	}
}
