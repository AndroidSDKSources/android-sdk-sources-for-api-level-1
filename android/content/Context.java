// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Context.java

package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.*;
import android.util.AttributeSet;
import java.io.*;

// Referenced classes of package android.content:
//			ContentResolver, SharedPreferences, Intent, BroadcastReceiver, 
//			IntentFilter, ComponentName, ServiceConnection

public abstract class Context
{

	public static final int MODE_PRIVATE = 0;
	public static final int MODE_WORLD_READABLE = 1;
	public static final int MODE_WORLD_WRITEABLE = 2;
	public static final int MODE_APPEND = 32768;
	public static final int BIND_AUTO_CREATE = 1;
	public static final int BIND_DEBUG_UNBIND = 2;
	public static final String POWER_SERVICE = "power";
	public static final String WINDOW_SERVICE = "window";
	public static final String LAYOUT_INFLATER_SERVICE = "layout_inflater";
	public static final String ACTIVITY_SERVICE = "activity";
	public static final String ALARM_SERVICE = "alarm";
	public static final String NOTIFICATION_SERVICE = "notification";
	public static final String KEYGUARD_SERVICE = "keyguard";
	public static final String LOCATION_SERVICE = "location";
	public static final String SEARCH_SERVICE = "search";
	public static final String SENSOR_SERVICE = "sensor";
	public static final String WALLPAPER_SERVICE = "wallpaper";
	public static final String VIBRATOR_SERVICE = "vibrator";
	public static final String CONNECTIVITY_SERVICE = "connectivity";
	public static final String WIFI_SERVICE = "wifi";
	public static final String AUDIO_SERVICE = "audio";
	public static final String TELEPHONY_SERVICE = "phone";
	public static final String CLIPBOARD_SERVICE = "clipboard";
	public static final int CONTEXT_INCLUDE_CODE = 1;
	public static final int CONTEXT_IGNORE_SECURITY = 2;

	public Context()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract AssetManager getAssets();

	public abstract Resources getResources();

	public abstract PackageManager getPackageManager();

	public abstract ContentResolver getContentResolver();

	public abstract Looper getMainLooper();

	public abstract Context getApplicationContext();

	public final CharSequence getText(int resId)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getString(int resId)
	{
		throw new RuntimeException("Stub!");
	}

	public final transient String getString(int resId, Object formatArgs[])
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void setTheme(int i);

	public abstract android.content.res.Resources.Theme getTheme();

	public final TypedArray obtainStyledAttributes(int attrs[])
	{
		throw new RuntimeException("Stub!");
	}

	public final TypedArray obtainStyledAttributes(int resid, int attrs[])
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public final TypedArray obtainStyledAttributes(AttributeSet set, int attrs[])
	{
		throw new RuntimeException("Stub!");
	}

	public final TypedArray obtainStyledAttributes(AttributeSet set, int attrs[], int defStyleAttr, int defStyleRes)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract ClassLoader getClassLoader();

	public abstract String getPackageName();

	public abstract SharedPreferences getSharedPreferences(String s, int i);

	public abstract FileInputStream openFileInput(String s)
		throws FileNotFoundException;

	public abstract FileOutputStream openFileOutput(String s, int i)
		throws FileNotFoundException;

	public abstract boolean deleteFile(String s);

	public abstract File getFileStreamPath(String s);

	public abstract File getFilesDir();

	public abstract File getCacheDir();

	public abstract String[] fileList();

	public abstract File getDir(String s, int i);

	public abstract SQLiteDatabase openOrCreateDatabase(String s, int i, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory);

	public abstract boolean deleteDatabase(String s);

	public abstract File getDatabasePath(String s);

	public abstract String[] databaseList();

	public abstract Drawable getWallpaper();

	public abstract Drawable peekWallpaper();

	public abstract int getWallpaperDesiredMinimumWidth();

	public abstract int getWallpaperDesiredMinimumHeight();

	public abstract void setWallpaper(Bitmap bitmap)
		throws IOException;

	public abstract void setWallpaper(InputStream inputstream)
		throws IOException;

	public abstract void clearWallpaper()
		throws IOException;

	public abstract void startActivity(Intent intent);

	public abstract void sendBroadcast(Intent intent);

	public abstract void sendBroadcast(Intent intent, String s);

	public abstract void sendOrderedBroadcast(Intent intent, String s);

	public abstract void sendOrderedBroadcast(Intent intent, String s, BroadcastReceiver broadcastreceiver, Handler handler, int i, String s1, Bundle bundle);

	public abstract void sendStickyBroadcast(Intent intent);

	public abstract void removeStickyBroadcast(Intent intent);

	public abstract Intent registerReceiver(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter);

	public abstract Intent registerReceiver(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter, String s, Handler handler);

	public abstract void unregisterReceiver(BroadcastReceiver broadcastreceiver);

	public abstract ComponentName startService(Intent intent);

	public abstract boolean stopService(Intent intent);

	public abstract boolean bindService(Intent intent, ServiceConnection serviceconnection, int i);

	public abstract void unbindService(ServiceConnection serviceconnection);

	public abstract boolean startInstrumentation(ComponentName componentname, String s, Bundle bundle);

	public abstract Object getSystemService(String s);

	public abstract int checkPermission(String s, int i, int j);

	public abstract int checkCallingPermission(String s);

	public abstract int checkCallingOrSelfPermission(String s);

	public abstract void enforcePermission(String s, int i, int j, String s1);

	public abstract void enforceCallingPermission(String s, String s1);

	public abstract void enforceCallingOrSelfPermission(String s, String s1);

	public abstract void grantUriPermission(String s, Uri uri, int i);

	public abstract void revokeUriPermission(Uri uri, int i);

	public abstract int checkUriPermission(Uri uri, int i, int j, int k);

	public abstract int checkCallingUriPermission(Uri uri, int i);

	public abstract int checkCallingOrSelfUriPermission(Uri uri, int i);

	public abstract int checkUriPermission(Uri uri, String s, String s1, int i, int j, int k);

	public abstract void enforceUriPermission(Uri uri, int i, int j, int k, String s);

	public abstract void enforceCallingUriPermission(Uri uri, int i, String s);

	public abstract void enforceCallingOrSelfUriPermission(Uri uri, int i, String s);

	public abstract void enforceUriPermission(Uri uri, String s, String s1, int i, int j, int k, String s2);

	public abstract Context createPackageContext(String s, int i)
		throws android.content.pm.PackageManager.NameNotFoundException;
}
