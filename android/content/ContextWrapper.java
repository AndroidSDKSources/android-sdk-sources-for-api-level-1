// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ContextWrapper.java

package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.*;
import java.io.*;

// Referenced classes of package android.content:
//			Context, ContentResolver, SharedPreferences, Intent, 
//			BroadcastReceiver, IntentFilter, ComponentName, ServiceConnection

public class ContextWrapper extends Context
{

	public ContextWrapper(Context base)
	{
		throw new RuntimeException("Stub!");
	}

	protected void attachBaseContext(Context base)
	{
		throw new RuntimeException("Stub!");
	}

	public Context getBaseContext()
	{
		throw new RuntimeException("Stub!");
	}

	public AssetManager getAssets()
	{
		throw new RuntimeException("Stub!");
	}

	public Resources getResources()
	{
		throw new RuntimeException("Stub!");
	}

	public PackageManager getPackageManager()
	{
		throw new RuntimeException("Stub!");
	}

	public ContentResolver getContentResolver()
	{
		throw new RuntimeException("Stub!");
	}

	public Looper getMainLooper()
	{
		throw new RuntimeException("Stub!");
	}

	public Context getApplicationContext()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTheme(int resid)
	{
		throw new RuntimeException("Stub!");
	}

	public android.content.res.Resources.Theme getTheme()
	{
		throw new RuntimeException("Stub!");
	}

	public ClassLoader getClassLoader()
	{
		throw new RuntimeException("Stub!");
	}

	public String getPackageName()
	{
		throw new RuntimeException("Stub!");
	}

	public String getPackageResourcePath()
	{
		throw new RuntimeException("Stub!");
	}

	public String getPackageCodePath()
	{
		throw new RuntimeException("Stub!");
	}

	public SharedPreferences getSharedPreferences(String name, int mode)
	{
		throw new RuntimeException("Stub!");
	}

	public FileInputStream openFileInput(String name)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public FileOutputStream openFileOutput(String name, int mode)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean deleteFile(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public File getFileStreamPath(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] fileList()
	{
		throw new RuntimeException("Stub!");
	}

	public File getFilesDir()
	{
		throw new RuntimeException("Stub!");
	}

	public File getCacheDir()
	{
		throw new RuntimeException("Stub!");
	}

	public File getDir(String name, int mode)
	{
		throw new RuntimeException("Stub!");
	}

	public SQLiteDatabase openOrCreateDatabase(String name, int mode, android.database.sqlite.SQLiteDatabase.CursorFactory factory)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean deleteDatabase(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public File getDatabasePath(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] databaseList()
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getWallpaper()
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable peekWallpaper()
	{
		throw new RuntimeException("Stub!");
	}

	public int getWallpaperDesiredMinimumWidth()
	{
		throw new RuntimeException("Stub!");
	}

	public int getWallpaperDesiredMinimumHeight()
	{
		throw new RuntimeException("Stub!");
	}

	public void setWallpaper(Bitmap bitmap)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setWallpaper(InputStream data)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void clearWallpaper()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void startActivity(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendBroadcast(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendBroadcast(Intent intent, String receiverPermission)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendOrderedBroadcast(Intent intent, String receiverPermission)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendOrderedBroadcast(Intent intent, String receiverPermission, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendStickyBroadcast(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeStickyBroadcast(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter)
	{
		throw new RuntimeException("Stub!");
	}

	public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler)
	{
		throw new RuntimeException("Stub!");
	}

	public void unregisterReceiver(BroadcastReceiver receiver)
	{
		throw new RuntimeException("Stub!");
	}

	public ComponentName startService(Intent service)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean stopService(Intent name)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean bindService(Intent service, ServiceConnection conn, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public void unbindService(ServiceConnection conn)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean startInstrumentation(ComponentName className, String profileFile, Bundle arguments)
	{
		throw new RuntimeException("Stub!");
	}

	public Object getSystemService(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public int checkPermission(String permission, int pid, int uid)
	{
		throw new RuntimeException("Stub!");
	}

	public int checkCallingPermission(String permission)
	{
		throw new RuntimeException("Stub!");
	}

	public int checkCallingOrSelfPermission(String permission)
	{
		throw new RuntimeException("Stub!");
	}

	public void enforcePermission(String permission, int pid, int uid, String message)
	{
		throw new RuntimeException("Stub!");
	}

	public void enforceCallingPermission(String permission, String message)
	{
		throw new RuntimeException("Stub!");
	}

	public void enforceCallingOrSelfPermission(String permission, String message)
	{
		throw new RuntimeException("Stub!");
	}

	public void grantUriPermission(String toPackage, Uri uri, int modeFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public void revokeUriPermission(Uri uri, int modeFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public int checkCallingUriPermission(Uri uri, int modeFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public int checkCallingOrSelfUriPermission(Uri uri, int modeFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public int checkUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public void enforceUriPermission(Uri uri, int pid, int uid, int modeFlags, String message)
	{
		throw new RuntimeException("Stub!");
	}

	public void enforceCallingUriPermission(Uri uri, int modeFlags, String message)
	{
		throw new RuntimeException("Stub!");
	}

	public void enforceCallingOrSelfUriPermission(Uri uri, int modeFlags, String message)
	{
		throw new RuntimeException("Stub!");
	}

	public void enforceUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags, String message)
	{
		throw new RuntimeException("Stub!");
	}

	public Context createPackageContext(String packageName, int flags)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		throw new RuntimeException("Stub!");
	}
}
