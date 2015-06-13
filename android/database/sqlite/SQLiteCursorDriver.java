// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SQLiteCursorDriver.java

package android.database.sqlite;

import android.database.Cursor;

// Referenced classes of package android.database.sqlite:
//			SQLiteDatabase

public interface SQLiteCursorDriver
{

	public abstract Cursor query(SQLiteDatabase.CursorFactory cursorfactory, String as[]);

	public abstract void cursorDeactivated();

	public abstract void cursorRequeried(Cursor cursor);

	public abstract void cursorClosed();

	public abstract void setBindArguments(String as[]);
}
