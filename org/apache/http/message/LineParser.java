// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LineParser.java

package org.apache.http.message;

import org.apache.http.*;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.message:
//			ParserCursor

public interface LineParser
{

	public abstract ProtocolVersion parseProtocolVersion(CharArrayBuffer chararraybuffer, ParserCursor parsercursor)
		throws ParseException;

	public abstract boolean hasProtocolVersion(CharArrayBuffer chararraybuffer, ParserCursor parsercursor);

	public abstract RequestLine parseRequestLine(CharArrayBuffer chararraybuffer, ParserCursor parsercursor)
		throws ParseException;

	public abstract StatusLine parseStatusLine(CharArrayBuffer chararraybuffer, ParserCursor parsercursor)
		throws ParseException;

	public abstract Header parseHeader(CharArrayBuffer chararraybuffer)
		throws ParseException;
}
