// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SQLiteOpenHelper.java

package android.database.sqlite;

import android.content.Context;

// Referenced classes of package android.database.sqlite:
//			SQLiteDatabase

public abstract class SQLiteOpenHelper
{

	public SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized SQLiteDatabase getWritableDatabase()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized SQLiteDatabase getReadableDatabase()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void close()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void onCreate(SQLiteDatabase sqlitedatabase);

	public abstract void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j);

	public void onOpen(SQLiteDatabase db)
	{
		throw new RuntimeException("Stub!");
	}
}
