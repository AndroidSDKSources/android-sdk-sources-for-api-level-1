// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TimePickerDialog.java

package android.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;

// Referenced classes of package android.app:
//			AlertDialog

public class TimePickerDialog extends AlertDialog
	implements android.content.DialogInterface.OnClickListener, android.widget.TimePicker.OnTimeChangedListener
{
	public static interface OnTimeSetListener
	{

		public abstract void onTimeSet(TimePicker timepicker, int i, int j);
	}


	public TimePickerDialog(Context context, OnTimeSetListener callBack, int hourOfDay, int minute, boolean is24HourView)
	{
		super((Context)null, false, (android.content.DialogInterface.OnCancelListener)null);
		throw new RuntimeException("Stub!");
	}

	public TimePickerDialog(Context context, int theme, OnTimeSetListener callBack, int hourOfDay, int minute, boolean is24HourView)
	{
		super((Context)null, false, (android.content.DialogInterface.OnCancelListener)null);
		throw new RuntimeException("Stub!");
	}

	public void onClick(DialogInterface dialog, int which)
	{
		throw new RuntimeException("Stub!");
	}

	public void onTimeChanged(TimePicker view, int hourOfDay, int minute)
	{
		throw new RuntimeException("Stub!");
	}

	public void updateTime(int hourOfDay, int minutOfHour)
	{
		throw new RuntimeException("Stub!");
	}

	public Bundle onSaveInstanceState()
	{
		throw new RuntimeException("Stub!");
	}

	public void onRestoreInstanceState(Bundle savedInstanceState)
	{
		throw new RuntimeException("Stub!");
	}
}
