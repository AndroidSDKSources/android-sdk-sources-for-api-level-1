// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ContentQueryMap.java

package android.content;

import android.database.Cursor;
import android.os.Handler;
import java.util.Map;
import java.util.Observable;

// Referenced classes of package android.content:
//			ContentValues

public class ContentQueryMap extends Observable
{

	public ContentQueryMap(Cursor cursor, String columnNameOfKey, boolean keepUpdated, Handler handlerForUpdateNotifications)
	{
		throw new RuntimeException("Stub!");
	}

	public void setKeepUpdated(boolean keepUpdated)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized ContentValues getValues(String rowName)
	{
		throw new RuntimeException("Stub!");
	}

	public void requery()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Map getRows()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void close()
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}
}
