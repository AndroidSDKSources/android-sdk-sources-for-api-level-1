// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Array.java

package java.sql;

import java.util.Map;

// Referenced classes of package java.sql:
//			SQLException, ResultSet

public interface Array
{

	public abstract Object getArray()
		throws SQLException;

	public abstract Object getArray(long l, int i)
		throws SQLException;

	public abstract Object getArray(long l, int i, Map map)
		throws SQLException;

	public abstract Object getArray(Map map)
		throws SQLException;

	public abstract int getBaseType()
		throws SQLException;

	public abstract String getBaseTypeName()
		throws SQLException;

	public abstract ResultSet getResultSet()
		throws SQLException;

	public abstract ResultSet getResultSet(long l, int i)
		throws SQLException;

	public abstract ResultSet getResultSet(long l, int i, Map map)
		throws SQLException;

	public abstract ResultSet getResultSet(Map map)
		throws SQLException;
}
