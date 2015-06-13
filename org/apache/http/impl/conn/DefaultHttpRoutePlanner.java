// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DefaultHttpRoutePlanner.java

package org.apache.http.impl.conn;

import org.apache.http.*;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.protocol.HttpContext;

public class DefaultHttpRoutePlanner
	implements HttpRoutePlanner
{

	protected SchemeRegistry schemeRegistry;

	public DefaultHttpRoutePlanner(SchemeRegistry schreg)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpRoute determineRoute(HttpHost target, HttpRequest request, HttpContext context)
		throws HttpException
	{
		throw new RuntimeException("Stub!");
	}
}
