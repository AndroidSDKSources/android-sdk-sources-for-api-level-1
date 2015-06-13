// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LineFormatter.java

package org.apache.http.message;

import org.apache.http.*;
import org.apache.http.util.CharArrayBuffer;

public interface LineFormatter
{

	public abstract CharArrayBuffer appendProtocolVersion(CharArrayBuffer chararraybuffer, ProtocolVersion protocolversion);

	public abstract CharArrayBuffer formatRequestLine(CharArrayBuffer chararraybuffer, RequestLine requestline);

	public abstract CharArrayBuffer formatStatusLine(CharArrayBuffer chararraybuffer, StatusLine statusline);

	public abstract CharArrayBuffer formatHeader(CharArrayBuffer chararraybuffer, Header header);
}
