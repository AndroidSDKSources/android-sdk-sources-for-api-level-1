// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   JarEntry.java

package java.util.jar;

import java.io.IOException;
import java.security.CodeSigner;
import java.security.cert.Certificate;
import java.util.zip.ZipEntry;

// Referenced classes of package java.util.jar:
//			Attributes

public class JarEntry extends ZipEntry
{

	public JarEntry(String name)
	{
		super((ZipEntry)null);
		throw new RuntimeException("Stub!");
	}

	public JarEntry(ZipEntry entry)
	{
		super((ZipEntry)null);
		throw new RuntimeException("Stub!");
	}

	public JarEntry(JarEntry je)
	{
		super((ZipEntry)null);
		throw new RuntimeException("Stub!");
	}

	public Attributes getAttributes()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Certificate[] getCertificates()
	{
		throw new RuntimeException("Stub!");
	}

	public CodeSigner[] getCodeSigners()
	{
		throw new RuntimeException("Stub!");
	}
}
