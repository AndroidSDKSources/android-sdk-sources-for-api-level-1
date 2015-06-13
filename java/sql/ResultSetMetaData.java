// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ResultSetMetaData.java

package java.sql;


// Referenced classes of package java.sql:
//			SQLException

public interface ResultSetMetaData
{

	public static final int columnNoNulls = 0;
	public static final int columnNullable = 1;
	public static final int columnNullableUnknown = 2;

	public abstract String getCatalogName(int i)
		throws SQLException;

	public abstract String getColumnClassName(int i)
		throws SQLException;

	public abstract int getColumnCount()
		throws SQLException;

	public abstract int getColumnDisplaySize(int i)
		throws SQLException;

	public abstract String getColumnLabel(int i)
		throws SQLException;

	public abstract String getColumnName(int i)
		throws SQLException;

	public abstract int getColumnType(int i)
		throws SQLException;

	public abstract String getColumnTypeName(int i)
		throws SQLException;

	public abstract int getPrecision(int i)
		throws SQLException;

	public abstract int getScale(int i)
		throws SQLException;

	public abstract String getSchemaName(int i)
		throws SQLException;

	public abstract String getTableName(int i)
		throws SQLException;

	public abstract boolean isAutoIncrement(int i)
		throws SQLException;

	public abstract boolean isCaseSensitive(int i)
		throws SQLException;

	public abstract boolean isCurrency(int i)
		throws SQLException;

	public abstract boolean isDefinitelyWritable(int i)
		throws SQLException;

	public abstract int isNullable(int i)
		throws SQLException;

	public abstract boolean isReadOnly(int i)
		throws SQLException;

	public abstract boolean isSearchable(int i)
		throws SQLException;

	public abstract boolean isSigned(int i)
		throws SQLException;

	public abstract boolean isWritable(int i)
		throws SQLException;
}
