// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ClientConnectionManager.java

package org.apache.http.conn;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;

// Referenced classes of package org.apache.http.conn:
//			ClientConnectionRequest, ManagedClientConnection

public interface ClientConnectionManager
{

	public abstract SchemeRegistry getSchemeRegistry();

	public abstract ClientConnectionRequest requestConnection(HttpRoute httproute, Object obj);

	public abstract void releaseConnection(ManagedClientConnection managedclientconnection, long l, TimeUnit timeunit);

	public abstract void closeIdleConnections(long l, TimeUnit timeunit);

	public abstract void closeExpiredConnections();

	public abstract void shutdown();
}
