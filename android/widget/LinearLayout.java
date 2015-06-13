// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LinearLayout.java

package android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

// Referenced classes of package android.widget:
//			RemoteViews

public class LinearLayout extends ViewGroup
{
	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		public float weight;
		public int gravity;

		public String debug(String output)
		{
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(Context c, AttributeSet attrs)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int width, int height)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int width, int height, float weight)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams p)
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


	public static final int HORIZONTAL = 0;
	public static final int VERTICAL = 1;

	public LinearLayout(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public LinearLayout(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public boolean isBaselineAligned()
	{
		throw new RuntimeException("Stub!");
	}

	public void setBaselineAligned(boolean baselineAligned)
	{
		throw new RuntimeException("Stub!");
	}

	public int getBaseline()
	{
		throw new RuntimeException("Stub!");
	}

	public int getBaselineAlignedChildIndex()
	{
		throw new RuntimeException("Stub!");
	}

	public void setBaselineAlignedChildIndex(int i)
	{
		throw new RuntimeException("Stub!");
	}

	public float getWeightSum()
	{
		throw new RuntimeException("Stub!");
	}

	public void setWeightSum(float weightSum)
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

	public void setOrientation(int orientation)
	{
		throw new RuntimeException("Stub!");
	}

	public int getOrientation()
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

	public LayoutParams generateLayoutParams(AttributeSet attrs)
	{
		throw new RuntimeException("Stub!");
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		throw new RuntimeException("Stub!");
	}

	protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p)
	{
		throw new RuntimeException("Stub!");
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
