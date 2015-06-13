// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RowSetEvent.java

package javax.sql;

import java.io.Serializable;
import java.util.EventObject;

// Referenced classes of package javax.sql:
//			RowSet

public class RowSetEvent extends EventObject
	implements Serializable
{

	public RowSetEvent(RowSet theSource)
	{
		super((Object)null);
		throw new RuntimeException("Stub!");
	}
}
