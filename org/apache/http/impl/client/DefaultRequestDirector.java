// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DefaultRequestDirector.java

package org.apache.http.impl.client;

import java.io.IOException;
import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.conn.*;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.*;

// Referenced classes of package org.apache.http.impl.client:
//			RequestWrapper, RoutedRequest

public class DefaultRequestDirector
	implements RequestDirector
{

	protected final ClientConnectionManager connManager;
	protected final HttpRoutePlanner routePlanner;
	protected final ConnectionReuseStrategy reuseStrategy;
	protected final ConnectionKeepAliveStrategy keepAliveStrategy;
	protected final HttpRequestExecutor requestExec;
	protected final HttpProcessor httpProcessor;
	protected final HttpRequestRetryHandler retryHandler;
	protected final RedirectHandler redirectHandler;
	protected final HttpParams params;
	protected ManagedClientConnection managedConn;

	public DefaultRequestDirector(HttpRequestExecutor requestExec, ClientConnectionManager conman, ConnectionReuseStrategy reustrat, ConnectionKeepAliveStrategy kastrat, HttpRoutePlanner rouplan, HttpProcessor httpProcessor, HttpRequestRetryHandler retryHandler, 
			RedirectHandler redirectHandler, AuthenticationHandler targetAuthHandler, AuthenticationHandler proxyAuthHandler, UserTokenHandler userTokenHandler, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	protected void rewriteRequestURI(RequestWrapper request, HttpRoute route)
		throws ProtocolException
	{
		throw new RuntimeException("Stub!");
	}

	public HttpResponse execute(HttpHost target, HttpRequest request, HttpContext context)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void releaseConnection()
	{
		throw new RuntimeException("Stub!");
	}

	protected HttpRoute determineRoute(HttpHost target, HttpRequest request, HttpContext context)
		throws HttpException
	{
		throw new RuntimeException("Stub!");
	}

	protected void establishRoute(HttpRoute route, HttpContext context)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean createTunnelToTarget(HttpRoute route, HttpContext context)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean createTunnelToProxy(HttpRoute route, int hop, HttpContext context)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected HttpRequest createConnectRequest(HttpRoute route, HttpContext context)
	{
		throw new RuntimeException("Stub!");
	}

	protected RoutedRequest handleResponse(RoutedRequest roureq, HttpResponse response, HttpContext context)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}
}
