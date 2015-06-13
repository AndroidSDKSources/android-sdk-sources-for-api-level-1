// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpResponseException.java

package org.apache.http.client;


// Referenced classes of package org.apache.http.client:
//			ClientProtocolException

public class HttpResponseException extends ClientProtocolException
{

	public HttpResponseException(int statusCode, String s)
	{
		throw new RuntimeException("Stub!");
	}

	public int getStatusCode()
	{
		throw new RuntimeException("Stub!");
	}
}
