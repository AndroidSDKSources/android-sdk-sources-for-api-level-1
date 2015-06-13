// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpEntityEnclosingRequestBase.java

package org.apache.http.client.methods;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;

// Referenced classes of package org.apache.http.client.methods:
//			HttpRequestBase

public abstract class HttpEntityEnclosingRequestBase extends HttpRequestBase
	implements HttpEntityEnclosingRequest
{

	public HttpEntityEnclosingRequestBase()
	{
		throw new RuntimeException("Stub!");
	}

	public HttpEntity getEntity()
	{
		throw new RuntimeException("Stub!");
	}

	public void setEntity(HttpEntity entity)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean expectContinue()
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}
}
