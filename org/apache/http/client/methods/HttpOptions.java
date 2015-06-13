// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpOptions.java

package org.apache.http.client.methods;

import java.net.URI;
import java.util.Set;
import org.apache.http.HttpResponse;

// Referenced classes of package org.apache.http.client.methods:
//			HttpRequestBase

public class HttpOptions extends HttpRequestBase
{

	public static final String METHOD_NAME = "OPTIONS";

	public HttpOptions()
	{
		throw new RuntimeException("Stub!");
	}

	public HttpOptions(URI uri)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpOptions(String uri)
	{
		throw new RuntimeException("Stub!");
	}

	public String getMethod()
	{
		throw new RuntimeException("Stub!");
	}

	public Set getAllowedMethods(HttpResponse response)
	{
		throw new RuntimeException("Stub!");
	}
}
