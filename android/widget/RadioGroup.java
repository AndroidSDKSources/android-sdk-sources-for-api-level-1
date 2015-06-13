// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RadioGroup.java

package android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

// Referenced classes of package android.widget:
//			LinearLayout

public class RadioGroup extends LinearLayout
{
	public static interface OnCheckedChangeListener
	{

		public abstract void onCheckedChanged(RadioGroup radiogroup, int i);
	}

	public static class LayoutParams extends LinearLayout.LayoutParams
	{

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


	public RadioGroup(Context context)
	{
		super((Context)null, (AttributeSet)null);
		throw new RuntimeException("Stub!");
	}

	public RadioGroup(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null);
		throw new RuntimeException("Stub!");
	}

	public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onFinishInflate()
	{
		throw new RuntimeException("Stub!");
	}

	public void check(int id)
	{
		throw new RuntimeException("Stub!");
	}

	public int getCheckedRadioButtonId()
	{
		throw new RuntimeException("Stub!");
	}

	public void clearCheck()
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnCheckedChangeListener(OnCheckedChangeListener listener)
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

	protected LinearLayout.LayoutParams generateDefaultLayoutParams()
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

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet x0)
	{
		return generateLayoutParams(x0);
	}
}
