// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PreparedStatement.java

package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;

// Referenced classes of package java.sql:
//			Statement, SQLException, ResultSet, ResultSetMetaData, 
//			ParameterMetaData, Array, Blob, Clob, 
//			Date, Ref, Time, Timestamp

public interface PreparedStatement
	extends Statement
{

	public abstract void addBatch()
		throws SQLException;

	public abstract void clearParameters()
		throws SQLException;

	public abstract boolean execute()
		throws SQLException;

	public abstract ResultSet executeQuery()
		throws SQLException;

	public abstract int executeUpdate()
		throws SQLException;

	public abstract ResultSetMetaData getMetaData()
		throws SQLException;

	public abstract ParameterMetaData getParameterMetaData()
		throws SQLException;

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

	public abstract void setDate(int i, Date date)
		throws SQLException;

	public abstract void setDate(int i, Date date, Calendar calendar)
		throws SQLException;

	public abstract void setDouble(int i, double d)
		throws SQLException;

	public abstract void setFloat(int i, float f)
		throws SQLException;

	public abstract void setInt(int i, int j)
		throws SQLException;

	public abstract void setLong(int i, long l)
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

	public abstract void setUnicodeStream(int i, InputStream inputstream, int j)
		throws SQLException;

	public abstract void setURL(int i, URL url)
		throws SQLException;
}
