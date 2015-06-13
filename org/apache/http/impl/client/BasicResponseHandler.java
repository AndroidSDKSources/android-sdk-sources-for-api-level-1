// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicResponseHandler.java

package org.apache.http.impl.client;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.*;

public class BasicResponseHandler
	implements ResponseHandler
{

	public BasicResponseHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public String handleResponse(HttpResponse response)
		throws HttpResponseException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public volatile Object handleResponse(HttpResponse x0)
		throws ClientProtocolException, IOException
	{
		return handleResponse(x0);
	}
}
