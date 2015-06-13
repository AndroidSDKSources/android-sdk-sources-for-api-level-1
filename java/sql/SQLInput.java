// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SQLInput.java

package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;

// Referenced classes of package java.sql:
//			SQLException, Date, Time, Timestamp, 
//			Ref, Blob, Clob, Array

public interface SQLInput
{

	public abstract String readString()
		throws SQLException;

	public abstract boolean readBoolean()
		throws SQLException;

	public abstract byte readByte()
		throws SQLException;

	public abstract short readShort()
		throws SQLException;

	public abstract int readInt()
		throws SQLException;

	public abstract long readLong()
		throws SQLException;

	public abstract float readFloat()
		throws SQLException;

	public abstract double readDouble()
		throws SQLException;

	public abstract BigDecimal readBigDecimal()
		throws SQLException;

	public abstract byte[] readBytes()
		throws SQLException;

	public abstract Date readDate()
		throws SQLException;

	public abstract Time readTime()
		throws SQLException;

	public abstract Timestamp readTimestamp()
		throws SQLException;

	public abstract Reader readCharacterStream()
		throws SQLException;

	public abstract InputStream readAsciiStream()
		throws SQLException;

	public abstract InputStream readBinaryStream()
		throws SQLException;

	public abstract Object readObject()
		throws SQLException;

	public abstract Ref readRef()
		throws SQLException;

	public abstract Blob readBlob()
		throws SQLException;

	public abstract Clob readClob()
		throws SQLException;

	public abstract Array readArray()
		throws SQLException;

	public abstract boolean wasNull()
		throws SQLException;

	public abstract URL readURL()
		throws SQLException;
}
