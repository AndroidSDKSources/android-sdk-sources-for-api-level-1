// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CookieSpecBase.java

package org.apache.http.impl.cookie;

import java.util.List;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.*;

// Referenced classes of package org.apache.http.impl.cookie:
//			AbstractCookieSpec

public abstract class CookieSpecBase extends AbstractCookieSpec
{

	public CookieSpecBase()
	{
		throw new RuntimeException("Stub!");
	}

	protected static String getDefaultPath(CookieOrigin origin)
	{
		throw new RuntimeException("Stub!");
	}

	protected static String getDefaultDomain(CookieOrigin origin)
	{
		throw new RuntimeException("Stub!");
	}

	protected List parse(HeaderElement elems[], CookieOrigin origin)
		throws MalformedCookieException
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
