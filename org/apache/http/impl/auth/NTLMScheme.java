// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   NTLMScheme.java

package org.apache.http.impl.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.*;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.impl.auth:
//			AuthSchemeBase, NTLMEngine

public class NTLMScheme extends AuthSchemeBase
{

	public NTLMScheme(NTLMEngine engine)
	{
		throw new RuntimeException("Stub!");
	}

	public String getSchemeName()
	{
		throw new RuntimeException("Stub!");
	}

	public String getParameter(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public String getRealm()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isConnectionBased()
	{
		throw new RuntimeException("Stub!");
	}

	protected void parseChallenge(CharArrayBuffer buffer, int pos, int len)
		throws MalformedChallengeException
	{
		throw new RuntimeException("Stub!");
	}

	public Header authenticate(Credentials credentials, HttpRequest request)
		throws AuthenticationException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isComplete()
	{
		throw new RuntimeException("Stub!");
	}
}
