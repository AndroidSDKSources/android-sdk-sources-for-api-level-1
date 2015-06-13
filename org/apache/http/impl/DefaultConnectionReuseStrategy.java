// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DefaultConnectionReuseStrategy.java

package org.apache.http.impl;

import org.apache.http.*;
import org.apache.http.protocol.HttpContext;

public class DefaultConnectionReuseStrategy
	implements ConnectionReuseStrategy
{

	public DefaultConnectionReuseStrategy()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean keepAlive(HttpResponse response, HttpContext context)
	{
		throw new RuntimeException("Stub!");
	}

	protected TokenIterator createTokenIterator(HeaderIterator hit)
	{
		throw new RuntimeException("Stub!");
	}
}
