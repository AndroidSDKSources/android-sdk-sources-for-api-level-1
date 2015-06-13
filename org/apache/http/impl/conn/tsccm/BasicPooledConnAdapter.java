// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicPooledConnAdapter.java

package org.apache.http.impl.conn.tsccm;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.conn.AbstractPoolEntry;
import org.apache.http.impl.conn.AbstractPooledConnAdapter;

// Referenced classes of package org.apache.http.impl.conn.tsccm:
//			ThreadSafeClientConnManager

public class BasicPooledConnAdapter extends AbstractPooledConnAdapter
{

	protected BasicPooledConnAdapter(ThreadSafeClientConnManager tsccm, AbstractPoolEntry entry)
	{
		super((ClientConnectionManager)null, (AbstractPoolEntry)null);
		throw new RuntimeException("Stub!");
	}

	protected ClientConnectionManager getManager()
	{
		throw new RuntimeException("Stub!");
	}

	protected AbstractPoolEntry getPoolEntry()
	{
		throw new RuntimeException("Stub!");
	}

	protected void detach()
	{
		throw new RuntimeException("Stub!");
	}
}
