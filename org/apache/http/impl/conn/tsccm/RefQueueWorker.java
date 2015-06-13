// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RefQueueWorker.java

package org.apache.http.impl.conn.tsccm;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package org.apache.http.impl.conn.tsccm:
//			RefQueueHandler

public class RefQueueWorker
	implements Runnable
{

	protected final ReferenceQueue refQueue;
	protected final RefQueueHandler refHandler;
	protected volatile Thread workerThread;

	public RefQueueWorker(ReferenceQueue queue, RefQueueHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public void run()
	{
		throw new RuntimeException("Stub!");
	}

	public void shutdown()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
