// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RowSetWriter.java

package javax.sql;

import java.sql.SQLException;

// Referenced classes of package javax.sql:
//			RowSetInternal

public interface RowSetWriter
{

	public abstract boolean writeData(RowSetInternal rowsetinternal)
		throws SQLException;
}
