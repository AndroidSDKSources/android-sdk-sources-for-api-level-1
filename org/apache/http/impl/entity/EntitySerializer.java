// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EntitySerializer.java

package org.apache.http.impl.entity;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.*;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.io.SessionOutputBuffer;

public class EntitySerializer
{

	public EntitySerializer(ContentLengthStrategy lenStrategy)
	{
		throw new RuntimeException("Stub!");
	}

	protected OutputStream doSerialize(SessionOutputBuffer outbuffer, HttpMessage message)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void serialize(SessionOutputBuffer outbuffer, HttpMessage message, HttpEntity entity)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}
}
