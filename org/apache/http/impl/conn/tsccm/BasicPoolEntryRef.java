// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicPoolEntryRef.java

package org.apache.http.impl.conn.tsccm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.apache.http.conn.routing.HttpRoute;

// Referenced classes of package org.apache.http.impl.conn.tsccm:
//			BasicPoolEntry

public class BasicPoolEntryRef extends WeakReference
{

	public BasicPoolEntryRef(BasicPoolEntry entry, ReferenceQueue queue)
	{
		super(null, (ReferenceQueue)null);
		throw new RuntimeException("Stub!");
	}

	public final HttpRoute getRoute()
	{
		throw new RuntimeException("Stub!");
	}
}
