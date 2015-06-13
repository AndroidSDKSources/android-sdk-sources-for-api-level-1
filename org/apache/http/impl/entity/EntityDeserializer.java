// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EntityDeserializer.java

package org.apache.http.impl.entity;

import java.io.IOException;
import org.apache.http.*;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.io.SessionInputBuffer;

public class EntityDeserializer
{

	public EntityDeserializer(ContentLengthStrategy lenStrategy)
	{
		throw new RuntimeException("Stub!");
	}

	protected BasicHttpEntity doDeserialize(SessionInputBuffer inbuffer, HttpMessage message)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public HttpEntity deserialize(SessionInputBuffer inbuffer, HttpMessage message)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}
}
