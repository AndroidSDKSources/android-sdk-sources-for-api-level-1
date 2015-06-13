// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicHttpResponse.java

package org.apache.http.message;

import java.util.Locale;
import org.apache.http.*;

// Referenced classes of package org.apache.http.message:
//			AbstractHttpMessage

public class BasicHttpResponse extends AbstractHttpMessage
	implements HttpResponse
{

	public BasicHttpResponse(StatusLine statusline, ReasonPhraseCatalog catalog, Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public BasicHttpResponse(StatusLine statusline)
	{
		throw new RuntimeException("Stub!");
	}

	public BasicHttpResponse(ProtocolVersion ver, int code, String reason)
	{
		throw new RuntimeException("Stub!");
	}

	public ProtocolVersion getProtocolVersion()
	{
		throw new RuntimeException("Stub!");
	}

	public StatusLine getStatusLine()
	{
		throw new RuntimeException("Stub!");
	}

	public HttpEntity getEntity()
	{
		throw new RuntimeException("Stub!");
	}

	public Locale getLocale()
	{
		throw new RuntimeException("Stub!");
	}

	public void setStatusLine(StatusLine statusline)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStatusLine(ProtocolVersion ver, int code)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStatusLine(ProtocolVersion ver, int code, String reason)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStatusCode(int code)
	{
		throw new RuntimeException("Stub!");
	}

	public void setReasonPhrase(String reason)
	{
		throw new RuntimeException("Stub!");
	}

	public void setEntity(HttpEntity entity)
	{
		throw new RuntimeException("Stub!");
	}

	public void setLocale(Locale loc)
	{
		throw new RuntimeException("Stub!");
	}

	protected String getReason(int code)
	{
		throw new RuntimeException("Stub!");
	}
}
