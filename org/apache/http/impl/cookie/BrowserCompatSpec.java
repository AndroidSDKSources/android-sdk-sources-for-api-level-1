// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BrowserCompatSpec.java

package org.apache.http.impl.cookie;

import java.util.List;
import org.apache.http.Header;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;

// Referenced classes of package org.apache.http.impl.cookie:
//			CookieSpecBase

public class BrowserCompatSpec extends CookieSpecBase
{

	protected static final String DATE_PATTERNS[] = null;

	public BrowserCompatSpec(String datepatterns[])
	{
		throw new RuntimeException("Stub!");
	}

	public BrowserCompatSpec()
	{
		throw new RuntimeException("Stub!");
	}

	public List parse(Header header, CookieOrigin origin)
		throws MalformedCookieException
	{
		throw new RuntimeException("Stub!");
	}

	public List formatCookies(List cookies)
	{
		throw new RuntimeException("Stub!");
	}

	public int getVersion()
	{
		throw new RuntimeException("Stub!");
	}

	public Header getVersionHeader()
	{
		throw new RuntimeException("Stub!");
	}

}
