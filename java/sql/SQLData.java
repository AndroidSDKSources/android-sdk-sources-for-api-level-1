// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SQLData.java

package java.sql;


// Referenced classes of package java.sql:
//			SQLException, SQLInput, SQLOutput

public interface SQLData
{

	public abstract String getSQLTypeName()
		throws SQLException;

	public abstract void readSQL(SQLInput sqlinput, String s)
		throws SQLException;

	public abstract void writeSQL(SQLOutput sqloutput)
		throws SQLException;
}
