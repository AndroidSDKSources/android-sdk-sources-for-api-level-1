// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DefaultHttpResponseFactory.java

package org.apache.http.impl;

import java.util.Locale;
import org.apache.http.*;
import org.apache.http.protocol.HttpContext;

public class DefaultHttpResponseFactory
	implements HttpResponseFactory
{

	protected final ReasonPhraseCatalog reasonCatalog;

	public DefaultHttpResponseFactory(ReasonPhraseCatalog catalog)
	{
		throw new RuntimeException("Stub!");
	}

	public DefaultHttpResponseFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public HttpResponse newHttpResponse(ProtocolVersion ver, int status, HttpContext context)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpResponse newHttpResponse(StatusLine statusline, HttpContext context)
	{
		throw new RuntimeException("Stub!");
	}

	protected Locale determineLocale(HttpContext context)
	{
		throw new RuntimeException("Stub!");
	}
}
