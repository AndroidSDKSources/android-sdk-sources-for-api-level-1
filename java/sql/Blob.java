// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Blob.java

package java.sql;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package java.sql:
//			SQLException

public interface Blob
{

	public abstract InputStream getBinaryStream()
		throws SQLException;

	public abstract byte[] getBytes(long l, int i)
		throws SQLException;

	public abstract long length()
		throws SQLException;

	public abstract long position(Blob blob, long l)
		throws SQLException;

	public abstract long position(byte abyte0[], long l)
		throws SQLException;

	public abstract OutputStream setBinaryStream(long l)
		throws SQLException;

	public abstract int setBytes(long l, byte abyte0[])
		throws SQLException;

	public abstract int setBytes(long l, byte abyte0[], int i, int j)
		throws SQLException;

	public abstract void truncate(long l)
		throws SQLException;
}
