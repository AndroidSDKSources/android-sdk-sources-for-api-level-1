// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   JarURLConnection.java

package java.net;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.jar.*;

// Referenced classes of package java.net:
//			URLConnection, URL, MalformedURLException

public abstract class JarURLConnection extends URLConnection
{

	protected URLConnection jarFileURLConnection;

	protected JarURLConnection(URL url)
		throws MalformedURLException
	{
		super((URL)null);
		throw new RuntimeException("Stub!");
	}

	public Attributes getAttributes()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Certificate[] getCertificates()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String getEntryName()
	{
		throw new RuntimeException("Stub!");
	}

	public JarEntry getJarEntry()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Manifest getManifest()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract JarFile getJarFile()
		throws IOException;

	public URL getJarFileURL()
	{
		throw new RuntimeException("Stub!");
	}

	public Attributes getMainAttributes()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
