// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RowSetReader.java

package javax.sql;

import java.sql.SQLException;

// Referenced classes of package javax.sql:
//			RowSetInternal

public interface RowSetReader
{

	public abstract void readData(RowSetInternal rowsetinternal)
		throws SQLException;
}
