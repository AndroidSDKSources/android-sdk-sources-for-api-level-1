// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DefaultResponseParser.java

package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.*;
import org.apache.http.impl.io.AbstractMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;

public class DefaultResponseParser extends AbstractMessageParser
{

	public DefaultResponseParser(SessionInputBuffer buffer, LineParser parser, HttpResponseFactory responseFactory, HttpParams params)
	{
		super((SessionInputBuffer)null, (LineParser)null, (HttpParams)null);
		throw new RuntimeException("Stub!");
	}

	protected HttpMessage parseHead(SessionInputBuffer sessionBuffer)
		throws IOException, HttpException
	{
		throw new RuntimeException("Stub!");
	}
}
