// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpRequestHandler.java

package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.*;

// Referenced classes of package org.apache.http.protocol:
//			HttpContext

public interface HttpRequestHandler
{

	public abstract void handle(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
		throws HttpException, IOException;
}
