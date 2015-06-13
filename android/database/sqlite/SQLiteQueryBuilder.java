// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SQLiteQueryBuilder.java

package android.database.sqlite;

import android.database.Cursor;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.database.sqlite:
//			SQLiteDatabase

public class SQLiteQueryBuilder
{

	public SQLiteQueryBuilder()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDistinct(boolean distinct)
	{
		throw new RuntimeException("Stub!");
	}

	public String getTables()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTables(String inTables)
	{
		throw new RuntimeException("Stub!");
	}

	public void appendWhere(CharSequence inWhere)
	{
		throw new RuntimeException("Stub!");
	}

	public void appendWhereEscapeString(String inWhere)
	{
		throw new RuntimeException("Stub!");
	}

	public void setProjectionMap(Map columnMap)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCursorFactory(SQLiteDatabase.CursorFactory factory)
	{
		throw new RuntimeException("Stub!");
	}

	public static String buildQueryString(boolean distinct, String tables, String columns[], String where, String groupBy, String having, String orderBy, String limit)
	{
		throw new RuntimeException("Stub!");
	}

	public static void appendColumns(StringBuilder s, String columns[])
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor query(SQLiteDatabase db, String projectionIn[], String selection, String selectionArgs[], String groupBy, String having, String sortOrder)
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor query(SQLiteDatabase db, String projectionIn[], String selection, String selectionArgs[], String groupBy, String having, String sortOrder, 
			String limit)
	{
		throw new RuntimeException("Stub!");
	}

	public String buildQuery(String projectionIn[], String selection, String selectionArgs[], String groupBy, String having, String sortOrder, String limit)
	{
		throw new RuntimeException("Stub!");
	}

	public String buildUnionSubQuery(String typeDiscriminatorColumn, String unionColumns[], Set columnsPresentInTable, int computedColumnsOffset, String typeDiscriminatorValue, String selection, String selectionArgs[], 
			String groupBy, String having)
	{
		throw new RuntimeException("Stub!");
	}

	public String buildUnionQuery(String subQueries[], String sortOrder, String limit)
	{
		throw new RuntimeException("Stub!");
	}
}
