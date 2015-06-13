// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   URLStreamHandler.java

package java.net;

import java.io.IOException;

// Referenced classes of package java.net:
//			URL, URLConnection, Proxy, InetAddress

public abstract class URLStreamHandler
{

	public URLStreamHandler()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract URLConnection openConnection(URL url)
		throws IOException;

	protected URLConnection openConnection(URL u, Proxy proxy)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void parseURL(URL u, String str, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	protected void setURL(URL u, String protocol, String host, int port, String file, String ref)
	{
		throw new RuntimeException("Stub!");
	}

	protected void setURL(URL u, String protocol, String host, int port, String authority, String userInfo, String file, 
			String query, String ref)
	{
		throw new RuntimeException("Stub!");
	}

	protected String toExternalForm(URL url)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean equals(URL url1, URL url2)
	{
		throw new RuntimeException("Stub!");
	}

	protected int getDefaultPort()
	{
		throw new RuntimeException("Stub!");
	}

	protected InetAddress getHostAddress(URL url)
	{
		throw new RuntimeException("Stub!");
	}

	protected int hashCode(URL url)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean hostsEqual(URL url1, URL url2)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean sameFile(URL url1, URL url2)
	{
		throw new RuntimeException("Stub!");
	}
}
