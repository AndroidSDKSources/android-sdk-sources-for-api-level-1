// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ClientContextConfigurer.java

package org.apache.http.client.protocol;

import java.util.List;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package org.apache.http.client.protocol:
//			ClientContext

public class ClientContextConfigurer
	implements ClientContext
{

	public ClientContextConfigurer(HttpContext context)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCookieSpecRegistry(CookieSpecRegistry registry)
	{
		throw new RuntimeException("Stub!");
	}

	public void setAuthSchemeRegistry(AuthSchemeRegistry registry)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCookieStore(CookieStore store)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCredentialsProvider(CredentialsProvider provider)
	{
		throw new RuntimeException("Stub!");
	}

	public void setAuthSchemePref(List list)
	{
		throw new RuntimeException("Stub!");
	}
}
