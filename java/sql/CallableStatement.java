// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CallableStatement.java

package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;
import java.util.Map;

// Referenced classes of package java.sql:
//			PreparedStatement, SQLException, Array, Blob, 
//			Clob, Date, Ref, Time, 
//			Timestamp

public interface CallableStatement
	extends PreparedStatement
{

	public abstract Array getArray(int i)
		throws SQLException;

	public abstract Array getArray(String s)
		throws SQLException;

	public abstract BigDecimal getBigDecimal(int i)
		throws SQLException;

	public abstract BigDecimal getBigDecimal(int i, int j)
		throws SQLException;

	public abstract BigDecimal getBigDecimal(String s)
		throws SQLException;

	public abstract Blob getBlob(int i)
		throws SQLException;

	public abstract Blob getBlob(String s)
		throws SQLException;

	public abstract boolean getBoolean(int i)
		throws SQLException;

	public abstract boolean getBoolean(String s)
		throws SQLException;

	public abstract byte getByte(int i)
		throws SQLException;

	public abstract byte getByte(String s)
		throws SQLException;

	public abstract byte[] getBytes(int i)
		throws SQLException;

	public abstract byte[] getBytes(String s)
		throws SQLException;

	public abstract Clob getClob(int i)
		throws SQLException;

	public abstract Clob getClob(String s)
		throws SQLException;

	public abstract Date getDate(int i)
		throws SQLException;

	public abstract Date getDate(int i, Calendar calendar)
		throws SQLException;

	public abstract Date getDate(String s)
		throws SQLException;

	public abstract Date getDate(String s, Calendar calendar)
		throws SQLException;

	public abstract double getDouble(int i)
		throws SQLException;

	public abstract double getDouble(String s)
		throws SQLException;

	public abstract float getFloat(int i)
		throws SQLException;

	public abstract float getFloat(String s)
		throws SQLException;

	public abstract int getInt(int i)
		throws SQLException;

	public abstract int getInt(String s)
		throws SQLException;

	public abstract long getLong(int i)
		throws SQLException;

	public abstract long getLong(String s)
		throws SQLException;

	public abstract Object getObject(int i)
		throws SQLException;

	public abstract Object getObject(int i, Map map)
		throws SQLException;

	public abstract Object getObject(String s)
		throws SQLException;

	public abstract Object getObject(String s, Map map)
		throws SQLException;

	public abstract Ref getRef(int i)
		throws SQLException;

	public abstract Ref getRef(String s)
		throws SQLException;

	public abstract short getShort(int i)
		throws SQLException;

	public abstract short getShort(String s)
		throws SQLException;

	public abstract String getString(int i)
		throws SQLException;

	public abstract String getString(String s)
		throws SQLException;

	public abstract Time getTime(int i)
		throws SQLException;

	public abstract Time getTime(int i, Calendar calendar)
		throws SQLException;

	public abstract Time getTime(String s)
		throws SQLException;

	public abstract Time getTime(String s, Calendar calendar)
		throws SQLException;

	public abstract Timestamp getTimestamp(int i)
		throws SQLException;

	public abstract Timestamp getTimestamp(int i, Calendar calendar)
		throws SQLException;

	public abstract Timestamp getTimestamp(String s)
		throws SQLException;

	public abstract Timestamp getTimestamp(String s, Calendar calendar)
		throws SQLException;

	public abstract URL getURL(int i)
		throws SQLException;

	public abstract URL getURL(String s)
		throws SQLException;

	public abstract void registerOutParameter(int i, int j)
		throws SQLException;

	public abstract void registerOutParameter(int i, int j, int k)
		throws SQLException;

	public abstract void registerOutParameter(int i, int j, String s)
		throws SQLException;

	public abstract void registerOutParameter(String s, int i)
		throws SQLException;

	public abstract void registerOutParameter(String s, int i, int j)
		throws SQLException;

	public abstract void registerOutParameter(String s, int i, String s1)
		throws SQLException;

	public abstract void setAsciiStream(String s, InputStream inputstream, int i)
		throws SQLException;

	public abstract void setBigDecimal(String s, BigDecimal bigdecimal)
		throws SQLException;

	public abstract void setBinaryStream(String s, InputStream inputstream, int i)
		throws SQLException;

	public abstract void setBoolean(String s, boolean flag)
		throws SQLException;

	public abstract void setByte(String s, byte byte0)
		throws SQLException;

	public abstract void setBytes(String s, byte abyte0[])
		throws SQLException;

	public abstract void setCharacterStream(String s, Reader reader, int i)
		throws SQLException;

	public abstract void setDate(String s, Date date)
		throws SQLException;

	public abstract void setDate(String s, Date date, Calendar calendar)
		throws SQLException;

	public abstract void setDouble(String s, double d)
		throws SQLException;

	public abstract void setFloat(String s, float f)
		throws SQLException;

	public abstract void setInt(String s, int i)
		throws SQLException;

	public abstract void setLong(String s, long l)
		throws SQLException;

	public abstract void setNull(String s, int i)
		throws SQLException;

	public abstract void setNull(String s, int i, String s1)
		throws SQLException;

	public abstract void setObject(String s, Object obj)
		throws SQLException;

	public abstract void setObject(String s, Object obj, int i)
		throws SQLException;

	public abstract void setObject(String s, Object obj, int i, int j)
		throws SQLException;

	public abstract void setShort(String s, short word0)
		throws SQLException;

	public abstract void setString(String s, String s1)
		throws SQLException;

	public abstract void setTime(String s, Time time)
		throws SQLException;

	public abstract void setTime(String s, Time time, Calendar calendar)
		throws SQLException;

	public abstract void setTimestamp(String s, Timestamp timestamp)
		throws SQLException;

	public abstract void setTimestamp(String s, Timestamp timestamp, Calendar calendar)
		throws SQLException;

	public abstract void setURL(String s, URL url)
		throws SQLException;

	public abstract boolean wasNull()
		throws SQLException;
}
