// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Activity.java

package android.app;

import android.content.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.*;

// Referenced classes of package android.app:
//			Application, Dialog, PendingIntent

public class Activity extends ContextThemeWrapper
	implements android.view.LayoutInflater.Factory, android.view.Window.Callback, android.view.KeyEvent.Callback, android.view.View.OnCreateContextMenuListener, ComponentCallbacks
{

	public static final int RESULT_CANCELED = 0;
	public static final int RESULT_OK = -1;
	public static final int RESULT_FIRST_USER = 1;
	protected static final int FOCUSED_STATE_SET[] = null;
	public static final int DEFAULT_KEYS_DISABLE = 0;
	public static final int DEFAULT_KEYS_DIALER = 1;
	public static final int DEFAULT_KEYS_SHORTCUT = 2;
	public static final int DEFAULT_KEYS_SEARCH_LOCAL = 3;
	public static final int DEFAULT_KEYS_SEARCH_GLOBAL = 4;

	public Activity()
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}

	public static long getInstanceCount()
	{
		throw new RuntimeException("Stub!");
	}

	public Intent getIntent()
	{
		throw new RuntimeException("Stub!");
	}

	public void setIntent(Intent newIntent)
	{
		throw new RuntimeException("Stub!");
	}

	public final Application getApplication()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isChild()
	{
		throw new RuntimeException("Stub!");
	}

	public final Activity getParent()
	{
		throw new RuntimeException("Stub!");
	}

	public WindowManager getWindowManager()
	{
		throw new RuntimeException("Stub!");
	}

	public Window getWindow()
	{
		throw new RuntimeException("Stub!");
	}

	public View getCurrentFocus()
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

	protected void onCreate(Bundle savedInstanceState)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onRestoreInstanceState(Bundle savedInstanceState)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onPostCreate(Bundle savedInstanceState)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onStart()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onRestart()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onResume()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onPostResume()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onNewIntent(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onSaveInstanceState(Bundle outState)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onPause()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence onCreateDescription()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onStop()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDestroy()
	{
		throw new RuntimeException("Stub!");
	}

	public void onConfigurationChanged(Configuration newConfig)
	{
		throw new RuntimeException("Stub!");
	}

	public int getChangingConfigurations()
	{
		throw new RuntimeException("Stub!");
	}

	public Object getLastNonConfigurationInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public Object onRetainNonConfigurationInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public void onLowMemory()
	{
		throw new RuntimeException("Stub!");
	}

	public final Cursor managedQuery(Uri uri, String projection[], String selection, String selectionArgs[], String sortOrder)
	{
		throw new RuntimeException("Stub!");
	}

	public void startManagingCursor(Cursor c)
	{
		throw new RuntimeException("Stub!");
	}

	public void stopManagingCursor(Cursor c)
	{
		throw new RuntimeException("Stub!");
	}

	public void setPersistent(boolean isPersistent)
	{
		throw new RuntimeException("Stub!");
	}

	public View findViewById(int id)
	{
		throw new RuntimeException("Stub!");
	}

	public void setContentView(int layoutResID)
	{
		throw new RuntimeException("Stub!");
	}

	public void setContentView(View view)
	{
		throw new RuntimeException("Stub!");
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public void addContentView(View view, android.view.ViewGroup.LayoutParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setDefaultKeyMode(int mode)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyUp(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTrackballEvent(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public void onContentChanged()
	{
		throw new RuntimeException("Stub!");
	}

	public void onWindowFocusChanged(boolean hasFocus)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean dispatchKeyEvent(KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean dispatchTouchEvent(MotionEvent ev)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean dispatchTrackballEvent(MotionEvent ev)
	{
		throw new RuntimeException("Stub!");
	}

	public View onCreatePanelView(int featureId)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onCreatePanelMenu(int featureId, Menu menu)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onPreparePanel(int featureId, View view, Menu menu)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onMenuOpened(int featureId, Menu menu)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onMenuItemSelected(int featureId, MenuItem item)
	{
		throw new RuntimeException("Stub!");
	}

	public void onPanelClosed(int featureId, Menu menu)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onPrepareOptionsMenu(Menu menu)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onOptionsItemSelected(MenuItem item)
	{
		throw new RuntimeException("Stub!");
	}

	public void onOptionsMenuClosed(Menu menu)
	{
		throw new RuntimeException("Stub!");
	}

	public void openOptionsMenu()
	{
		throw new RuntimeException("Stub!");
	}

	public void closeOptionsMenu()
	{
		throw new RuntimeException("Stub!");
	}

	public void onCreateContextMenu(ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo)
	{
		throw new RuntimeException("Stub!");
	}

	public void registerForContextMenu(View view)
	{
		throw new RuntimeException("Stub!");
	}

	public void unregisterForContextMenu(View view)
	{
		throw new RuntimeException("Stub!");
	}

	public void openContextMenu(View view)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onContextItemSelected(MenuItem item)
	{
		throw new RuntimeException("Stub!");
	}

	public void onContextMenuClosed(Menu menu)
	{
		throw new RuntimeException("Stub!");
	}

	protected Dialog onCreateDialog(int id)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onPrepareDialog(int id, Dialog dialog)
	{
		throw new RuntimeException("Stub!");
	}

	public final void showDialog(int id)
	{
		throw new RuntimeException("Stub!");
	}

	public final void dismissDialog(int id)
	{
		throw new RuntimeException("Stub!");
	}

	public final void removeDialog(int id)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onSearchRequested()
	{
		throw new RuntimeException("Stub!");
	}

	public void startSearch(String initialQuery, boolean selectInitialQuery, Bundle appSearchData, boolean globalSearch)
	{
		throw new RuntimeException("Stub!");
	}

	public void takeKeyEvents(boolean get)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean requestWindowFeature(int featureId)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setFeatureDrawableResource(int featureId, int resId)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setFeatureDrawableUri(int featureId, Uri uri)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setFeatureDrawable(int featureId, Drawable drawable)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setFeatureDrawableAlpha(int featureId, int alpha)
	{
		throw new RuntimeException("Stub!");
	}

	public LayoutInflater getLayoutInflater()
	{
		throw new RuntimeException("Stub!");
	}

	public MenuInflater getMenuInflater()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onApplyThemeResource(android.content.res.Resources.Theme theme, int resid, boolean first)
	{
		throw new RuntimeException("Stub!");
	}

	public void startActivityForResult(Intent intent, int requestCode)
	{
		throw new RuntimeException("Stub!");
	}

	public void startActivity(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean startActivityIfNeeded(Intent intent, int requestCode)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean startNextMatchingActivity(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public void startActivityFromChild(Activity child, Intent intent, int requestCode)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setResult(int resultCode)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setResult(int resultCode, Intent data)
	{
		throw new RuntimeException("Stub!");
	}

	public String getCallingPackage()
	{
		throw new RuntimeException("Stub!");
	}

	public ComponentName getCallingActivity()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isFinishing()
	{
		throw new RuntimeException("Stub!");
	}

	public void finish()
	{
		throw new RuntimeException("Stub!");
	}

	public void finishFromChild(Activity child)
	{
		throw new RuntimeException("Stub!");
	}

	public void finishActivity(int requestCode)
	{
		throw new RuntimeException("Stub!");
	}

	public void finishActivityFromChild(Activity child, int requestCode)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		throw new RuntimeException("Stub!");
	}

	public PendingIntent createPendingResult(int requestCode, Intent data, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public void setRequestedOrientation(int requestedOrientation)
	{
		throw new RuntimeException("Stub!");
	}

	public int getRequestedOrientation()
	{
		throw new RuntimeException("Stub!");
	}

	public int getTaskId()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isTaskRoot()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean moveTaskToBack(boolean nonRoot)
	{
		throw new RuntimeException("Stub!");
	}

	public String getLocalClassName()
	{
		throw new RuntimeException("Stub!");
	}

	public ComponentName getComponentName()
	{
		throw new RuntimeException("Stub!");
	}

	public SharedPreferences getPreferences(int mode)
	{
		throw new RuntimeException("Stub!");
	}

	public Object getSystemService(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTitle(CharSequence title)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTitle(int titleId)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTitleColor(int textColor)
	{
		throw new RuntimeException("Stub!");
	}

	public final CharSequence getTitle()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getTitleColor()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onTitleChanged(CharSequence title, int color)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onChildTitleChanged(Activity childActivity, CharSequence title)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setProgressBarVisibility(boolean visible)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setProgressBarIndeterminateVisibility(boolean visible)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setProgressBarIndeterminate(boolean indeterminate)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setProgress(int progress)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setSecondaryProgress(int secondaryProgress)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setVolumeControlStream(int streamType)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getVolumeControlStream()
	{
		throw new RuntimeException("Stub!");
	}

	public final void runOnUiThread(Runnable action)
	{
		throw new RuntimeException("Stub!");
	}

	public View onCreateView(String name, Context context, AttributeSet attrs)
	{
		throw new RuntimeException("Stub!");
	}

}
