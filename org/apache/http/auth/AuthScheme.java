// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AuthScheme.java

package org.apache.http.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;

// Referenced classes of package org.apache.http.auth:
//			MalformedChallengeException, AuthenticationException, Credentials

public interface AuthScheme
{

	public abstract void processChallenge(Header header)
		throws MalformedChallengeException;

	public abstract String getSchemeName();

	public abstract String getParameter(String s);

	public abstract String getRealm();

	public abstract boolean isConnectionBased();

	public abstract boolean isComplete();

	public abstract Header authenticate(Credentials credentials, HttpRequest httprequest)
		throws AuthenticationException;
}
