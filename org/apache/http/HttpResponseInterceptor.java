// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpResponseInterceptor.java

package org.apache.http;

import java.io.IOException;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package org.apache.http:
//			HttpException, HttpResponse

public interface HttpResponseInterceptor
{

	public abstract void process(HttpResponse httpresponse, HttpContext httpcontext)
		throws HttpException, IOException;
}
