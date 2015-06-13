// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HeaderValueParser.java

package org.apache.http.message;

import org.apache.http.*;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.message:
//			ParserCursor

public interface HeaderValueParser
{

	public abstract HeaderElement[] parseElements(CharArrayBuffer chararraybuffer, ParserCursor parsercursor)
		throws ParseException;

	public abstract HeaderElement parseHeaderElement(CharArrayBuffer chararraybuffer, ParserCursor parsercursor)
		throws ParseException;

	public abstract NameValuePair[] parseParameters(CharArrayBuffer chararraybuffer, ParserCursor parsercursor)
		throws ParseException;

	public abstract NameValuePair parseNameValuePair(CharArrayBuffer chararraybuffer, ParserCursor parsercursor)
		throws ParseException;
}
