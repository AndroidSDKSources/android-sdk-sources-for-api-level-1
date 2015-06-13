// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DefaultHttpRequestRetryHandler.java

package org.apache.http.impl.client;

import java.io.IOException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

public class DefaultHttpRequestRetryHandler
	implements HttpRequestRetryHandler
{

	public DefaultHttpRequestRetryHandler(int retryCount, boolean requestSentRetryEnabled)
	{
		throw new RuntimeException("Stub!");
	}

	public DefaultHttpRequestRetryHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean retryRequest(IOException exception, int executionCount, HttpContext context)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isRequestSentRetryEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public int getRetryCount()
	{
		throw new RuntimeException("Stub!");
	}
}
