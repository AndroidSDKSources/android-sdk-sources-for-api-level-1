// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpRequestFactory.java

package org.apache.http;


// Referenced classes of package org.apache.http:
//			MethodNotSupportedException, RequestLine, HttpRequest

public interface HttpRequestFactory
{

	public abstract HttpRequest newHttpRequest(RequestLine requestline)
		throws MethodNotSupportedException;

	public abstract HttpRequest newHttpRequest(String s, String s1)
		throws MethodNotSupportedException;
}
