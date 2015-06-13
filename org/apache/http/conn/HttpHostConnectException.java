// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpHostConnectException.java

package org.apache.http.conn;

import java.net.ConnectException;
import org.apache.http.HttpHost;

public class HttpHostConnectException extends ConnectException
{

	public HttpHostConnectException(HttpHost host, ConnectException cause)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpHost getHost()
	{
		throw new RuntimeException("Stub!");
	}
}
