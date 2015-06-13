// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConnectionEvent.java

package javax.sql;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.EventObject;

// Referenced classes of package javax.sql:
//			PooledConnection

public class ConnectionEvent extends EventObject
	implements Serializable
{

	public ConnectionEvent(PooledConnection theConnection)
	{
		super((Object)null);
		throw new RuntimeException("Stub!");
	}

	public ConnectionEvent(PooledConnection theConnection, SQLException theException)
	{
		super((Object)null);
		throw new RuntimeException("Stub!");
	}

	public SQLException getSQLException()
	{
		throw new RuntimeException("Stub!");
	}
}
