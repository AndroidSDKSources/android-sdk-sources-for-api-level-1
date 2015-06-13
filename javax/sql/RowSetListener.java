// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RowSetListener.java

package javax.sql;

import java.util.EventListener;

// Referenced classes of package javax.sql:
//			RowSetEvent

public interface RowSetListener
	extends EventListener
{

	public abstract void cursorMoved(RowSetEvent rowsetevent);

	public abstract void rowChanged(RowSetEvent rowsetevent);

	public abstract void rowSetChanged(RowSetEvent rowsetevent);
}
