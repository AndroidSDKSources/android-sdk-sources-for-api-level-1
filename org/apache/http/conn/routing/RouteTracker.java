// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RouteTracker.java

package org.apache.http.conn.routing;

import java.net.InetAddress;
import org.apache.http.HttpHost;

// Referenced classes of package org.apache.http.conn.routing:
//			RouteInfo, HttpRoute

public final class RouteTracker
	implements RouteInfo, Cloneable
{

	public RouteTracker(HttpHost target, InetAddress local)
	{
		throw new RuntimeException("Stub!");
	}

	public RouteTracker(HttpRoute route)
	{
		throw new RuntimeException("Stub!");
	}

	public final void connectTarget(boolean secure)
	{
		throw new RuntimeException("Stub!");
	}

	public final void connectProxy(HttpHost proxy, boolean secure)
	{
		throw new RuntimeException("Stub!");
	}

	public final void tunnelTarget(boolean secure)
	{
		throw new RuntimeException("Stub!");
	}

	public final void tunnelProxy(HttpHost proxy, boolean secure)
	{
		throw new RuntimeException("Stub!");
	}

	public final void layerProtocol(boolean secure)
	{
		throw new RuntimeException("Stub!");
	}

	public final HttpHost getTargetHost()
	{
		throw new RuntimeException("Stub!");
	}

	public final InetAddress getLocalAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getHopCount()
	{
		throw new RuntimeException("Stub!");
	}

	public final HttpHost getHopTarget(int hop)
	{
		throw new RuntimeException("Stub!");
	}

	public final HttpHost getProxyHost()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isConnected()
	{
		throw new RuntimeException("Stub!");
	}

	public final RouteInfo.TunnelType getTunnelType()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isTunnelled()
	{
		throw new RuntimeException("Stub!");
	}

	public final RouteInfo.LayerType getLayerType()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isLayered()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isSecure()
	{
		throw new RuntimeException("Stub!");
	}

	public final HttpRoute toRoute()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean equals(Object o)
	{
		throw new RuntimeException("Stub!");
	}

	public final int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public final String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}
}
