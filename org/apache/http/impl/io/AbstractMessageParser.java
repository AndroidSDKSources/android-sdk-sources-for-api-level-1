// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractMessageParser.java

package org.apache.http.impl.io;

import java.io.IOException;
import org.apache.http.*;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;

public abstract class AbstractMessageParser
	implements HttpMessageParser
{

	protected final LineParser lineParser;

	public AbstractMessageParser(SessionInputBuffer buffer, LineParser parser, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public static Header[] parseHeaders(SessionInputBuffer inbuffer, int maxHeaderCount, int maxLineLen, LineParser parser)
		throws HttpException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract HttpMessage parseHead(SessionInputBuffer sessioninputbuffer)
		throws IOException, HttpException, ParseException;

	public HttpMessage parse()
		throws IOException, HttpException
	{
		throw new RuntimeException("Stub!");
	}
}
