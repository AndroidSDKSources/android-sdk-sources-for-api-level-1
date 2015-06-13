// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpResponseFactory.java

package org.apache.http;

import org.apache.http.protocol.HttpContext;

// Referenced classes of package org.apache.http:
//			ProtocolVersion, HttpResponse, StatusLine

public interface HttpResponseFactory
{

	public abstract HttpResponse newHttpResponse(ProtocolVersion protocolversion, int i, HttpContext httpcontext);

	public abstract HttpResponse newHttpResponse(StatusLine statusline, HttpContext httpcontext);
}
