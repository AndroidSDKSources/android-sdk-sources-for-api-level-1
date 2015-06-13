// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Cursor.java

package android.database;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.database:
//			CharArrayBuffer, ContentObserver, DataSetObserver

public interface Cursor
{

	public abstract int getCount();

	public abstract int getPosition();

	public abstract boolean move(int i);

	public abstract boolean moveToPosition(int i);

	public abstract boolean moveToFirst();

	public abstract boolean moveToLast();

	public abstract boolean moveToNext();

	public abstract boolean moveToPrevious();

	public abstract boolean isFirst();

	public abstract boolean isLast();

	public abstract boolean isBeforeFirst();

	public abstract boolean isAfterLast();

	public abstract int getColumnIndex(String s);

	public abstract int getColumnIndexOrThrow(String s)
		throws IllegalArgumentException;

	public abstract String getColumnName(int i);

	public abstract String[] getColumnNames();

	public abstract int getColumnCount();

	public abstract byte[] getBlob(int i);

	public abstract String getString(int i);

	public abstract void copyStringToBuffer(int i, CharArrayBuffer chararraybuffer);

	public abstract short getShort(int i);

	public abstract int getInt(int i);

	public abstract long getLong(int i);

	public abstract float getFloat(int i);

	public abstract double getDouble(int i);

	public abstract boolean isNull(int i);

	public abstract void deactivate();

	public abstract boolean requery();

	public abstract void close();

	public abstract boolean isClosed();

	public abstract void registerContentObserver(ContentObserver contentobserver);

	public abstract void unregisterContentObserver(ContentObserver contentobserver);

	public abstract void registerDataSetObserver(DataSetObserver datasetobserver);

	public abstract void unregisterDataSetObserver(DataSetObserver datasetobserver);

	public abstract void setNotificationUri(ContentResolver contentresolver, Uri uri);

	public abstract boolean getWantsAllOnMoveCalls();

	public abstract Bundle getExtras();

	public abstract Bundle respond(Bundle bundle);
}
