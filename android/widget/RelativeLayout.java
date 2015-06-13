// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RelativeLayout.java

package android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

// Referenced classes of package android.widget:
//			RemoteViews

public class RelativeLayout extends ViewGroup
{
	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		public boolean alignWithParent;

		public String debug(String output)
		{
			throw new RuntimeException("Stub!");
		}

		public void addRule(int verb)
		{
			throw new RuntimeException("Stub!");
		}

		public void addRule(int verb, int anchor)
		{
			throw new RuntimeException("Stub!");
		}

		public int[] getRules()
		{
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(Context c, AttributeSet attrs)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int w, int h)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams source)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams source)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}
	}


	public static final int TRUE = -1;
	public static final int LEFT_OF = 0;
	public static final int RIGHT_OF = 1;
	public static final int ABOVE = 2;
	public static final int BELOW = 3;
	public static final int ALIGN_BASELINE = 4;
	public static final int ALIGN_LEFT = 5;
	public static final int ALIGN_TOP = 6;
	public static final int ALIGN_RIGHT = 7;
	public static final int ALIGN_BOTTOM = 8;
	public static final int ALIGN_PARENT_LEFT = 9;
	public static final int ALIGN_PARENT_TOP = 10;
	public static final int ALIGN_PARENT_RIGHT = 11;
	public static final int ALIGN_PARENT_BOTTOM = 12;
	public static final int CENTER_IN_PARENT = 13;
	public static final int CENTER_HORIZONTAL = 14;
	public static final int CENTER_VERTICAL = 15;

	public RelativeLayout(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public RelativeLayout(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public RelativeLayout(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setIgnoreGravity(int viewId)
	{
		throw new RuntimeException("Stub!");
	}

	public void setGravity(int gravity)
	{
		throw new RuntimeException("Stub!");
	}

	public void setHorizontalGravity(int horizontalGravity)
	{
		throw new RuntimeException("Stub!");
	}

	public void setVerticalGravity(int verticalGravity)
	{
		throw new RuntimeException("Stub!");
	}

	public int getBaseline()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onLayout(boolean changed, int l, int t, int r, int b)
	{
		throw new RuntimeException("Stub!");
	}

	public LayoutParams generateLayoutParams(AttributeSet attrs)
	{
		throw new RuntimeException("Stub!");
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p)
	{
		throw new RuntimeException("Stub!");
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet x0)
	{
		return generateLayoutParams(x0);
	}
}
