// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SQLiteCursor.java

package android.database.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CursorWindow;

// Referenced classes of package android.database.sqlite:
//			SQLiteDatabase, SQLiteCursorDriver, SQLiteQuery

public class SQLiteCursor extends AbstractWindowedCursor
{

	public SQLiteCursor(SQLiteDatabase db, SQLiteCursorDriver driver, String editTable, SQLiteQuery query)
	{
		throw new RuntimeException("Stub!");
	}

	public SQLiteDatabase getDatabase()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onMove(int oldPosition, int newPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public int getCount()
	{
		throw new RuntimeException("Stub!");
	}

	public int getColumnIndex(String columnName)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] getColumnNames()
	{
		throw new RuntimeException("Stub!");
	}

	public void deactivate()
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean requery()
	{
		throw new RuntimeException("Stub!");
	}

	public void setWindow(CursorWindow window)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelectionArguments(String selectionArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}
}
