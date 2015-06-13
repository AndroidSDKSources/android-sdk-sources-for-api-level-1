// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ProxySelectorRoutePlanner.java

package org.apache.http.impl.conn;

import java.net.*;
import java.util.List;
import org.apache.http.*;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.protocol.HttpContext;

public class ProxySelectorRoutePlanner
	implements HttpRoutePlanner
{

	protected SchemeRegistry schemeRegistry;
	protected ProxySelector proxySelector;

	public ProxySelectorRoutePlanner(SchemeRegistry schreg, ProxySelector prosel)
	{
		throw new RuntimeException("Stub!");
	}

	public ProxySelector getProxySelector()
	{
		throw new RuntimeException("Stub!");
	}

	public void setProxySelector(ProxySelector prosel)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpRoute determineRoute(HttpHost target, HttpRequest request, HttpContext context)
		throws HttpException
	{
		throw new RuntimeException("Stub!");
	}

	protected HttpHost determineProxy(HttpHost target, HttpRequest request, HttpContext context)
		throws HttpException
	{
		throw new RuntimeException("Stub!");
	}

	protected String getHost(InetSocketAddress isa)
	{
		throw new RuntimeException("Stub!");
	}

	protected Proxy chooseProxy(List proxies, HttpHost target, HttpRequest request, HttpContext context)
	{
		throw new RuntimeException("Stub!");
	}
}
