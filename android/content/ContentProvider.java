// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ContentProvider.java

package android.content;

import android.content.pm.ProviderInfo;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

// Referenced classes of package android.content:
//			ComponentCallbacks, Context, ContentValues

public abstract class ContentProvider
	implements ComponentCallbacks
{

	public ContentProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public final Context getContext()
	{
		throw new RuntimeException("Stub!");
	}

	protected final void setReadPermission(String permission)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getReadPermission()
	{
		throw new RuntimeException("Stub!");
	}

	protected final void setWritePermission(String permission)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getWritePermission()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean onCreate();

	public void onConfigurationChanged(Configuration newConfig)
	{
		throw new RuntimeException("Stub!");
	}

	public void onLowMemory()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Cursor query(Uri uri, String as[], String s, String as1[], String s1);

	public abstract String getType(Uri uri);

	public abstract Uri insert(Uri uri, ContentValues contentvalues);

	public int bulkInsert(Uri uri, ContentValues values[])
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int delete(Uri uri, String s, String as[]);

	public abstract int update(Uri uri, ContentValues contentvalues, String s, String as[]);

	public ParcelFileDescriptor openFile(Uri uri, String mode)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	protected final ParcelFileDescriptor openFileHelper(Uri uri, String mode)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean isTemporary()
	{
		throw new RuntimeException("Stub!");
	}

	public void attachInfo(Context context, ProviderInfo info)
	{
		throw new RuntimeException("Stub!");
	}
}
