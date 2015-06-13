// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AuthSchemeBase.java

package org.apache.http.impl.auth;

import org.apache.http.Header;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.util.CharArrayBuffer;

public abstract class AuthSchemeBase
	implements AuthScheme
{

	public AuthSchemeBase()
	{
		throw new RuntimeException("Stub!");
	}

	public void processChallenge(Header header)
		throws MalformedChallengeException
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void parseChallenge(CharArrayBuffer chararraybuffer, int i, int j)
		throws MalformedChallengeException;

	public boolean isProxy()
	{
		throw new RuntimeException("Stub!");
	}
}
