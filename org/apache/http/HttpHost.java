// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpHost.java

package org.apache.http;


public final class HttpHost
	implements Cloneable
{

	public static final String DEFAULT_SCHEME_NAME = "http";
	protected final String hostname;
	protected final String lcHostname;
	protected final int port;
	protected final String schemeName;

	public HttpHost(String hostname, int port, String scheme)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpHost(String hostname, int port)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpHost(String hostname)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpHost(HttpHost httphost)
	{
		throw new RuntimeException("Stub!");
	}

	public String getHostName()
	{
		throw new RuntimeException("Stub!");
	}

	public int getPort()
	{
		throw new RuntimeException("Stub!");
	}

	public String getSchemeName()
	{
		throw new RuntimeException("Stub!");
	}

	public String toURI()
	{
		throw new RuntimeException("Stub!");
	}

	public String toHostString()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}
}
