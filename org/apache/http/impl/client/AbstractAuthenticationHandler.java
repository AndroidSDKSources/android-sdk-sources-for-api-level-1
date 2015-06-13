// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractAuthenticationHandler.java

package org.apache.http.impl.client;

import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.auth.*;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.protocol.HttpContext;

public abstract class AbstractAuthenticationHandler
	implements AuthenticationHandler
{

	public AbstractAuthenticationHandler()
	{
		throw new RuntimeException("Stub!");
	}

	protected Map parseChallenges(Header headers[])
		throws MalformedChallengeException
	{
		throw new RuntimeException("Stub!");
	}

	protected List getAuthPreferences()
	{
		throw new RuntimeException("Stub!");
	}

	public AuthScheme selectScheme(Map challenges, HttpResponse response, HttpContext context)
		throws AuthenticationException
	{
		throw new RuntimeException("Stub!");
	}
}
