// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Savepoint.java

package java.sql;


// Referenced classes of package java.sql:
//			SQLException

public interface Savepoint
{

	public abstract int getSavepointId()
		throws SQLException;

	public abstract String getSavepointName()
		throws SQLException;
}
