// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RingtoneManager.java

package android.media;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

// Referenced classes of package android.media:
//			Ringtone

public class RingtoneManager
{

	public static final int TYPE_RINGTONE = 1;
	public static final int TYPE_NOTIFICATION = 2;
	public static final int TYPE_ALARM = 4;
	public static final int TYPE_ALL = 7;
	public static final String ACTION_RINGTONE_PICKER = "android.intent.action.RINGTONE_PICKER";
	public static final String EXTRA_RINGTONE_SHOW_DEFAULT = "android.intent.extra.ringtone.SHOW_DEFAULT";
	public static final String EXTRA_RINGTONE_SHOW_SILENT = "android.intent.extra.ringtone.SHOW_SILENT";
	public static final String EXTRA_RINGTONE_INCLUDE_DRM = "android.intent.extra.ringtone.INCLUDE_DRM";
	public static final String EXTRA_RINGTONE_EXISTING_URI = "android.intent.extra.ringtone.EXISTING_URI";
	public static final String EXTRA_RINGTONE_DEFAULT_URI = "android.intent.extra.ringtone.DEFAULT_URI";
	public static final String EXTRA_RINGTONE_TYPE = "android.intent.extra.ringtone.TYPE";
	public static final String EXTRA_RINGTONE_TITLE = "android.intent.extra.ringtone.TITLE";
	public static final String EXTRA_RINGTONE_PICKED_URI = "android.intent.extra.ringtone.PICKED_URI";
	public static final int ID_COLUMN_INDEX = 0;
	public static final int TITLE_COLUMN_INDEX = 1;
	public static final int URI_COLUMN_INDEX = 2;

	public RingtoneManager(Activity activity)
	{
		throw new RuntimeException("Stub!");
	}

	public RingtoneManager(Context context)
	{
		throw new RuntimeException("Stub!");
	}

	public void setType(int type)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStopPreviousRingtone(boolean stopPreviousRingtone)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getStopPreviousRingtone()
	{
		throw new RuntimeException("Stub!");
	}

	public void stopPreviousRingtone()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getIncludeDrm()
	{
		throw new RuntimeException("Stub!");
	}

	public void setIncludeDrm(boolean includeDrm)
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor getCursor()
	{
		throw new RuntimeException("Stub!");
	}

	public Ringtone getRingtone(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public Uri getRingtoneUri(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public int getRingtonePosition(Uri ringtoneUri)
	{
		throw new RuntimeException("Stub!");
	}

	public static Uri getValidRingtoneUri(Context context)
	{
		throw new RuntimeException("Stub!");
	}

	public static Ringtone getRingtone(Context context, Uri ringtoneUri)
	{
		throw new RuntimeException("Stub!");
	}

	public static Uri getActualDefaultRingtoneUri(Context context, int type)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setActualDefaultRingtoneUri(Context context, int type, Uri ringtoneUri)
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isDefault(Uri ringtoneUri)
	{
		throw new RuntimeException("Stub!");
	}

	public static int getDefaultType(Uri defaultRingtoneUri)
	{
		throw new RuntimeException("Stub!");
	}

	public static Uri getDefaultUri(int type)
	{
		throw new RuntimeException("Stub!");
	}
}
