// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FrameLayout.java

package android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;

// Referenced classes of package android.widget:
//			RemoteViews

public class FrameLayout extends ViewGroup
{
	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		public int gravity;

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

		public LayoutParams(int width, int height, int gravity)
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


	public FrameLayout(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public FrameLayout(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public FrameLayout(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setForegroundGravity(int foregroundGravity)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean verifyDrawable(Drawable who)
	{
		throw new RuntimeException("Stub!");
	}

	protected void drawableStateChanged()
	{
		throw new RuntimeException("Stub!");
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		throw new RuntimeException("Stub!");
	}

	public void setForeground(Drawable drawable)
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getForeground()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onLayout(boolean changed, int left, int top, int right, int bottom)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onSizeChanged(int w, int h, int oldw, int oldh)
	{
		throw new RuntimeException("Stub!");
	}

	public void draw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean gatherTransparentRegion(Region region)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMeasureAllChildren(boolean measureAll)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getConsiderGoneChildrenWhenMeasuring()
	{
		throw new RuntimeException("Stub!");
	}

	public LayoutParams generateLayoutParams(AttributeSet attrs)
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

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return generateDefaultLayoutParams();
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet x0)
	{
		return generateLayoutParams(x0);
	}
}
