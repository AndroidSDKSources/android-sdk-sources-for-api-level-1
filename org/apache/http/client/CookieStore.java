// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CookieStore.java

package org.apache.http.client;

import java.util.Date;
import java.util.List;
import org.apache.http.cookie.Cookie;

public interface CookieStore
{

	public abstract void addCookie(Cookie cookie);

	public abstract List getCookies();

	public abstract boolean clearExpired(Date date);

	public abstract void clear();
}
