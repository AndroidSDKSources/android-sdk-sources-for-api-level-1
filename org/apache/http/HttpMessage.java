// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpMessage.java

package org.apache.http;

import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http:
//			ProtocolVersion, Header, HeaderIterator

public interface HttpMessage
{

	public abstract ProtocolVersion getProtocolVersion();

	public abstract boolean containsHeader(String s);

	public abstract Header[] getHeaders(String s);

	public abstract Header getFirstHeader(String s);

	public abstract Header getLastHeader(String s);

	public abstract Header[] getAllHeaders();

	public abstract void addHeader(Header header);

	public abstract void addHeader(String s, String s1);

	public abstract void setHeader(Header header);

	public abstract void setHeader(String s, String s1);

	public abstract void setHeaders(Header aheader[]);

	public abstract void removeHeader(Header header);

	public abstract void removeHeaders(String s);

	public abstract HeaderIterator headerIterator();

	public abstract HeaderIterator headerIterator(String s);

	public abstract HttpParams getParams();

	public abstract void setParams(HttpParams httpparams);
}
