// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConnManagerParamBean.java

package org.apache.http.conn.params;

import org.apache.http.params.HttpAbstractParamBean;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.conn.params:
//			ConnPerRouteBean

public class ConnManagerParamBean extends HttpAbstractParamBean
{

	public ConnManagerParamBean(HttpParams params)
	{
		super((HttpParams)null);
		throw new RuntimeException("Stub!");
	}

	public void setTimeout(long timeout)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMaxTotalConnections(int maxConnections)
	{
		throw new RuntimeException("Stub!");
	}

	public void setConnectionsPerRoute(ConnPerRouteBean connPerRoute)
	{
		throw new RuntimeException("Stub!");
	}
}
