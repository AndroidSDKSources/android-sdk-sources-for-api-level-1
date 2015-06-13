// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractCookieAttributeHandler.java

package org.apache.http.impl.cookie;

import org.apache.http.cookie.*;

public abstract class AbstractCookieAttributeHandler
	implements CookieAttributeHandler
{

	public AbstractCookieAttributeHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public void validate(Cookie cookie, CookieOrigin origin)
		throws MalformedCookieException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean match(Cookie cookie, CookieOrigin origin)
	{
		throw new RuntimeException("Stub!");
	}
}
