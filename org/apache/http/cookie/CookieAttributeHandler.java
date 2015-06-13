// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CookieAttributeHandler.java

package org.apache.http.cookie;


// Referenced classes of package org.apache.http.cookie:
//			MalformedCookieException, SetCookie, Cookie, CookieOrigin

public interface CookieAttributeHandler
{

	public abstract void parse(SetCookie setcookie, String s)
		throws MalformedCookieException;

	public abstract void validate(Cookie cookie, CookieOrigin cookieorigin)
		throws MalformedCookieException;

	public abstract boolean match(Cookie cookie, CookieOrigin cookieorigin);
}
