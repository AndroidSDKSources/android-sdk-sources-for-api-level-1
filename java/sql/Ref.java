// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Ref.java

package java.sql;

import java.util.Map;

// Referenced classes of package java.sql:
//			SQLException

public interface Ref
{

	public abstract String getBaseTypeName()
		throws SQLException;

	public abstract Object getObject()
		throws SQLException;

	public abstract Object getObject(Map map)
		throws SQLException;

	public abstract void setObject(Object obj)
		throws SQLException;
}
