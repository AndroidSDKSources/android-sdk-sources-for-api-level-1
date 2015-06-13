// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PooledConnection.java

package javax.sql;

import java.sql.Connection;
import java.sql.SQLException;

// Referenced classes of package javax.sql:
//			ConnectionEventListener

public interface PooledConnection
{

	public abstract void addConnectionEventListener(ConnectionEventListener connectioneventlistener);

	public abstract void close()
		throws SQLException;

	public abstract Connection getConnection()
		throws SQLException;

	public abstract void removeConnectionEventListener(ConnectionEventListener connectioneventlistener);
}
