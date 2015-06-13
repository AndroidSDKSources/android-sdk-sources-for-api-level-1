// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ClientContext.java

package org.apache.http.client.protocol;


public interface ClientContext
{

	public static final String COOKIESPEC_REGISTRY = "http.cookiespec-registry";
	public static final String AUTHSCHEME_REGISTRY = "http.authscheme-registry";
	public static final String COOKIE_STORE = "http.cookie-store";
	public static final String COOKIE_SPEC = "http.cookie-spec";
	public static final String COOKIE_ORIGIN = "http.cookie-origin";
	public static final String CREDS_PROVIDER = "http.auth.credentials-provider";
	public static final String TARGET_AUTH_STATE = "http.auth.target-scope";
	public static final String PROXY_AUTH_STATE = "http.auth.proxy-scope";
	public static final String AUTH_SCHEME_PREF = "http.auth.scheme-pref";
	public static final String USER_TOKEN = "http.user-token";
}
