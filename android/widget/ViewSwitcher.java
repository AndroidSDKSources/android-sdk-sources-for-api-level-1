// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ViewSwitcher.java

package android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.widget:
//			ViewAnimator

public class ViewSwitcher extends ViewAnimator
{
	public static interface ViewFactory
	{

		public abstract View makeView();
	}


	public ViewSwitcher(Context context)
	{
		super((Context)null, (AttributeSet)null);
		throw new RuntimeException("Stub!");
	}

	public ViewSwitcher(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null);
		throw new RuntimeException("Stub!");
	}

	public void addView(View child, int index, android.view.ViewGroup.LayoutParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public View getNextView()
	{
		throw new RuntimeException("Stub!");
	}

	public void setFactory(ViewFactory factory)
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
	{
		throw new RuntimeException("Stub!");
	}
}
