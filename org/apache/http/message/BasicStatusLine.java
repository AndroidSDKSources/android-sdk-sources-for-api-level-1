// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicStatusLine.java

package org.apache.http.message;

import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;

public class BasicStatusLine
	implements StatusLine, Cloneable
{

	public BasicStatusLine(ProtocolVersion version, int statusCode, String reasonPhrase)
	{
		throw new RuntimeException("Stub!");
	}

	public int getStatusCode()
	{
		throw new RuntimeException("Stub!");
	}

	public ProtocolVersion getProtocolVersion()
	{
		throw new RuntimeException("Stub!");
	}

	public String getReasonPhrase()
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
