// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LaxContentLengthStrategy.java

package org.apache.http.impl.entity;

import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.entity.ContentLengthStrategy;

public class LaxContentLengthStrategy
	implements ContentLengthStrategy
{

	public LaxContentLengthStrategy()
	{
		throw new RuntimeException("Stub!");
	}

	public long determineLength(HttpMessage message)
		throws HttpException
	{
		throw new RuntimeException("Stub!");
	}
}
