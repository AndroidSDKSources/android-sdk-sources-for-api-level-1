// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SQLiteDatabase.java

package android.database.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import java.io.File;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package android.database.sqlite:
//			SQLiteClosable, SQLiteStatement, SQLiteCursorDriver, SQLiteQuery

public class SQLiteDatabase extends SQLiteClosable
{
	public static interface CursorFactory
	{

		public abstract Cursor newCursor(SQLiteDatabase sqlitedatabase, SQLiteCursorDriver sqlitecursordriver, String s, SQLiteQuery sqlitequery);
	}


	public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
	public static final int OPEN_READWRITE = 0;
	public static final int OPEN_READONLY = 1;
	public static final int NO_LOCALIZED_COLLATORS = 16;
	public static final int CREATE_IF_NECESSARY = 0x10000000;

	SQLiteDatabase()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onAllReferencesReleased()
	{
		throw new RuntimeException("Stub!");
	}

	public static native int releaseMemory();

	public void setLockingEnabled(boolean lockingEnabled)
	{
		throw new RuntimeException("Stub!");
	}

	public void beginTransaction()
	{
		throw new RuntimeException("Stub!");
	}

	public void endTransaction()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTransactionSuccessful()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean inTransaction()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isDbLockedByCurrentThread()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isDbLockedByOtherThreads()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean yieldIfContended()
	{
		throw new RuntimeException("Stub!");
	}

	public Map getSyncedTables()
	{
		throw new RuntimeException("Stub!");
	}

	public static SQLiteDatabase openDatabase(String path, CursorFactory factory, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public static SQLiteDatabase openOrCreateDatabase(File file, CursorFactory factory)
	{
		throw new RuntimeException("Stub!");
	}

	public static SQLiteDatabase openOrCreateDatabase(String path, CursorFactory factory)
	{
		throw new RuntimeException("Stub!");
	}

	public static SQLiteDatabase create(CursorFactory factory)
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
	{
		throw new RuntimeException("Stub!");
	}

	public int getVersion()
	{
		throw new RuntimeException("Stub!");
	}

	public void setVersion(int version)
	{
		throw new RuntimeException("Stub!");
	}

	public long getMaximumSize()
	{
		throw new RuntimeException("Stub!");
	}

	public long setMaximumSize(long numBytes)
	{
		throw new RuntimeException("Stub!");
	}

	public long getPageSize()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPageSize(long numBytes)
	{
		throw new RuntimeException("Stub!");
	}

	public void markTableSyncable(String table, String deletedTable)
	{
		throw new RuntimeException("Stub!");
	}

	public void markTableSyncable(String table, String foreignKey, String updateTable)
	{
		throw new RuntimeException("Stub!");
	}

	public static String findEditTable(String tables)
	{
		throw new RuntimeException("Stub!");
	}

	public SQLiteStatement compileStatement(String sql)
		throws SQLException
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor query(boolean distinct, String table, String columns[], String selection, String selectionArgs[], String groupBy, String having, 
			String orderBy, String limit)
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor queryWithFactory(CursorFactory cursorFactory, boolean distinct, String table, String columns[], String selection, String selectionArgs[], String groupBy, 
			String having, String orderBy, String limit)
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor query(String table, String columns[], String selection, String selectionArgs[], String groupBy, String having, String orderBy)
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor query(String table, String columns[], String selection, String selectionArgs[], String groupBy, String having, String orderBy, 
			String limit)
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor rawQuery(String sql, String selectionArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String sql, String selectionArgs[], String editTable)
	{
		throw new RuntimeException("Stub!");
	}

	public long insert(String table, String nullColumnHack, ContentValues values)
	{
		throw new RuntimeException("Stub!");
	}

	public long insertOrThrow(String table, String nullColumnHack, ContentValues values)
		throws SQLException
	{
		throw new RuntimeException("Stub!");
	}

	public long replace(String table, String nullColumnHack, ContentValues initialValues)
	{
		throw new RuntimeException("Stub!");
	}

	public long replaceOrThrow(String table, String nullColumnHack, ContentValues initialValues)
		throws SQLException
	{
		throw new RuntimeException("Stub!");
	}

	public int delete(String table, String whereClause, String whereArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	public int update(String table, ContentValues values, String whereClause, String whereArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	public void execSQL(String sql)
		throws SQLException
	{
		throw new RuntimeException("Stub!");
	}

	public void execSQL(String sql, Object bindArgs[])
		throws SQLException
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isReadOnly()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isOpen()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean needUpgrade(int newVersion)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getPath()
	{
		throw new RuntimeException("Stub!");
	}

	public void setLocale(Locale locale)
	{
		throw new RuntimeException("Stub!");
	}
}
