// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EditTextPreference.java

package android.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package android.preference:
//			DialogPreference

public class EditTextPreference extends DialogPreference
{

	public EditTextPreference(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null);
		throw new RuntimeException("Stub!");
	}

	public EditTextPreference(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null);
		throw new RuntimeException("Stub!");
	}

	public EditTextPreference(Context context)
	{
		super((Context)null, (AttributeSet)null);
		throw new RuntimeException("Stub!");
	}

	public void setText(String text)
	{
		throw new RuntimeException("Stub!");
	}

	public String getText()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onBindDialogView(View view)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onAddEditTextToDialogView(View dialogView, EditText editText)
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

	public boolean shouldDisableDependents()
	{
		throw new RuntimeException("Stub!");
	}

	public EditText getEditText()
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
