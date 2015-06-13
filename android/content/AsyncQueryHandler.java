// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AsyncQueryHandler.java

package android.content;

import android.database.Cursor;
import android.net.Uri;
import android.os.*;

// Referenced classes of package android.content:
//			ContentResolver, ContentValues

public abstract class AsyncQueryHandler extends Handler
{

	public AsyncQueryHandler(ContentResolver cr)
	{
		throw new RuntimeException("Stub!");
	}

	protected Handler createHandler(Looper looper)
	{
		throw new RuntimeException("Stub!");
	}

	public void startQuery(int token, Object cookie, Uri uri, String projection[], String selection, String selectionArgs[], String orderBy)
	{
		throw new RuntimeException("Stub!");
	}

	public final void cancelOperation(int token)
	{
		throw new RuntimeException("Stub!");
	}

	public final void startInsert(int token, Object cookie, Uri uri, ContentValues initialValues)
	{
		throw new RuntimeException("Stub!");
	}

	public final void startUpdate(int token, Object cookie, Uri uri, ContentValues values, String selection, String selectionArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	public final void startDelete(int token, Object cookie, Uri uri, String selection, String selectionArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	protected void onQueryComplete(int token, Object cookie, Cursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onInsertComplete(int token, Object cookie, Uri uri)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onUpdateComplete(int token, Object cookie, int result)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDeleteComplete(int token, Object cookie, int result)
	{
		throw new RuntimeException("Stub!");
	}

	public void handleMessage(Message msg)
	{
		throw new RuntimeException("Stub!");
	}
}
