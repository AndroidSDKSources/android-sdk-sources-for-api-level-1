// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpExpectationVerifier.java

package org.apache.http.protocol;

import org.apache.http.*;

// Referenced classes of package org.apache.http.protocol:
//			HttpContext

public interface HttpExpectationVerifier
{

	public abstract void verify(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
		throws HttpException;
}
