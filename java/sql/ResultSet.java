// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ResultSet.java

package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;
import java.util.Map;

// Referenced classes of package java.sql:
//			SQLException, Array, Blob, Clob, 
//			Date, ResultSetMetaData, Ref, Statement, 
//			Time, Timestamp, SQLWarning

public interface ResultSet
{

	public static final int CLOSE_CURSORS_AT_COMMIT = 2;
	public static final int HOLD_CURSORS_OVER_COMMIT = 1;
	public static final int CONCUR_READ_ONLY = 1007;
	public static final int CONCUR_UPDATABLE = 1008;
	public static final int FETCH_FORWARD = 1000;
	public static final int FETCH_REVERSE = 1001;
	public static final int FETCH_UNKNOWN = 1002;
	public static final int TYPE_FORWARD_ONLY = 1003;
	public static final int TYPE_SCROLL_INSENSITIVE = 1004;
	public static final int TYPE_SCROLL_SENSITIVE = 1005;

	public abstract boolean absolute(int i)
		throws SQLException;

	public abstract void afterLast()
		throws SQLException;

	public abstract void beforeFirst()
		throws SQLException;

	public abstract void cancelRowUpdates()
		throws SQLException;

	public abstract void clearWarnings()
		throws SQLException;

	public abstract void close()
		throws SQLException;

	public abstract void deleteRow()
		throws SQLException;

	public abstract int findColumn(String s)
		throws SQLException;

	public abstract boolean first()
		throws SQLException;

	public abstract Array getArray(int i)
		throws SQLException;

	public abstract Array getArray(String s)
		throws SQLException;

	public abstract InputStream getAsciiStream(int i)
		throws SQLException;

	public abstract InputStream getAsciiStream(String s)
		throws SQLException;

	public abstract BigDecimal getBigDecimal(int i)
		throws SQLException;

	public abstract BigDecimal getBigDecimal(int i, int j)
		throws SQLException;

	public abstract BigDecimal getBigDecimal(String s)
		throws SQLException;

	public abstract BigDecimal getBigDecimal(String s, int i)
		throws SQLException;

	public abstract InputStream getBinaryStream(int i)
		throws SQLException;

	public abstract InputStream getBinaryStream(String s)
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

	public abstract Reader getCharacterStream(int i)
		throws SQLException;

	public abstract Reader getCharacterStream(String s)
		throws SQLException;

	public abstract Clob getClob(int i)
		throws SQLException;

	public abstract Clob getClob(String s)
		throws SQLException;

	public abstract int getConcurrency()
		throws SQLException;

	public abstract String getCursorName()
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

	public abstract int getFetchDirection()
		throws SQLException;

	public abstract int getFetchSize()
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

	public abstract ResultSetMetaData getMetaData()
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

	public abstract int getRow()
		throws SQLException;

	public abstract short getShort(int i)
		throws SQLException;

	public abstract short getShort(String s)
		throws SQLException;

	public abstract Statement getStatement()
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

	public abstract int getType()
		throws SQLException;

	public abstract InputStream getUnicodeStream(int i)
		throws SQLException;

	public abstract InputStream getUnicodeStream(String s)
		throws SQLException;

	public abstract URL getURL(int i)
		throws SQLException;

	public abstract URL getURL(String s)
		throws SQLException;

	public abstract SQLWarning getWarnings()
		throws SQLException;

	public abstract void insertRow()
		throws SQLException;

	public abstract boolean isAfterLast()
		throws SQLException;

	public abstract boolean isBeforeFirst()
		throws SQLException;

	public abstract boolean isFirst()
		throws SQLException;

	public abstract boolean isLast()
		throws SQLException;

	public abstract boolean last()
		throws SQLException;

	public abstract void moveToCurrentRow()
		throws SQLException;

	public abstract void moveToInsertRow()
		throws SQLException;

	public abstract boolean next()
		throws SQLException;

	public abstract boolean previous()
		throws SQLException;

	public abstract void refreshRow()
		throws SQLException;

	public abstract boolean relative(int i)
		throws SQLException;

