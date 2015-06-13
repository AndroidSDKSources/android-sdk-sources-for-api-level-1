// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractCookieSpec.java

package org.apache.http.impl.cookie;

import java.util.Collection;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieSpec;

public abstract class AbstractCookieSpec
	implements CookieSpec
{

	public AbstractCookieSpec()
	{
		throw new RuntimeException("Stub!");
	}

	public void registerAttribHandler(String name, CookieAttributeHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	protected CookieAttributeHandler findAttribHandler(String name)
	{
		throw new RuntimeException("Stub!");
	}

	protected CookieAttributeHandler getAttribHandler(String name)
	{
		throw new RuntimeException("Stub!");
	}

	protected Collection getAttribHandlers()
	{
		throw new RuntimeException("Stub!");
	}
}
