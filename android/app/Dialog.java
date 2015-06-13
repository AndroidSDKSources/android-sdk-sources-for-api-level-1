// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Dialog.java

package android.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.*;

// Referenced classes of package android.app:
//			Activity

public class Dialog
	implements DialogInterface, android.view.Window.Callback, android.view.KeyEvent.Callback, android.view.View.OnCreateContextMenuListener
{

	public Dialog(Context context)
	{
		throw new RuntimeException("Stub!");
	}

	public Dialog(Context context, int theme)
	{
		throw new RuntimeException("Stub!");
	}

	protected Dialog(Context context, boolean cancelable, android.content.DialogInterface.OnCancelListener cancelListener)
	{
		throw new RuntimeException("Stub!");
	}

	public final Context getContext()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setOwnerActivity(Activity activity)
	{
		throw new RuntimeException("Stub!");
	}

	public final Activity getOwnerActivity()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isShowing()
	{
		throw new RuntimeException("Stub!");
	}

	public void show()
	{
		throw new RuntimeException("Stub!");
	}

	public void hide()
	{
		throw new RuntimeException("Stub!");
	}

	public void dismiss()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onCreate(Bundle savedInstanceState)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onStart()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onStop()
	{
		throw new RuntimeException("Stub!");
	}

	public Bundle onSaveInstanceState()
	{
		throw new RuntimeException("Stub!");
	}

	public void onRestoreInstanceState(Bundle savedInstanceState)
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

	public void setTitle(CharSequence title)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTitle(int titleId)
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

	public boolean onSearchRequested()
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

	public void setCancelable(boolean flag)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCanceledOnTouchOutside(boolean cancel)
	{
		throw new RuntimeException("Stub!");
	}

	public void cancel()
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnCancelListener(android.content.DialogInterface.OnCancelListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCancelMessage(Message msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnDismissListener(android.content.DialogInterface.OnDismissListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDismissMessage(Message msg)
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

	public void setOnKeyListener(android.content.DialogInterface.OnKeyListener onKeyListener)
	{
		throw new RuntimeException("Stub!");
	}
}
