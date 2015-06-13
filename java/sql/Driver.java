// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Driver.java

package java.sql;

import java.util.Properties;

// Referenced classes of package java.sql:
//			SQLException, Connection, DriverPropertyInfo

public interface Driver
{

	public abstract boolean acceptsURL(String s)
		throws SQLException;

	public abstract Connection connect(String s, Properties properties)
		throws SQLException;

	public abstract int getMajorVersion();

	public abstract int getMinorVersion();

	public abstract DriverPropertyInfo[] getPropertyInfo(String s, Properties properties)
		throws SQLException;

	public abstract boolean jdbcCompliant();
}
