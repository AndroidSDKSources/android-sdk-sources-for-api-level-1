// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ManagedClientConnection.java

package org.apache.http.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import org.apache.http.*;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package org.apache.http.conn:
//			ConnectionReleaseTrigger

public interface ManagedClientConnection
	extends HttpClientConnection, HttpInetConnection, ConnectionReleaseTrigger
{

	public abstract boolean isSecure();

	public abstract HttpRoute getRoute();

	public abstract SSLSession getSSLSession();

	public abstract void open(HttpRoute httproute, HttpContext httpcontext, HttpParams httpparams)
		throws IOException;

	public abstract void tunnelTarget(boolean flag, HttpParams httpparams)
		throws IOException;

	public abstract void tunnelProxy(HttpHost httphost, boolean flag, HttpParams httpparams)
		throws IOException;

	public abstract void layerProtocol(HttpContext httpcontext, HttpParams httpparams)
		throws IOException;

	public abstract void markReusable();

	public abstract void unmarkReusable();

	public abstract boolean isMarkedReusable();

	public abstract void setState(Object obj);

	public abstract Object getState();

	public abstract void setIdleDuration(long l, TimeUnit timeunit);
}
