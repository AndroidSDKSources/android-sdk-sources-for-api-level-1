// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RequestDirector.java

package org.apache.http.client;

import java.io.IOException;
import org.apache.http.*;
import org.apache.http.protocol.HttpContext;

public interface RequestDirector
{

	public abstract HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
		throws HttpException, IOException;
}
