// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TabHost.java

package android.widget;

import android.app.LocalActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.*;

// Referenced classes of package android.widget:
//			FrameLayout, TabWidget

public class TabHost extends FrameLayout
	implements android.view.ViewTreeObserver.OnTouchModeChangeListener
{
	public class TabSpec
	{

		final TabHost this$0;

		public TabSpec setIndicator(CharSequence label)
		{
			throw new RuntimeException("Stub!");
		}

		public TabSpec setIndicator(CharSequence label, Drawable icon)
		{
			throw new RuntimeException("Stub!");
		}

		public TabSpec setContent(int viewId)
		{
			throw new RuntimeException("Stub!");
		}

		public TabSpec setContent(TabContentFactory contentFactory)
		{
			throw new RuntimeException("Stub!");
		}

		public TabSpec setContent(Intent intent)
		{
			throw new RuntimeException("Stub!");
		}

		TabSpec()
		{
			this$0 = TabHost.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}

	public static interface TabContentFactory
	{

		public abstract View createTabContent(String s);
	}

	public static interface OnTabChangeListener
	{

		public abstract void onTabChanged(String s);
	}


	public TabHost(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public TabHost(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public TabSpec newTabSpec(String tag)
	{
		throw new RuntimeException("Stub!");
	}

	public void setup()
	{
		throw new RuntimeException("Stub!");
	}

	public void setup(LocalActivityManager activityGroup)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onAttachedToWindow()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDetachedFromWindow()
	{
		throw new RuntimeException("Stub!");
	}

	public void onTouchModeChanged(boolean isInTouchMode)
	{
		throw new RuntimeException("Stub!");
	}

	public void addTab(TabSpec tabSpec)
	{
		throw new RuntimeException("Stub!");
	}

	public void clearAllTabs()
	{
		throw new RuntimeException("Stub!");
	}

	public TabWidget getTabWidget()
	{
		throw new RuntimeException("Stub!");
	}

	public int getCurrentTab()
	{
		throw new RuntimeException("Stub!");
	}

	public String getCurrentTabTag()
	{
		throw new RuntimeException("Stub!");
	}

	public View getCurrentTabView()
	{
		throw new RuntimeException("Stub!");
	}

	public View getCurrentView()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCurrentTabByTag(String tag)
	{
		throw new RuntimeException("Stub!");
	}

	public FrameLayout getTabContentView()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean dispatchKeyEvent(KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void dispatchWindowFocusChanged(boolean hasFocus)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCurrentTab(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnTabChangedListener(OnTabChangeListener l)
	{
		throw new RuntimeException("Stub!");
	}
}
