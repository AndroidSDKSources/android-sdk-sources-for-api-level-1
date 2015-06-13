// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbsSpinner.java

package android.widget;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.widget:
//			AdapterView, SpinnerAdapter, Adapter

public abstract class AbsSpinner extends AdapterView
{

	public AbsSpinner(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public AbsSpinner(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public AbsSpinner(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setAdapter(SpinnerAdapter adapter)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelection(int position, boolean animate)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelection(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public View getSelectedView()
	{
		throw new RuntimeException("Stub!");
	}

	public void requestLayout()
	{
		throw new RuntimeException("Stub!");
	}

	public SpinnerAdapter getAdapter()
	{
		throw new RuntimeException("Stub!");
	}

	public int getCount()
	{
		throw new RuntimeException("Stub!");
	}

	public int pointToPosition(int x, int y)
	{
		throw new RuntimeException("Stub!");
	}

	public Parcelable onSaveInstanceState()
	{
		throw new RuntimeException("Stub!");
	}

	public void onRestoreInstanceState(Parcelable state)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile void setAdapter(Adapter x0)
	{
		setAdapter((SpinnerAdapter)x0);
	}

	public volatile Adapter getAdapter()
	{
		return getAdapter();
	}
}
