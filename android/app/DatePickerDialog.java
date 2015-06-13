// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DatePickerDialog.java

package android.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;

// Referenced classes of package android.app:
//			AlertDialog

public class DatePickerDialog extends AlertDialog
	implements android.content.DialogInterface.OnClickListener, android.widget.DatePicker.OnDateChangedListener
{
	public static interface OnDateSetListener
	{

		public abstract void onDateSet(DatePicker datepicker, int i, int j, int k);
	}


	public DatePickerDialog(Context context, OnDateSetListener callBack, int year, int monthOfYear, int dayOfMonth)
	{
		super((Context)null, false, (android.content.DialogInterface.OnCancelListener)null);
		throw new RuntimeException("Stub!");
	}

	public DatePickerDialog(Context context, int theme, OnDateSetListener callBack, int year, int monthOfYear, int dayOfMonth)
	{
		super((Context)null, false, (android.content.DialogInterface.OnCancelListener)null);
		throw new RuntimeException("Stub!");
	}

	public void show()
	{
		throw new RuntimeException("Stub!");
	}

	public void onClick(DialogInterface dialog, int which)
	{
		throw new RuntimeException("Stub!");
	}

	public void onDateChanged(DatePicker view, int year, int month, int day)
	{
		throw new RuntimeException("Stub!");
	}

	public void updateDate(int year, int monthOfYear, int dayOfMonth)
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
