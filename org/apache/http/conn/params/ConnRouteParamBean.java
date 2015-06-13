// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConnRouteParamBean.java

package org.apache.http.conn.params;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpAbstractParamBean;
import org.apache.http.params.HttpParams;

public class ConnRouteParamBean extends HttpAbstractParamBean
{

	public ConnRouteParamBean(HttpParams params)
	{
		super((HttpParams)null);
		throw new RuntimeException("Stub!");
	}

	public void setDefaultProxy(HttpHost defaultProxy)
	{
		throw new RuntimeException("Stub!");
	}

	public void setLocalAddress(InetAddress address)
	{
		throw new RuntimeException("Stub!");
	}

	public void setForcedRoute(HttpRoute route)
	{
		throw new RuntimeException("Stub!");
	}
}
