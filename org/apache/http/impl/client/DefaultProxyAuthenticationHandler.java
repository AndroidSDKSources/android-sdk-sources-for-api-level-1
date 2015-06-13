// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DefaultProxyAuthenticationHandler.java

package org.apache.http.impl.client;

import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package org.apache.http.impl.client:
//			AbstractAuthenticationHandler

public class DefaultProxyAuthenticationHandler extends AbstractAuthenticationHandler
{

	public DefaultProxyAuthenticationHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAuthenticationRequested(HttpResponse response, HttpContext context)
	{
		throw new RuntimeException("Stub!");
	}

	public Map getChallenges(HttpResponse response, HttpContext context)
		throws MalformedChallengeException
	{
		throw new RuntimeException("Stub!");
	}
}
