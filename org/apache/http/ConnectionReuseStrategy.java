// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConnectionReuseStrategy.java

package org.apache.http;

import org.apache.http.protocol.HttpContext;

// Referenced classes of package org.apache.http:
//			HttpResponse

public interface ConnectionReuseStrategy
{

	public abstract boolean keepAlive(HttpResponse httpresponse, HttpContext httpcontext);
}
