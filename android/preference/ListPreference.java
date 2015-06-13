// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ListPreference.java

package android.preference;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;

// Referenced classes of package android.preference:
//			DialogPreference

public class ListPreference extends DialogPreference
{

	public ListPreference(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null);
		throw new RuntimeException("Stub!");
	}

	public ListPreference(Context context)
	{
		super((Context)null, (AttributeSet)null);
		throw new RuntimeException("Stub!");
	}

	public void setEntries(CharSequence entries[])
	{
		throw new RuntimeException("Stub!");
	}

	public void setEntries(int entriesResId)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence[] getEntries()
	{
		throw new RuntimeException("Stub!");
	}

	public void setEntryValues(CharSequence entryValues[])
	{
		throw new RuntimeException("Stub!");
	}

	public void setEntryValues(int entryValuesResId)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence[] getEntryValues()
	{
		throw new RuntimeException("Stub!");
	}

	public void setValue(String value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setValueIndex(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public String getValue()
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getEntry()
	{
		throw new RuntimeException("Stub!");
	}

	public int findIndexOfValue(String value)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDialogClosed(boolean positiveResult)
	{
		throw new RuntimeException("Stub!");
	}

	protected Object onGetDefaultValue(TypedArray a, int index)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onSetInitialValue(boolean restoreValue, Object defaultValue)
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
}
