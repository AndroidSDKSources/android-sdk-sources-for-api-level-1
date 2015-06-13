// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RowSetMetaData.java

package javax.sql;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public interface RowSetMetaData
	extends ResultSetMetaData
{

	public abstract void setAutoIncrement(int i, boolean flag)
		throws SQLException;

	public abstract void setCaseSensitive(int i, boolean flag)
		throws SQLException;

	public abstract void setCatalogName(int i, String s)
		throws SQLException;

	public abstract void setColumnCount(int i)
		throws SQLException;

	public abstract void setColumnDisplaySize(int i, int j)
		throws SQLException;

	public abstract void setColumnLabel(int i, String s)
		throws SQLException;

	public abstract void setColumnName(int i, String s)
		throws SQLException;

	public abstract void setColumnType(int i, int j)
		throws SQLException;

	public abstract void setColumnTypeName(int i, String s)
		throws SQLException;

	public abstract void setCurrency(int i, boolean flag)
		throws SQLException;

	public abstract void setNullable(int i, int j)
		throws SQLException;

	public abstract void setPrecision(int i, int j)
		throws SQLException;

	public abstract void setScale(int i, int j)
		throws SQLException;

	public abstract void setSchemaName(int i, String s)
		throws SQLException;

	public abstract void setSearchable(int i, boolean flag)
		throws SQLException;

	public abstract void setSigned(int i, boolean flag)
		throws SQLException;

	public abstract void setTableName(int i, String s)
		throws SQLException;
}
