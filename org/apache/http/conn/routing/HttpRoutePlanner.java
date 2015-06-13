// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpRoutePlanner.java

package org.apache.http.conn.routing;

import org.apache.http.*;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package org.apache.http.conn.routing:
//			HttpRoute

public interface HttpRoutePlanner
{

	public abstract HttpRoute determineRoute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
		throws HttpException;
}
