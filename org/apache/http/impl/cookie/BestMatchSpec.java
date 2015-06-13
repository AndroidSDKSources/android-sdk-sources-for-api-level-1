// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BestMatchSpec.java

package org.apache.http.impl.cookie;

import java.util.List;
import org.apache.http.Header;
import org.apache.http.cookie.*;

public class BestMatchSpec
	implements CookieSpec
{

	public BestMatchSpec(String datepatterns[], boolean oneHeader)
	{
		throw new RuntimeException("Stub!");
	}

	public BestMatchSpec()
	{
		throw new RuntimeException("Stub!");
	}

	public List parse(Header header, CookieOrigin origin)
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
