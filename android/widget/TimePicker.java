// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TimePicker.java

package android.widget;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;

// Referenced classes of package android.widget:
//			FrameLayout

public class TimePicker extends FrameLayout
{
	public static interface OnTimeChangedListener
	{

		public abstract void onTimeChanged(TimePicker timepicker, int i, int j);
	}


	public TimePicker(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public TimePicker(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public TimePicker(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setEnabled(boolean enabled)
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

	public void setOnTimeChangedListener(OnTimeChangedListener onTimeChangedListener)
	{
		throw new RuntimeException("Stub!");
	}

	public Integer getCurrentHour()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCurrentHour(Integer currentHour)
	{
		throw new RuntimeException("Stub!");
	}

	public void setIs24HourView(Boolean is24HourView)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean is24HourView()
	{
		throw new RuntimeException("Stub!");
	}

	public Integer getCurrentMinute()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCurrentMinute(Integer currentMinute)
	{
		throw new RuntimeException("Stub!");
	}

	public int getBaseline()
	{
		throw new RuntimeException("Stub!");
	}
}
