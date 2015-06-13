// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpClient.java

package org.apache.http.client;

import java.io.IOException;
import org.apache.http.*;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package org.apache.http.client:
//			ClientProtocolException, ResponseHandler

public interface HttpClient
{

	public abstract HttpParams getParams();

	public abstract ClientConnectionManager getConnectionManager();

	public abstract HttpResponse execute(HttpUriRequest httpurirequest)
		throws IOException, ClientProtocolException;

	public abstract HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
		throws IOException, ClientProtocolException;

	public abstract HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
		throws IOException, ClientProtocolException;

	public abstract HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
		throws IOException, ClientProtocolException;

	public abstract Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
		throws IOException, ClientProtocolException;

	public abstract Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
		throws IOException, ClientProtocolException;

	public abstract Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
		throws IOException, ClientProtocolException;

	public abstract Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
		throws IOException, ClientProtocolException;
}
