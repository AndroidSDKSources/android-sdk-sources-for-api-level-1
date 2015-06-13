// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Struct.java

package java.sql;

import java.util.Map;

// Referenced classes of package java.sql:
//			SQLException

public interface Struct
{

	public abstract String getSQLTypeName()
		throws SQLException;

	public abstract Object[] getAttributes()
		throws SQLException;

	public abstract Object[] getAttributes(Map map)
		throws SQLException;
}
