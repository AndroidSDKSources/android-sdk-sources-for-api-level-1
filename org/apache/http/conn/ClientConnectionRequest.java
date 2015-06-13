// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ClientConnectionRequest.java

package org.apache.http.conn;

import java.util.concurrent.TimeUnit;

// Referenced classes of package org.apache.http.conn:
//			ConnectionPoolTimeoutException, ManagedClientConnection

public interface ClientConnectionRequest
{

	public abstract ManagedClientConnection getConnection(long l, TimeUnit timeunit)
		throws InterruptedException, ConnectionPoolTimeoutException;

	public abstract void abortRequest();
}
