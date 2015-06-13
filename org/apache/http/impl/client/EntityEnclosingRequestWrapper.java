// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EntityEnclosingRequestWrapper.java

package org.apache.http.impl.client;

import org.apache.http.*;

// Referenced classes of package org.apache.http.impl.client:
//			RequestWrapper

public class EntityEnclosingRequestWrapper extends RequestWrapper
	implements HttpEntityEnclosingRequest
{

	public EntityEnclosingRequestWrapper(HttpEntityEnclosingRequest request)
		throws ProtocolException
	{
		super((HttpRequest)null);
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

	public boolean isRepeatable()
	{
		throw new RuntimeException("Stub!");
	}
}
