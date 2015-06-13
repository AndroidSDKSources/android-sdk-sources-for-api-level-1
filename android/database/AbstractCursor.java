// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractCursor.java

package android.database;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;

// Referenced classes of package android.database:
//			CrossProcessCursor, CursorWindow, CharArrayBuffer, ContentObserver, 
//			DataSetObserver

public abstract class AbstractCursor
	implements CrossProcessCursor
{

	protected HashMap mUpdatedRows;
	protected int mRowIdColumnIndex;
	protected int mPos;
	protected Long mCurrentRowID;
	protected ContentResolver mContentResolver;
	protected boolean mClosed;

	public AbstractCursor()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int getCount();

	public abstract String[] getColumnNames();

	public abstract String getString(int i);

	public abstract short getShort(int i);

	public abstract int getInt(int i);

	public abstract long getLong(int i);

	public abstract float getFloat(int i);

	public abstract double getDouble(int i);

	public abstract boolean isNull(int i);

	public byte[] getBlob(int column)
	{
		throw new RuntimeException("Stub!");
	}

	public CursorWindow getWindow()
	{
		throw new RuntimeException("Stub!");
	}

	public int getColumnCount()
	{
		throw new RuntimeException("Stub!");
	}

	public void deactivate()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean requery()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isClosed()
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onMove(int oldPosition, int newPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getPosition()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean moveToPosition(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public void fillWindow(int position, CursorWindow window)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean move(int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean moveToFirst()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean moveToLast()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean moveToNext()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean moveToPrevious()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isFirst()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isLast()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isBeforeFirst()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isAfterLast()
	{
		throw new RuntimeException("Stub!");
	}

	public int getColumnIndex(String columnName)
	{
		throw new RuntimeException("Stub!");
	}

	public int getColumnIndexOrThrow(String columnName)
	{
		throw new RuntimeException("Stub!");
	}

	public String getColumnName(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public void registerContentObserver(ContentObserver observer)
	{
		throw new RuntimeException("Stub!");
	}

	public void unregisterContentObserver(ContentObserver observer)
	{
		throw new RuntimeException("Stub!");
	}

	public void registerDataSetObserver(DataSetObserver observer)
	{
		throw new RuntimeException("Stub!");
	}

	public void unregisterDataSetObserver(DataSetObserver observer)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onChange(boolean selfChange)
	{
		throw new RuntimeException("Stub!");
	}

	public void setNotificationUri(ContentResolver cr, Uri notifyUri)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getWantsAllOnMoveCalls()
	{
		throw new RuntimeException("Stub!");
	}

	public Bundle getExtras()
	{
		throw new RuntimeException("Stub!");
	}

	public Bundle respond(Bundle extras)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean isFieldUpdated(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	protected Object getUpdatedField(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	protected void checkPosition()
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}
}
