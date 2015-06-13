// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AuthSchemeRegistry.java

package org.apache.http.auth;

import java.util.List;
import java.util.Map;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.auth:
//			AuthSchemeFactory, AuthScheme

public final class AuthSchemeRegistry
{

	public AuthSchemeRegistry()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void register(String name, AuthSchemeFactory factory)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void unregister(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized AuthScheme getAuthScheme(String name, HttpParams params)
		throws IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized List getSchemeNames()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setItems(Map map)
	{
		throw new RuntimeException("Stub!");
	}
}
