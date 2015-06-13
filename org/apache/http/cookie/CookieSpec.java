// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CookieSpec.java

package org.apache.http.cookie;

import java.util.List;
import org.apache.http.Header;

// Referenced classes of package org.apache.http.cookie:
//			MalformedCookieException, CookieOrigin, Cookie

public interface CookieSpec
{

	public abstract int getVersion();

	public abstract List parse(Header header, CookieOrigin cookieorigin)
		throws MalformedCookieException;

	public abstract void validate(Cookie cookie, CookieOrigin cookieorigin)
		throws MalformedCookieException;

	public abstract boolean match(Cookie cookie, CookieOrigin cookieorigin);

	public abstract List formatCookies(List list);

	public abstract Header getVersionHeader();
}
