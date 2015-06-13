// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Window.java

package android.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package android.view:
//			WindowManager, ViewGroup, View, LayoutInflater, 
//			KeyEvent, MotionEvent, Menu, MenuItem

public abstract class Window
{
	public static interface Callback
	{

		public abstract boolean dispatchKeyEvent(KeyEvent keyevent);

		public abstract boolean dispatchTouchEvent(MotionEvent motionevent);

		public abstract boolean dispatchTrackballEvent(MotionEvent motionevent);

		public abstract View onCreatePanelView(int i);

		public abstract boolean onCreatePanelMenu(int i, Menu menu);

		public abstract boolean onPreparePanel(int i, View view, Menu menu);

		public abstract boolean onMenuOpened(int i, Menu menu);

		public abstract boolean onMenuItemSelected(int i, MenuItem menuitem);

		public abstract void onWindowAttributesChanged(WindowManager.LayoutParams layoutparams);

		public abstract void onContentChanged();

		public abstract void onWindowFocusChanged(boolean flag);

		public abstract void onPanelClosed(int i, Menu menu);

		public abstract boolean onSearchRequested();
	}


	public static final int FEATURE_OPTIONS_PANEL = 0;
	public static final int FEATURE_NO_TITLE = 1;
	public static final int FEATURE_PROGRESS = 2;
	public static final int FEATURE_LEFT_ICON = 3;
	public static final int FEATURE_RIGHT_ICON = 4;
	public static final int FEATURE_INDETERMINATE_PROGRESS = 5;
	public static final int FEATURE_CONTEXT_MENU = 6;
	public static final int FEATURE_CUSTOM_TITLE = 7;
	public static final int PROGRESS_VISIBILITY_ON = -1;
	public static final int PROGRESS_VISIBILITY_OFF = -2;
	public static final int PROGRESS_INDETERMINATE_ON = -3;
	public static final int PROGRESS_INDETERMINATE_OFF = -4;
	public static final int PROGRESS_START = 0;
	public static final int PROGRESS_END = 10000;
	public static final int PROGRESS_SECONDARY_START = 20000;
	public static final int PROGRESS_SECONDARY_END = 30000;
	protected static final int DEFAULT_FEATURES = 65;
	public static final int ID_ANDROID_CONTENT = 0x1020002;

	public Window(Context context)
	{
		throw new RuntimeException("Stub!");
	}

	public final Context getContext()
	{
		throw new RuntimeException("Stub!");
	}

	public final TypedArray getWindowStyle()
	{
		throw new RuntimeException("Stub!");
	}

	public void setContainer(Window container)
	{
		throw new RuntimeException("Stub!");
	}

	public final Window getContainer()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean hasChildren()
	{
		throw new RuntimeException("Stub!");
	}

	public void setWindowManager(WindowManager wm, IBinder appToken, String appName)
	{
		throw new RuntimeException("Stub!");
	}

	public WindowManager getWindowManager()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCallback(Callback callback)
	{
		throw new RuntimeException("Stub!");
	}

	public final Callback getCallback()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isFloating();

	public void setLayout(int width, int height)
	{
		throw new RuntimeException("Stub!");
	}

	public void setGravity(int gravity)
	{
		throw new RuntimeException("Stub!");
	}

	public void setType(int type)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFormat(int format)
	{
		throw new RuntimeException("Stub!");
	}

	public void addFlags(int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public void clearFlags(int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFlags(int flags, int mask)
	{
		throw new RuntimeException("Stub!");
	}

	public void setAttributes(WindowManager.LayoutParams a)
	{
		throw new RuntimeException("Stub!");
	}

	public final WindowManager.LayoutParams getAttributes()
	{
		throw new RuntimeException("Stub!");
	}

	protected final int getForcedWindowFlags()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean requestFeature(int featureId)
	{
		throw new RuntimeException("Stub!");
	}

	public final void makeActive()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isActive()
	{
		throw new RuntimeException("Stub!");
	}

	public View findViewById(int id)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void setContentView(int i);

	public abstract void setContentView(View view);

	public abstract void setContentView(View view, ViewGroup.LayoutParams layoutparams);

	public abstract void addContentView(View view, ViewGroup.LayoutParams layoutparams);

	public abstract View getCurrentFocus();

	public abstract LayoutInflater getLayoutInflater();

	public abstract void setTitle(CharSequence charsequence);

	public abstract void setTitleColor(int i);

	public abstract void openPanel(int i, KeyEvent keyevent);

	public abstract void closePanel(int i);

	public abstract void togglePanel(int i, KeyEvent keyevent);

	public abstract boolean performPanelShortcut(int i, int j, KeyEvent keyevent, int k);

	public abstract boolean performPanelIdentifierAction(int i, int j, int k);

	public abstract void closeAllPanels();

	public abstract boolean performContextMenuIdentifierAction(int i, int j);

	public abstract void onConfigurationChanged(Configuration configuration);

	public void setBackgroundDrawableResource(int resid)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void setBackgroundDrawable(Drawable drawable);

	public abstract void setFeatureDrawableResource(int i, int j);

	public abstract void setFeatureDrawableUri(int i, Uri uri);

	public abstract void setFeatureDrawable(int i, Drawable drawable);

	public abstract void setFeatureDrawableAlpha(int i, int j);

	public abstract void setFeatureInt(int i, int j);

	public abstract void takeKeyEvents(boolean flag);

	public abstract boolean superDispatchKeyEvent(KeyEvent keyevent);

	public abstract boolean superDispatchTouchEvent(MotionEvent motionevent);

	public abstract boolean superDispatchTrackballEvent(MotionEvent motionevent);

	public abstract View getDecorView();

	public abstract View peekDecorView();

	public abstract Bundle saveHierarchyState();

	public abstract void restoreHierarchyState(Bundle bundle);

	protected abstract void onActive();

	protected final int getFeatures()
	{
		throw new RuntimeException("Stub!");
	}

	protected final int getLocalFeatures()
	{
		throw new RuntimeException("Stub!");
	}

	protected void setDefaultWindowFormat(int format)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void setChildDrawable(int i, Drawable drawable);

	public abstract void setChildInt(int i, int j);

	public abstract boolean isShortcutKey(int i, KeyEvent keyevent);

	public abstract void setVolumeControlStream(int i);

	public abstract int getVolumeControlStream();
}
