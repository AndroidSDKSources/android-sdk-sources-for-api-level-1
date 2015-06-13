// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicScheme.java

package org.apache.http.impl.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.*;

// Referenced classes of package org.apache.http.impl.auth:
//			RFC2617Scheme

public class BasicScheme extends RFC2617Scheme
{

	public BasicScheme()
	{
		throw new RuntimeException("Stub!");
	}

	public String getSchemeName()
	{
		throw new RuntimeException("Stub!");
	}

	public void processChallenge(Header header)
		throws MalformedChallengeException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isComplete()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isConnectionBased()
	{
		throw new RuntimeException("Stub!");
	}

	public Header authenticate(Credentials credentials, HttpRequest request)
		throws AuthenticationException
	{
		throw new RuntimeException("Stub!");
	}

	public static Header authenticate(Credentials credentials, String charset, boolean proxy)
	{
		throw new RuntimeException("Stub!");
	}
}
