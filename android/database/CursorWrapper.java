// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CursorWrapper.java

package android.database;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.database:
//			Cursor, CharArrayBuffer, ContentObserver, DataSetObserver

public class CursorWrapper
	implements Cursor
{

	public CursorWrapper(Cursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isClosed()
	{
		throw new RuntimeException("Stub!");
	}

	public int getCount()
	{
		throw new RuntimeException("Stub!");
	}

	public void deactivate()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean moveToFirst()
	{
		throw new RuntimeException("Stub!");
	}

	public int getColumnCount()
	{
		throw new RuntimeException("Stub!");
	}

	public int getColumnIndex(String columnName)
	{
		throw new RuntimeException("Stub!");
	}

	public int getColumnIndexOrThrow(String columnName)
		throws IllegalArgumentException
	{
		throw new RuntimeException("Stub!");
	}

	public String getColumnName(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] getColumnNames()
	{
		throw new RuntimeException("Stub!");
	}

	public double getDouble(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public Bundle getExtras()
	{
		throw new RuntimeException("Stub!");
	}

	public float getFloat(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public int getInt(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public long getLong(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public short getShort(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public String getString(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer)
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getBlob(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getWantsAllOnMoveCalls()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAfterLast()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isBeforeFirst()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isFirst()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isLast()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isNull(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean moveToLast()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean move(int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean moveToPosition(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean moveToNext()
	{
		throw new RuntimeException("Stub!");
	}

	public int getPosition()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean moveToPrevious()
	{
		throw new RuntimeException("Stub!");
	}

	public void registerContentObserver(ContentObserver observer)
	{
		throw new RuntimeException("Stub!");
	}

	public void registerDataSetObserver(DataSetObserver observer)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean requery()
	{
		throw new RuntimeException("Stub!");
	}

	public Bundle respond(Bundle extras)
	{
		throw new RuntimeException("Stub!");
	}

	public void setNotificationUri(ContentResolver cr, Uri uri)
	{
		throw new RuntimeException("Stub!");
	}

	public void unregisterContentObserver(ContentObserver observer)
	{
		throw new RuntimeException("Stub!");
	}

	public void unregisterDataSetObserver(DataSetObserver observer)
	{
		throw new RuntimeException("Stub!");
	}
}
