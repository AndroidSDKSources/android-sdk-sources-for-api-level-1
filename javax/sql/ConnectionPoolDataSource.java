// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConnectionPoolDataSource.java

package javax.sql;

import java.io.PrintWriter;
import java.sql.SQLException;

// Referenced classes of package javax.sql:
//			PooledConnection

public interface ConnectionPoolDataSource
{

	public abstract int getLoginTimeout()
		throws SQLException;

	public abstract PrintWriter getLogWriter()
		throws SQLException;

	public abstract PooledConnection getPooledConnection()
		throws SQLException;

	public abstract PooledConnection getPooledConnection(String s, String s1)
		throws SQLException;

	public abstract void setLoginTimeout(int i)
		throws SQLException;

	public abstract void setLogWriter(PrintWriter printwriter)
		throws SQLException;
}
