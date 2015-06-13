// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpResponse.java

package org.apache.http;

import java.util.Locale;

// Referenced classes of package org.apache.http:
//			HttpMessage, StatusLine, ProtocolVersion, HttpEntity

public interface HttpResponse
	extends HttpMessage
{

	public abstract StatusLine getStatusLine();

	public abstract void setStatusLine(StatusLine statusline);

	public abstract void setStatusLine(ProtocolVersion protocolversion, int i);

	public abstract void setStatusLine(ProtocolVersion protocolversion, int i, String s);

	public abstract void setStatusCode(int i)
		throws IllegalStateException;

	public abstract void setReasonPhrase(String s)
		throws IllegalStateException;

	public abstract HttpEntity getEntity();

	public abstract void setEntity(HttpEntity httpentity);

	public abstract Locale getLocale();

	public abstract void setLocale(Locale locale);
}
