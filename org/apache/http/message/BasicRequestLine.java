// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicRequestLine.java

package org.apache.http.message;

import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;

public class BasicRequestLine
	implements RequestLine, Cloneable
{

	public BasicRequestLine(String method, String uri, ProtocolVersion version)
	{
		throw new RuntimeException("Stub!");
	}

	public String getMethod()
	{
		throw new RuntimeException("Stub!");
	}

	public ProtocolVersion getProtocolVersion()
	{
		throw new RuntimeException("Stub!");
	}

	public String getUri()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}
}
