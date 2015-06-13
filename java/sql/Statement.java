// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Statement.java

package java.sql;


// Referenced classes of package java.sql:
//			SQLException, ResultSet, Connection, SQLWarning

public interface Statement
{

	public static final int CLOSE_ALL_RESULTS = 3;
	public static final int CLOSE_CURRENT_RESULT = 1;
	public static final int EXECUTE_FAILED = -3;
	public static final int KEEP_CURRENT_RESULT = 2;
	public static final int NO_GENERATED_KEYS = 2;
	public static final int RETURN_GENERATED_KEYS = 1;
	public static final int SUCCESS_NO_INFO = -2;

	public abstract void addBatch(String s)
		throws SQLException;

	public abstract void cancel()
		throws SQLException;

	public abstract void clearBatch()
		throws SQLException;

	public abstract void clearWarnings()
		throws SQLException;

	public abstract void close()
		throws SQLException;

	public abstract boolean execute(String s)
		throws SQLException;

	public abstract boolean execute(String s, int i)
		throws SQLException;

	public abstract boolean execute(String s, int ai[])
		throws SQLException;

	public abstract boolean execute(String s, String as[])
		throws SQLException;

	public abstract int[] executeBatch()
		throws SQLException;

	public abstract ResultSet executeQuery(String s)
		throws SQLException;

	public abstract int executeUpdate(String s)
		throws SQLException;

	public abstract int executeUpdate(String s, int i)
		throws SQLException;

	public abstract int executeUpdate(String s, int ai[])
		throws SQLException;

	public abstract int executeUpdate(String s, String as[])
		throws SQLException;

	public abstract Connection getConnection()
		throws SQLException;

	public abstract int getFetchDirection()
		throws SQLException;

	public abstract int getFetchSize()
		throws SQLException;

	public abstract ResultSet getGeneratedKeys()
		throws SQLException;

	public abstract int getMaxFieldSize()
		throws SQLException;

	public abstract int getMaxRows()
		throws SQLException;

	public abstract boolean getMoreResults()
		throws SQLException;

	public abstract boolean getMoreResults(int i)
		throws SQLException;

	public abstract int getQueryTimeout()
		throws SQLException;

	public abstract ResultSet getResultSet()
		throws SQLException;

	public abstract int getResultSetConcurrency()
		throws SQLException;

	public abstract int getResultSetHoldability()
		throws SQLException;

	public abstract int getResultSetType()
		throws SQLException;

	public abstract int getUpdateCount()
		throws SQLException;

	public abstract SQLWarning getWarnings()
		throws SQLException;

	public abstract void setCursorName(String s)
		throws SQLException;

	public abstract void setEscapeProcessing(boolean flag)
		throws SQLException;

	public abstract void setFetchDirection(int i)
		throws SQLException;

	public abstract void setFetchSize(int i)
		throws SQLException;

	public abstract void setMaxFieldSize(int i)
		throws SQLException;

	public abstract void setMaxRows(int i)
		throws SQLException;

	public abstract void setQueryTimeout(int i)
		throws SQLException;
}
