// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RFC2109Spec.java

package org.apache.http.impl.cookie;

import java.util.List;
import org.apache.http.Header;
import org.apache.http.cookie.*;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.impl.cookie:
//			CookieSpecBase

public class RFC2109Spec extends CookieSpecBase
{

	public RFC2109Spec(String datepatterns[], boolean oneHeader)
	{
		throw new RuntimeException("Stub!");
	}

	public RFC2109Spec()
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

	public List formatCookies(List cookies)
	{
		throw new RuntimeException("Stub!");
	}

	protected void formatParamAsVer(CharArrayBuffer buffer, String name, String value, int version)
	{
		throw new RuntimeException("Stub!");
	}

	protected void formatCookieAsVer(CharArrayBuffer buffer, Cookie cookie, int version)
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
