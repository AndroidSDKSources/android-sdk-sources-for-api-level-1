// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SQLOutput.java

package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;

// Referenced classes of package java.sql:
//			SQLException, Date, Time, Timestamp, 
//			SQLData, Ref, Blob, Clob, 
//			Struct, Array

public interface SQLOutput
{

	public abstract void writeString(String s)
		throws SQLException;

	public abstract void writeBoolean(boolean flag)
		throws SQLException;

	public abstract void writeByte(byte byte0)
		throws SQLException;

	public abstract void writeShort(short word0)
		throws SQLException;

	public abstract void writeInt(int i)
		throws SQLException;

	public abstract void writeLong(long l)
		throws SQLException;

	public abstract void writeFloat(float f)
		throws SQLException;

	public abstract void writeDouble(double d)
		throws SQLException;

	public abstract void writeBigDecimal(BigDecimal bigdecimal)
		throws SQLException;

	public abstract void writeBytes(byte abyte0[])
		throws SQLException;

	public abstract void writeDate(Date date)
		throws SQLException;

	public abstract void writeTime(Time time)
		throws SQLException;

	public abstract void writeTimestamp(Timestamp timestamp)
		throws SQLException;

	public abstract void writeCharacterStream(Reader reader)
		throws SQLException;

	public abstract void writeAsciiStream(InputStream inputstream)
		throws SQLException;

	public abstract void writeBinaryStream(InputStream inputstream)
		throws SQLException;

	public abstract void writeObject(SQLData sqldata)
		throws SQLException;

	public abstract void writeRef(Ref ref)
		throws SQLException;

	public abstract void writeBlob(Blob blob)
		throws SQLException;

	public abstract void writeClob(Clob clob)
		throws SQLException;

	public abstract void writeStruct(Struct struct)
		throws SQLException;

	public abstract void writeArray(Array array)
		throws SQLException;

	public abstract void writeURL(URL url)
		throws SQLException;
}
