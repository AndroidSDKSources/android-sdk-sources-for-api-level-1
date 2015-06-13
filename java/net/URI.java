// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   URI.java

package java.net;

import java.io.Serializable;

// Referenced classes of package java.net:
//			URISyntaxException, MalformedURLException, URL

public final class URI
	implements Comparable, Serializable
{

	public URI(String uri)
		throws URISyntaxException
	{
		throw new RuntimeException("Stub!");
	}

	public URI(String scheme, String ssp, String frag)
		throws URISyntaxException
	{
		throw new RuntimeException("Stub!");
	}

	public URI(String scheme, String userinfo, String host, int port, String path, String query, String fragment)
		throws URISyntaxException
	{
		throw new RuntimeException("Stub!");
	}

	public URI(String scheme, String host, String path, String fragment)
		throws URISyntaxException
	{
		throw new RuntimeException("Stub!");
	}

	public URI(String scheme, String authority, String path, String query, String fragment)
		throws URISyntaxException
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(URI uri)
	{
		throw new RuntimeException("Stub!");
	}

	public static URI create(String uri)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object o)
	{
		throw new RuntimeException("Stub!");
	}

	public String getAuthority()
	{
		throw new RuntimeException("Stub!");
	}

	public String getFragment()
	{
		throw new RuntimeException("Stub!");
	}

	public String getHost()
	{
		throw new RuntimeException("Stub!");
	}

	public String getPath()
	{
		throw new RuntimeException("Stub!");
	}

	public int getPort()
	{
		throw new RuntimeException("Stub!");
	}

	public String getQuery()
	{
		throw new RuntimeException("Stub!");
	}

	public String getRawAuthority()
	{
		throw new RuntimeException("Stub!");
	}

	public String getRawFragment()
	{
		throw new RuntimeException("Stub!");
	}

	public String getRawPath()
	{
		throw new RuntimeException("Stub!");
	}

	public String getRawQuery()
	{
		throw new RuntimeException("Stub!");
	}

	public String getRawSchemeSpecificPart()
	{
		throw new RuntimeException("Stub!");
	}

	public String getRawUserInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public String getScheme()
	{
		throw new RuntimeException("Stub!");
	}

	public String getSchemeSpecificPart()
	{
		throw new RuntimeException("Stub!");
	}

	public String getUserInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAbsolute()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isOpaque()
	{
		throw new RuntimeException("Stub!");
	}

	public URI normalize()
	{
		throw new RuntimeException("Stub!");
	}

	public URI parseServerAuthority()
		throws URISyntaxException
	{
		throw new RuntimeException("Stub!");
	}

	public URI relativize(URI relative)
	{
		throw new RuntimeException("Stub!");
	}

	public URI resolve(URI relative)
	{
		throw new RuntimeException("Stub!");
	}

	public URI resolve(String relative)
	{
		throw new RuntimeException("Stub!");
	}

	public String toASCIIString()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public URL toURL()
		throws MalformedURLException
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((URI)x0);
	}
}
