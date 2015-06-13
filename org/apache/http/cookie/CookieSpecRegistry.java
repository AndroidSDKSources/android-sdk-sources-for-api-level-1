// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CookieSpecRegistry.java

package org.apache.http.cookie;

import java.util.List;
import java.util.Map;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.cookie:
//			CookieSpecFactory, CookieSpec

public final class CookieSpecRegistry
{

	public CookieSpecRegistry()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void register(String name, CookieSpecFactory factory)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void unregister(String id)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized CookieSpec getCookieSpec(String name, HttpParams params)
		throws IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized CookieSpec getCookieSpec(String name)
		throws IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized List getSpecNames()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setItems(Map map)
	{
		throw new RuntimeException("Stub!");
	}
}
