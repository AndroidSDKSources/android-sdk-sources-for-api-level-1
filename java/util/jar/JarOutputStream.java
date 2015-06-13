// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   JarOutputStream.java

package java.util.jar;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// Referenced classes of package java.util.jar:
//			Manifest

public class JarOutputStream extends ZipOutputStream
{

	public JarOutputStream(OutputStream os, Manifest mf)
		throws IOException
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	public JarOutputStream(OutputStream os)
		throws IOException
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	public void putNextEntry(ZipEntry ze)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
