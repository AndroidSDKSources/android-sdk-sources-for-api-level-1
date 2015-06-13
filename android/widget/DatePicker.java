// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DatePicker.java

package android.widget;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;

// Referenced classes of package android.widget:
//			FrameLayout

public class DatePicker extends FrameLayout
{
	public static interface OnDateChangedListener
	{

		public abstract void onDateChanged(DatePicker datepicker, int i, int j, int k);
	}


	public DatePicker(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public DatePicker(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public DatePicker(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setEnabled(boolean enabled)
	{
		throw new RuntimeException("Stub!");
	}

	public void updateDate(int year, int monthOfYear, int dayOfMonth)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchRestoreInstanceState(SparseArray container)
	{
		throw new RuntimeException("Stub!");
	}

	protected Parcelable onSaveInstanceState()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onRestoreInstanceState(Parcelable state)
	{
		throw new RuntimeException("Stub!");
	}

	public void init(int year, int monthOfYear, int dayOfMonth, OnDateChangedListener onDateChangedListener)
	{
		throw new RuntimeException("Stub!");
	}

	public int getYear()
	{
		throw new RuntimeException("Stub!");
	}

	public int getMonth()
	{
		throw new RuntimeException("Stub!");
	}

	public int getDayOfMonth()
	{
		throw new RuntimeException("Stub!");
	}
}
