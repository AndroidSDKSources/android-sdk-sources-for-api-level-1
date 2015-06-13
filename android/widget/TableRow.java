// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TableRow.java

package android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.widget:
//			LinearLayout

public class TableRow extends LinearLayout
{
	public static class LayoutParams extends LinearLayout.LayoutParams
	{

		public int column;
		public int span;

		protected void setBaseAttributes(TypedArray a, int widthAttr, int heightAttr)
		{
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(Context c, AttributeSet attrs)
		{
			super((android.view.ViewGroup.MarginLayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int w, int h)
		{
			super((android.view.ViewGroup.MarginLayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int w, int h, float initWeight)
		{
			super((android.view.ViewGroup.MarginLayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams()
		{
			super((android.view.ViewGroup.MarginLayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int column)
		{
			super((android.view.ViewGroup.MarginLayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams p)
		{
			super((android.view.ViewGroup.MarginLayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams source)
		{
			super((android.view.ViewGroup.MarginLayoutParams)null);
			throw new RuntimeException("Stub!");
		}
	}


	public TableRow(Context context)
	{
		super((Context)null, (AttributeSet)null);
		throw new RuntimeException("Stub!");
	}

	public TableRow(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null);
		throw new RuntimeException("Stub!");
	}

	public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener listener)
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

	public View getVirtualChildAt(int i)
	{
		throw new RuntimeException("Stub!");
	}

	public int getVirtualChildCount()
	{
		throw new RuntimeException("Stub!");
	}

	public LayoutParams generateLayoutParams(AttributeSet attrs)
	{
		throw new RuntimeException("Stub!");
	}

	protected LinearLayout.LayoutParams generateDefaultLayoutParams()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p)
	{
		throw new RuntimeException("Stub!");
	}

	protected LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile LinearLayout.LayoutParams generateLayoutParams(AttributeSet x0)
	{
		return generateLayoutParams(x0);
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return generateDefaultLayoutParams();
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams x0)
	{
		return generateLayoutParams(x0);
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet x0)
	{
		return generateLayoutParams(x0);
	}
}
