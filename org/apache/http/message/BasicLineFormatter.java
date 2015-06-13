// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicLineFormatter.java

package org.apache.http.message;

import org.apache.http.*;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.message:
//			LineFormatter

public class BasicLineFormatter
	implements LineFormatter
{

	public static final BasicLineFormatter DEFAULT = null;

	public BasicLineFormatter()
	{
		throw new RuntimeException("Stub!");
	}

	protected CharArrayBuffer initBuffer(CharArrayBuffer buffer)
	{
		throw new RuntimeException("Stub!");
	}

	public static final String formatProtocolVersion(ProtocolVersion version, LineFormatter formatter)
	{
		throw new RuntimeException("Stub!");
	}

	public CharArrayBuffer appendProtocolVersion(CharArrayBuffer buffer, ProtocolVersion version)
	{
		throw new RuntimeException("Stub!");
	}

	protected int estimateProtocolVersionLen(ProtocolVersion version)
	{
		throw new RuntimeException("Stub!");
	}

	public static final String formatRequestLine(RequestLine reqline, LineFormatter formatter)
	{
		throw new RuntimeException("Stub!");
	}

	public CharArrayBuffer formatRequestLine(CharArrayBuffer buffer, RequestLine reqline)
	{
		throw new RuntimeException("Stub!");
	}

	protected void doFormatRequestLine(CharArrayBuffer buffer, RequestLine reqline)
	{
		throw new RuntimeException("Stub!");
	}

	public static final String formatStatusLine(StatusLine statline, LineFormatter formatter)
	{
		throw new RuntimeException("Stub!");
	}

	public CharArrayBuffer formatStatusLine(CharArrayBuffer buffer, StatusLine statline)
	{
		throw new RuntimeException("Stub!");
	}

	protected void doFormatStatusLine(CharArrayBuffer buffer, StatusLine statline)
	{
		throw new RuntimeException("Stub!");
	}

	public static final String formatHeader(Header header, LineFormatter formatter)
	{
		throw new RuntimeException("Stub!");
	}

	public CharArrayBuffer formatHeader(CharArrayBuffer buffer, Header header)
	{
		throw new RuntimeException("Stub!");
	}

	protected void doFormatHeader(CharArrayBuffer buffer, Header header)
	{
		throw new RuntimeException("Stub!");
	}

}
