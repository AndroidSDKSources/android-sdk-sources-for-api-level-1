// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RowSet.java

package javax.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

// Referenced classes of package javax.sql:
//			RowSetListener

public interface RowSet
	extends ResultSet
{

	public abstract void addRowSetListener(RowSetListener rowsetlistener);

	public abstract void clearParameters()
		throws SQLException;

	public abstract void execute()
		throws SQLException;

	public abstract String getCommand();

	public abstract String getDataSourceName();

	public abstract boolean getEscapeProcessing()
		throws SQLException;

	public abstract int getMaxFieldSize()
		throws SQLException;

	public abstract int getMaxRows()
		throws SQLException;

	public abstract String getPassword();

	public abstract int getQueryTimeout()
		throws SQLException;

	public abstract int getTransactionIsolation();

	public abstract Map getTypeMap()
		throws SQLException;

	public abstract String getUrl()
		throws SQLException;

	public abstract String getUsername();

	public abstract boolean isReadOnly();

	public abstract void removeRowSetListener(RowSetListener rowsetlistener);

	public abstract void setArray(int i, Array array)
		throws SQLException;

	public abstract void setAsciiStream(int i, InputStream inputstream, int j)
		throws SQLException;

	public abstract void setBigDecimal(int i, BigDecimal bigdecimal)
		throws SQLException;

	public abstract void setBinaryStream(int i, InputStream inputstream, int j)
		throws SQLException;

	public abstract void setBlob(int i, Blob blob)
		throws SQLException;

	public abstract void setBoolean(int i, boolean flag)
		throws SQLException;

	public abstract void setByte(int i, byte byte0)
		throws SQLException;

	public abstract void setBytes(int i, byte abyte0[])
		throws SQLException;

	public abstract void setCharacterStream(int i, Reader reader, int j)
		throws SQLException;

	public abstract void setClob(int i, Clob clob)
		throws SQLException;

	public abstract void setCommand(String s)
		throws SQLException;

	public abstract void setConcurrency(int i)
		throws SQLException;

	public abstract void setDataSourceName(String s)
		throws SQLException;

	public abstract void setDate(int i, Date date)
		throws SQLException;

	public abstract void setDate(int i, Date date, Calendar calendar)
		throws SQLException;

	public abstract void setDouble(int i, double d)
		throws SQLException;

	public abstract void setEscapeProcessing(boolean flag)
		throws SQLException;

	public abstract void setFloat(int i, float f)
		throws SQLException;

	public abstract void setInt(int i, int j)
		throws SQLException;

	public abstract void setLong(int i, long l)
		throws SQLException;

	public abstract void setMaxFieldSize(int i)
		throws SQLException;

	public abstract void setMaxRows(int i)
		throws SQLException;

	public abstract void setNull(int i, int j)
		throws SQLException;

	public abstract void setNull(int i, int j, String s)
		throws SQLException;

	public abstract void setObject(int i, Object obj)
		throws SQLException;

	public abstract void setObject(int i, Object obj, int j)
		throws SQLException;

	public abstract void setObject(int i, Object obj, int j, int k)
		throws SQLException;

	public abstract void setPassword(String s)
		throws SQLException;

	public abstract void setQueryTimeout(int i)
		throws SQLException;

	public abstract void setReadOnly(boolean flag)
		throws SQLException;

	public abstract void setRef(int i, Ref ref)
		throws SQLException;

	public abstract void setShort(int i, short word0)
		throws SQLException;

	public abstract void setString(int i, String s)
		throws SQLException;

	public abstract void setTime(int i, Time time)
		throws SQLException;

	public abstract void setTime(int i, Time time, Calendar calendar)
		throws SQLException;

	public abstract void setTimestamp(int i, Timestamp timestamp)
		throws SQLException;

	public abstract void setTimestamp(int i, Timestamp timestamp, Calendar calendar)
		throws SQLException;

	public abstract void setTransactionIsolation(int i)
		throws SQLException;

	public abstract void setType(int i)
		throws SQLException;

	public abstract void setTypeMap(Map map)
		throws SQLException;

	public abstract void setUrl(String s)
		throws SQLException;

	public abstract void setUsername(String s)
		throws SQLException;
}
