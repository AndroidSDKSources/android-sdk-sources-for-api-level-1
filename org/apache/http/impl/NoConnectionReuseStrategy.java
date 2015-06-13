// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   NoConnectionReuseStrategy.java

package org.apache.http.impl;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

public class NoConnectionReuseStrategy
	implements ConnectionReuseStrategy
{

	public NoConnectionReuseStrategy()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean keepAlive(HttpResponse response, HttpContext context)
	{
		throw new RuntimeException("Stub!");
	}
}
