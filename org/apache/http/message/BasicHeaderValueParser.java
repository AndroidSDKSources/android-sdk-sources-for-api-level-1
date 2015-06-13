// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicHeaderValueParser.java

package org.apache.http.message;

import org.apache.http.*;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.message:
//			HeaderValueParser, ParserCursor

public class BasicHeaderValueParser
	implements HeaderValueParser
{

	public static final BasicHeaderValueParser DEFAULT = null;

	public BasicHeaderValueParser()
	{
		throw new RuntimeException("Stub!");
	}

	public static final HeaderElement[] parseElements(String value, HeaderValueParser parser)
		throws ParseException
	{
		throw new RuntimeException("Stub!");
	}

	public HeaderElement[] parseElements(CharArrayBuffer buffer, ParserCursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public static final HeaderElement parseHeaderElement(String value, HeaderValueParser parser)
		throws ParseException
	{
		throw new RuntimeException("Stub!");
	}

	public HeaderElement parseHeaderElement(CharArrayBuffer buffer, ParserCursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	protected HeaderElement createHeaderElement(String name, String value, NameValuePair params[])
	{
		throw new RuntimeException("Stub!");
	}

	public static final NameValuePair[] parseParameters(String value, HeaderValueParser parser)
		throws ParseException
	{
		throw new RuntimeException("Stub!");
	}

	public NameValuePair[] parseParameters(CharArrayBuffer buffer, ParserCursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public static final NameValuePair parseNameValuePair(String value, HeaderValueParser parser)
		throws ParseException
	{
		throw new RuntimeException("Stub!");
	}

	public NameValuePair parseNameValuePair(CharArrayBuffer buffer, ParserCursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public NameValuePair parseNameValuePair(CharArrayBuffer buffer, ParserCursor cursor, char delimiters[])
	{
		throw new RuntimeException("Stub!");
	}

	protected NameValuePair createNameValuePair(String name, String value)
	{
		throw new RuntimeException("Stub!");
	}

}
