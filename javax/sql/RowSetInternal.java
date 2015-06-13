// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RowSetInternal.java

package javax.sql;

import java.sql.*;

// Referenced classes of package javax.sql:
//			RowSetMetaData

public interface RowSetInternal
{

	public abstract Connection getConnection()
		throws SQLException;

	public abstract ResultSet getOriginal()
		throws SQLException;

	public abstract ResultSet getOriginalRow()
		throws SQLException;

	public abstract Object[] getParams()
		throws SQLException;

	public abstract void setMetaData(RowSetMetaData rowsetmetadata)
		throws SQLException;
}
