// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Clob.java

package java.sql;

import java.io.*;

// Referenced classes of package java.sql:
//			SQLException

public interface Clob
{

	public abstract InputStream getAsciiStream()
		throws SQLException;

	public abstract Reader getCharacterStream()
		throws SQLException;

	public abstract String getSubString(long l, int i)
		throws SQLException;

	public abstract long length()
		throws SQLException;

	public abstract long position(Clob clob, long l)
		throws SQLException;

	public abstract long position(String s, long l)
		throws SQLException;

	public abstract OutputStream setAsciiStream(long l)
		throws SQLException;

	public abstract Writer setCharacterStream(long l)
		throws SQLException;

	public abstract int setString(long l, String s)
		throws SQLException;

	public abstract int setString(long l, String s, int i, int j)
		throws SQLException;

	public abstract void truncate(long l)
		throws SQLException;
}
