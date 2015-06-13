// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PoolEntryRequest.java

package org.apache.http.impl.conn.tsccm;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ConnectionPoolTimeoutException;

// Referenced classes of package org.apache.http.impl.conn.tsccm:
//			BasicPoolEntry

public interface PoolEntryRequest
{

	public abstract BasicPoolEntry getPoolEntry(long l, TimeUnit timeunit)
		throws InterruptedException, ConnectionPoolTimeoutException;

	public abstract void abortRequest();
}
