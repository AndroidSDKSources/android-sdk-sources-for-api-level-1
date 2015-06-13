// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpResponseParser.java

package org.apache.http.impl.io;

import java.io.IOException;
import org.apache.http.*;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.impl.io:
//			AbstractMessageParser

public class HttpResponseParser extends AbstractMessageParser
{

	public HttpResponseParser(SessionInputBuffer buffer, LineParser parser, HttpResponseFactory responseFactory, HttpParams params)
	{
		super((SessionInputBuffer)null, (LineParser)null, (HttpParams)null);
		throw new RuntimeException("Stub!");
	}

	protected HttpMessage parseHead(SessionInputBuffer sessionBuffer)
		throws IOException, HttpException, ParseException
	{
		throw new RuntimeException("Stub!");
	}
}