	public abstract boolean rowDeleted()
		throws SQLException;

	public abstract boolean rowInserted()
		throws SQLException;

	public abstract boolean rowUpdated()
		throws SQLException;

	public abstract void setFetchDirection(int i)
		throws SQLException;

	public abstract void setFetchSize(int i)
		throws SQLException;

	public abstract void updateArray(int i, Array array)
		throws SQLException;

	public abstract void updateArray(String s, Array array)
		throws SQLException;

	public abstract void updateAsciiStream(int i, InputStream inputstream, int j)
		throws SQLException;

	public abstract void updateAsciiStream(String s, InputStream inputstream, int i)
		throws SQLException;

	public abstract void updateBigDecimal(int i, BigDecimal bigdecimal)
		throws SQLException;

	public abstract void updateBigDecimal(String s, BigDecimal bigdecimal)
		throws SQLException;

	public abstract void updateBinaryStream(int i, InputStream inputstream, int j)
		throws SQLException;

	public abstract void updateBinaryStream(String s, InputStream inputstream, int i)
		throws SQLException;

	public abstract void updateBlob(int i, Blob blob)
		throws SQLException;

	public abstract void updateBlob(String s, Blob blob)
		throws SQLException;

	public abstract void updateBoolean(int i, boolean flag)
		throws SQLException;

	public abstract void updateBoolean(String s, boolean flag)
		throws SQLException;

	public abstract void updateByte(int i, byte byte0)
		throws SQLException;

	public abstract void updateByte(String s, byte byte0)
		throws SQLException;

	public abstract void updateBytes(int i, byte abyte0[])
		throws SQLException;

	public abstract void updateBytes(String s, byte abyte0[])
		throws SQLException;

	public abstract void updateCharacterStream(int i, Reader reader, int j)
		throws SQLException;

	public abstract void updateCharacterStream(String s, Reader reader, int i)
		throws SQLException;

	public abstract void updateClob(int i, Clob clob)
		throws SQLException;

	public abstract void updateClob(String s, Clob clob)
		throws SQLException;

	public abstract void updateDate(int i, Date date)
		throws SQLException;

	public abstract void updateDate(String s, Date date)
		throws SQLException;

	public abstract void updateDouble(int i, double d)
		throws SQLException;

	public abstract void updateDouble(String s, double d)
		throws SQLException;

	public abstract void updateFloat(int i, float f)
		throws SQLException;

	public abstract void updateFloat(String s, float f)
		throws SQLException;

	public abstract void updateInt(int i, int j)
		throws SQLException;

	public abstract void updateInt(String s, int i)
		throws SQLException;

	public abstract void updateLong(int i, long l)
		throws SQLException;

	public abstract void updateLong(String s, long l)
		throws SQLException;

	public abstract void updateNull(int i)
		throws SQLException;

	public abstract void updateNull(String s)
		throws SQLException;

	public abstract void updateObject(int i, Object obj)
		throws SQLException;

	public abstract void updateObject(int i, Object obj, int j)
		throws SQLException;

	public abstract void updateObject(String s, Object obj)
		throws SQLException;

	public abstract void updateObject(String s, Object obj, int i)
		throws SQLException;

	public abstract void updateRef(int i, Ref ref)
		throws SQLException;

	public abstract void updateRef(String s, Ref ref)
		throws SQLException;

	public abstract void updateRow()
		throws SQLException;

	public abstract void updateShort(int i, short word0)
		throws SQLException;

	public abstract void updateShort(String s, short word0)
		throws SQLException;

	public abstract void updateString(int i, String s)
		throws SQLException;

	public abstract void updateString(String s, String s1)
		throws SQLException;

	public abstract void updateTime(int i, Time time)
		throws SQLException;

	public abstract void updateTime(String s, Time time)
		throws SQLException;

	public abstract void updateTimestamp(int i, Timestamp timestamp)
		throws SQLException;

	public abstract void updateTimestamp(String s, Timestamp timestamp)
		throws SQLException;

	public abstract boolean wasNull()
		throws SQLException;
}
