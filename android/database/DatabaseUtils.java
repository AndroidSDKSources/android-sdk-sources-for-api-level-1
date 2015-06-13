// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DatabaseUtils.java

package android.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import android.os.Parcel;
import java.io.FileNotFoundException;
import java.io.PrintStream;

// Referenced classes of package android.database:
//			Cursor

public class DatabaseUtils
{
	public static class InsertHelper
	{

		public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;

		public int getColumnIndex(String key)
		{
			throw new RuntimeException("Stub!");
		}

		public void bind(int index, double value)
		{
			throw new RuntimeException("Stub!");
		}

		public void bind(int index, float value)
		{
			throw new RuntimeException("Stub!");
		}

		public void bind(int index, long value)
		{
			throw new RuntimeException("Stub!");
		}

		public void bind(int index, int value)
		{
			throw new RuntimeException("Stub!");
		}

		public void bind(int index, boolean value)
		{
			throw new RuntimeException("Stub!");
		}

		public void bindNull(int index)
		{
			throw new RuntimeException("Stub!");
		}

		public void bind(int index, byte value[])
		{
			throw new RuntimeException("Stub!");
		}

		public void bind(int index, String value)
		{
			throw new RuntimeException("Stub!");
		}

		public long insert(ContentValues values)
		{
			throw new RuntimeException("Stub!");
		}

		public long execute()
		{
			throw new RuntimeException("Stub!");
		}

		public void prepareForInsert()
		{
			throw new RuntimeException("Stub!");
		}

		public void prepareForReplace()
		{
			throw new RuntimeException("Stub!");
		}

		public long replace(ContentValues values)
		{
			throw new RuntimeException("Stub!");
		}

		public void close()
		{
			throw new RuntimeException("Stub!");
		}

		public InsertHelper(SQLiteDatabase db, String tableName)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public DatabaseUtils()
	{
		throw new RuntimeException("Stub!");
	}

	public static final void writeExceptionToParcel(Parcel reply, Exception e)
	{
		throw new RuntimeException("Stub!");
	}

	public static final void readExceptionFromParcel(Parcel reply)
	{
		throw new RuntimeException("Stub!");
	}

	public static void readExceptionWithFileNotFoundExceptionFromParcel(Parcel reply)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public static void bindObjectToProgram(SQLiteProgram prog, int index, Object value)
	{
		throw new RuntimeException("Stub!");
	}

	public static void appendEscapedSQLString(StringBuilder sb, String sqlString)
	{
		throw new RuntimeException("Stub!");
	}

	public static String sqlEscapeString(String value)
	{
		throw new RuntimeException("Stub!");
	}

	public static final void appendValueToSql(StringBuilder sql, Object value)
	{
		throw new RuntimeException("Stub!");
	}

	public static String getCollationKey(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public static String getHexCollationKey(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public static void dumpCursor(Cursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public static void dumpCursor(Cursor cursor, PrintStream stream)
	{
		throw new RuntimeException("Stub!");
	}

	public static void dumpCursor(Cursor cursor, StringBuilder sb)
	{
		throw new RuntimeException("Stub!");
	}

	public static String dumpCursorToString(Cursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public static void dumpCurrentRow(Cursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public static void dumpCurrentRow(Cursor cursor, PrintStream stream)
	{
		throw new RuntimeException("Stub!");
	}

	public static void dumpCurrentRow(Cursor cursor, StringBuilder sb)
	{
		throw new RuntimeException("Stub!");
	}

	public static String dumpCurrentRowToString(Cursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public static void cursorStringToContentValues(Cursor cursor, String field, ContentValues values)
	{
		throw new RuntimeException("Stub!");
	}

	public static void cursorStringToInsertHelper(Cursor cursor, String field, InsertHelper inserter, int index)
	{
		throw new RuntimeException("Stub!");
	}

	public static void cursorStringToContentValues(Cursor cursor, String field, ContentValues values, String key)
	{
		throw new RuntimeException("Stub!");
	}

	public static void cursorIntToContentValues(Cursor cursor, String field, ContentValues values)
	{
		throw new RuntimeException("Stub!");
	}

	public static void cursorIntToContentValues(Cursor cursor, String field, ContentValues values, String key)
	{
		throw new RuntimeException("Stub!");
	}

	public static void cursorLongToContentValues(Cursor cursor, String field, ContentValues values)
	{
		throw new RuntimeException("Stub!");
	}

	public static void cursorLongToContentValues(Cursor cursor, String field, ContentValues values, String key)
	{
		throw new RuntimeException("Stub!");
	}

	public static void cursorDoubleToCursorValues(Cursor cursor, String field, ContentValues values)
	{
		throw new RuntimeException("Stub!");
	}

	public static void cursorDoubleToContentValues(Cursor cursor, String field, ContentValues values, String key)
	{
		throw new RuntimeException("Stub!");
	}

	public static void cursorRowToContentValues(Cursor cursor, ContentValues values)
	{
		throw new RuntimeException("Stub!");
	}

	public static long queryNumEntries(SQLiteDatabase db, String table)
	{
		throw new RuntimeException("Stub!");
	}

	public static long longForQuery(SQLiteDatabase db, String query, String selectionArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	public static long longForQuery(SQLiteStatement prog, String selectionArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	public static String stringForQuery(SQLiteDatabase db, String query, String selectionArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	public static String stringForQuery(SQLiteStatement prog, String selectionArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	public static void createDbFromSqlStatements(Context context, String dbName, int dbVersion, String sqlStatements)
	{
		throw new RuntimeException("Stub!");
	}
}
