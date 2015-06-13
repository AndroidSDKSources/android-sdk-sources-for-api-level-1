// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   URL.java

package java.net;

import java.io.*;

// Referenced classes of package java.net:
//			MalformedURLException, URISyntaxException, URLStreamHandler, URLStreamHandlerFactory, 
//			URLConnection, URI, Proxy

public final class URL
	implements Serializable
{

	public URL(String spec)
		throws MalformedURLException
	{
		throw new RuntimeException("Stub!");
	}

	public URL(URL context, String spec)
		throws MalformedURLException
	{
		throw new RuntimeException("Stub!");
	}

	public URL(URL context, String spec, URLStreamHandler handler)
		throws MalformedURLException
	{
		throw new RuntimeException("Stub!");
	}

	public URL(String protocol, String host, String file)
		throws MalformedURLException
	{
		throw new RuntimeException("Stub!");
	}

	public URL(String protocol, String host, int port, String file)
		throws MalformedURLException
	{
		throw new RuntimeException("Stub!");
	}

	public URL(String protocol, String host, int port, String file, URLStreamHandler handler)
		throws MalformedURLException
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setURLStreamHandlerFactory(URLStreamHandlerFactory streamFactory)
	{
		throw new RuntimeException("Stub!");
	}

	protected void set(String protocol, String host, int port, String file, String ref)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object o)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean sameFile(URL otherURL)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public final Object getContent()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final Object getContent(Class types[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final InputStream openStream()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public URLConnection openConnection()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public URI toURI()
		throws URISyntaxException
	{
		throw new RuntimeException("Stub!");
	}

	public URLConnection openConnection(Proxy proxy)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public String toExternalForm()
	{
		throw new RuntimeException("Stub!");
	}

	public String getFile()
	{
		throw new RuntimeException("Stub!");
	}

	public String getHost()
	{
		throw new RuntimeException("Stub!");
	}

	public int getPort()
	{
		throw new RuntimeException("Stub!");
	}

	public String getProtocol()
	{
		throw new RuntimeException("Stub!");
	}

	public String getRef()
	{
		throw new RuntimeException("Stub!");
	}

	public String getQuery()
	{
		throw new RuntimeException("Stub!");
	}

	public String getPath()
	{
		throw new RuntimeException("Stub!");
	}

	public String getUserInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public String getAuthority()
	{
		throw new RuntimeException("Stub!");
	}

	protected void set(String protocol, String host, int port, String authority, String userInfo, String path, String query, 
			String ref)
	{
		throw new RuntimeException("Stub!");
	}

	public int getDefaultPort()
	{
		throw new RuntimeException("Stub!");
	}
}
