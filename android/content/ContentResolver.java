// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ContentResolver.java

package android.content;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.*;

// Referenced classes of package android.content:
//			Context, ContentValues

public abstract class ContentResolver
{

	public static final String SYNC_EXTRAS_ACCOUNT = "account";
	public static final String SYNC_EXTRAS_EXPEDITED = "expedited";
	public static final String SYNC_EXTRAS_FORCE = "force";
	public static final String SYNC_EXTRAS_UPLOAD = "upload";
	public static final String SYNC_EXTRAS_OVERRIDE_TOO_MANY_DELETIONS = "deletions_override";
	public static final String SYNC_EXTRAS_DISCARD_LOCAL_DELETIONS = "discard_deletions";
	public static final String SCHEME_CONTENT = "content";
	public static final String SCHEME_ANDROID_RESOURCE = "android.resource";
	public static final String SCHEME_FILE = "file";
	public static final String CURSOR_ITEM_BASE_TYPE = "vnd.android.cursor.item";
	public static final String CURSOR_DIR_BASE_TYPE = "vnd.android.cursor.dir";

	public ContentResolver(Context context)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getType(Uri url)
	{
		throw new RuntimeException("Stub!");
	}

	public final Cursor query(Uri uri, String projection[], String selection, String selectionArgs[], String sortOrder)
	{
		throw new RuntimeException("Stub!");
	}

	public final InputStream openInputStream(Uri uri)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public final OutputStream openOutputStream(Uri uri)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public final ParcelFileDescriptor openFileDescriptor(Uri uri, String mode)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public final Uri insert(Uri url, ContentValues values)
	{
		throw new RuntimeException("Stub!");
	}

	public final int bulkInsert(Uri url, ContentValues values[])
	{
		throw new RuntimeException("Stub!");
	}

	public final int delete(Uri url, String where, String selectionArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	public final int update(Uri uri, ContentValues values, String where, String selectionArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	public final void registerContentObserver(Uri uri, boolean notifyForDescendents, ContentObserver observer)
	{
		throw new RuntimeException("Stub!");
	}

	public final void unregisterContentObserver(ContentObserver observer)
	{
		throw new RuntimeException("Stub!");
	}

	public void notifyChange(Uri uri, ContentObserver observer)
	{
		throw new RuntimeException("Stub!");
	}

	public void notifyChange(Uri uri, ContentObserver observer, boolean syncToNetwork)
	{
		throw new RuntimeException("Stub!");
	}

	public void startSync(Uri uri, Bundle extras)
	{
		throw new RuntimeException("Stub!");
	}

	public static void validateSyncExtrasBundle(Bundle extras)
	{
		throw new RuntimeException("Stub!");
	}

	public void cancelSync(Uri uri)
	{
		throw new RuntimeException("Stub!");
	}
}
