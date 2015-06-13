// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractHttpClient.java

package org.apache.http.impl.client;

import java.io.IOException;
import org.apache.http.*;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.client.*;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.*;

public abstract class AbstractHttpClient
	implements HttpClient
{

	protected AbstractHttpClient(ClientConnectionManager conman, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract HttpParams createHttpParams();

	protected abstract HttpContext createHttpContext();

	protected abstract HttpRequestExecutor createRequestExecutor();

	protected abstract ClientConnectionManager createClientConnectionManager();

	protected abstract AuthSchemeRegistry createAuthSchemeRegistry();

	protected abstract CookieSpecRegistry createCookieSpecRegistry();

	protected abstract ConnectionReuseStrategy createConnectionReuseStrategy();

	protected abstract ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy();

	protected abstract BasicHttpProcessor createHttpProcessor();

	protected abstract HttpRequestRetryHandler createHttpRequestRetryHandler();

	protected abstract RedirectHandler createRedirectHandler();

	protected abstract AuthenticationHandler createTargetAuthenticationHandler();

	protected abstract AuthenticationHandler createProxyAuthenticationHandler();

	protected abstract CookieStore createCookieStore();

	protected abstract CredentialsProvider createCredentialsProvider();

	protected abstract HttpRoutePlanner createHttpRoutePlanner();

	protected abstract UserTokenHandler createUserTokenHandler();

	public final synchronized HttpParams getParams()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setParams(HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized ClientConnectionManager getConnectionManager()
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized HttpRequestExecutor getRequestExecutor()
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized AuthSchemeRegistry getAuthSchemes()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setAuthSchemes(AuthSchemeRegistry authSchemeRegistry)
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized CookieSpecRegistry getCookieSpecs()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setCookieSpecs(CookieSpecRegistry cookieSpecRegistry)
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized ConnectionReuseStrategy getConnectionReuseStrategy()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setReuseStrategy(ConnectionReuseStrategy reuseStrategy)
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized ConnectionKeepAliveStrategy getConnectionKeepAliveStrategy()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setKeepAliveStrategy(ConnectionKeepAliveStrategy keepAliveStrategy)
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized HttpRequestRetryHandler getHttpRequestRetryHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setHttpRequestRetryHandler(HttpRequestRetryHandler retryHandler)
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized RedirectHandler getRedirectHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setRedirectHandler(RedirectHandler redirectHandler)
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized AuthenticationHandler getTargetAuthenticationHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setTargetAuthenticationHandler(AuthenticationHandler targetAuthHandler)
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized AuthenticationHandler getProxyAuthenticationHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setProxyAuthenticationHandler(AuthenticationHandler proxyAuthHandler)
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized CookieStore getCookieStore()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setCookieStore(CookieStore cookieStore)
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized CredentialsProvider getCredentialsProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setCredentialsProvider(CredentialsProvider credsProvider)
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized HttpRoutePlanner getRoutePlanner()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setRoutePlanner(HttpRoutePlanner routePlanner)
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized UserTokenHandler getUserTokenHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setUserTokenHandler(UserTokenHandler userTokenHandler)
	{
		throw new RuntimeException("Stub!");
	}

	protected final synchronized BasicHttpProcessor getHttpProcessor()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void addResponseInterceptor(HttpResponseInterceptor itcp)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void addResponseInterceptor(HttpResponseInterceptor itcp, int index)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized HttpResponseInterceptor getResponseInterceptor(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getResponseInterceptorCount()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void clearResponseInterceptors()
	{
		throw new RuntimeException("Stub!");
	}

	public void removeResponseInterceptorByClass(Class clazz)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void addRequestInterceptor(HttpRequestInterceptor itcp)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void addRequestInterceptor(HttpRequestInterceptor itcp, int index)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized HttpRequestInterceptor getRequestInterceptor(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int getRequestInterceptorCount()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void clearRequestInterceptors()
	{
		throw new RuntimeException("Stub!");
	}

	public void removeRequestInterceptorByClass(Class clazz)
	{
		throw new RuntimeException("Stub!");
	}

	public final HttpResponse execute(HttpUriRequest request)
		throws IOException, ClientProtocolException
	{
		throw new RuntimeException("Stub!");
	}

	public final HttpResponse execute(HttpUriRequest request, HttpContext context)
		throws IOException, ClientProtocolException
	{
		throw new RuntimeException("Stub!");
	}

	public final HttpResponse execute(HttpHost target, HttpRequest request)
		throws IOException, ClientProtocolException
	{
		throw new RuntimeException("Stub!");
	}

	public final HttpResponse execute(HttpHost target, HttpRequest request, HttpContext context)
		throws IOException, ClientProtocolException
	{
		throw new RuntimeException("Stub!");
	}

	protected RequestDirector createClientRequestDirector(HttpRequestExecutor requestExec, ClientConnectionManager conman, ConnectionReuseStrategy reustrat, ConnectionKeepAliveStrategy kastrat, HttpRoutePlanner rouplan, HttpProcessor httpProcessor, HttpRequestRetryHandler retryHandler, 
			RedirectHandler redirectHandler, AuthenticationHandler targetAuthHandler, AuthenticationHandler proxyAuthHandler, UserTokenHandler stateHandler, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	protected HttpParams determineParams(HttpRequest req)
	{
		throw new RuntimeException("Stub!");
	}

	public Object execute(HttpUriRequest request, ResponseHandler responseHandler)
		throws IOException, ClientProtocolException
	{
		throw new RuntimeException("Stub!");
	}

	public Object execute(HttpUriRequest request, ResponseHandler responseHandler, HttpContext context)
		throws IOException, ClientProtocolException
	{
		throw new RuntimeException("Stub!");
	}

	public Object execute(HttpHost target, HttpRequest request, ResponseHandler responseHandler)
		throws IOException, ClientProtocolException
	{
		throw new RuntimeException("Stub!");
	}

	public Object execute(HttpHost target, HttpRequest request, ResponseHandler responseHandler, HttpContext context)
		throws IOException, ClientProtocolException
	{
		throw new RuntimeException("Stub!");
	}
}
