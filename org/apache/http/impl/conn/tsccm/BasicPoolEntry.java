// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicPoolEntry.java

package org.apache.http.impl.conn.tsccm;

import java.lang.ref.ReferenceQueue;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.AbstractPoolEntry;

// Referenced classes of package org.apache.http.impl.conn.tsccm:
//			BasicPoolEntryRef

public class BasicPoolEntry extends AbstractPoolEntry
{

	public BasicPoolEntry(ClientConnectionOperator op, HttpRoute route, ReferenceQueue queue)
	{
		super((ClientConnectionOperator)null, (HttpRoute)null);
		throw new RuntimeException("Stub!");
	}

	protected final OperatedClientConnection getConnection()
	{
		throw new RuntimeException("Stub!");
	}

	protected final HttpRoute getPlannedRoute()
	{
		throw new RuntimeException("Stub!");
	}

	protected final BasicPoolEntryRef getWeakRef()
	{
		throw new RuntimeException("Stub!");
	}
}
