// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ExecutionContext.java

package org.apache.http.protocol;


public interface ExecutionContext
{

	public static final String HTTP_CONNECTION = "http.connection";
	public static final String HTTP_REQUEST = "http.request";
	public static final String HTTP_RESPONSE = "http.response";
	public static final String HTTP_TARGET_HOST = "http.target_host";
	public static final String HTTP_PROXY_HOST = "http.proxy_host";
	public static final String HTTP_REQ_SENT = "http.request_sent";
}
