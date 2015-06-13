// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SearchRecentSuggestionsProvider.java

package android.content;

import android.database.Cursor;
import android.net.Uri;

// Referenced classes of package android.content:
//			ContentProvider, ContentValues

public class SearchRecentSuggestionsProvider extends ContentProvider
{

	public static final int DATABASE_MODE_QUERIES = 1;
	public static final int DATABASE_MODE_2LINES = 2;

	public SearchRecentSuggestionsProvider()
	{
		throw new RuntimeException("Stub!");
	}

	protected void setupSuggestions(String authority, int mode)
	{
		throw new RuntimeException("Stub!");
	}

	public int delete(Uri uri, String selection, String selectionArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	public String getType(Uri uri)
	{
		throw new RuntimeException("Stub!");
	}

	public Uri insert(Uri uri, ContentValues values)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onCreate()
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor query(Uri uri, String projection[], String selection, String selectionArgs[], String sortOrder)
	{
		throw new RuntimeException("Stub!");
	}

	public int update(Uri uri, ContentValues values, String selection, String selectionArgs[])
	{
		throw new RuntimeException("Stub!");
	}
}
