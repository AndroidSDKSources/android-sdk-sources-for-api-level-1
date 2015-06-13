// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RedirectHandler.java

package org.apache.http.client;

import java.net.URI;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.protocol.HttpContext;

public interface RedirectHandler
{

	public abstract boolean isRedirectRequested(HttpResponse httpresponse, HttpContext httpcontext);

	public abstract URI getLocationURI(HttpResponse httpresponse, HttpContext httpcontext)
		throws ProtocolException;
}
