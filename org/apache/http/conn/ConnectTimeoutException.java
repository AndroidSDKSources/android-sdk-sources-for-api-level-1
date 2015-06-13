// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConnectTimeoutException.java

package org.apache.http.conn;

import java.io.InterruptedIOException;

public class ConnectTimeoutException extends InterruptedIOException
{

	public ConnectTimeoutException()
	{
		throw new RuntimeException("Stub!");
	}

	public ConnectTimeoutException(String message)
	{
		throw new RuntimeException("Stub!");
	}
}
