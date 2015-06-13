// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RFC2617Scheme.java

package org.apache.http.impl.auth;

import java.util.Map;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.impl.auth:
//			AuthSchemeBase

public abstract class RFC2617Scheme extends AuthSchemeBase
{

	public RFC2617Scheme()
	{
		throw new RuntimeException("Stub!");
	}

	protected void parseChallenge(CharArrayBuffer buffer, int pos, int len)
		throws MalformedChallengeException
	{
		throw new RuntimeException("Stub!");
	}

	protected Map getParameters()
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
}
