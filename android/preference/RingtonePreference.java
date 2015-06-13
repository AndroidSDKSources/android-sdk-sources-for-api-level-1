// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RingtonePreference.java

package android.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

// Referenced classes of package android.preference:
//			Preference, PreferenceManager

public class RingtonePreference extends Preference
	implements PreferenceManager.OnActivityResultListener
{

	public RingtonePreference(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null);
		throw new RuntimeException("Stub!");
	}

	public RingtonePreference(Context context, AttributeSet attrs)
	{
		super((Context)null);
		throw new RuntimeException("Stub!");
	}

	public RingtonePreference(Context context)
	{
		super((Context)null);
		throw new RuntimeException("Stub!");
	}

	public int getRingtoneType()
	{
		throw new RuntimeException("Stub!");
	}

	public void setRingtoneType(int type)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getShowDefault()
	{
		throw new RuntimeException("Stub!");
	}

	public void setShowDefault(boolean showDefault)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getShowSilent()
	{
		throw new RuntimeException("Stub!");
	}

	public void setShowSilent(boolean showSilent)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onClick()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onPrepareRingtonePickerIntent(Intent ringtonePickerIntent)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onSaveRingtone(Uri ringtoneUri)
	{
		throw new RuntimeException("Stub!");
	}

	protected Uri onRestoreRingtone()
	{
		throw new RuntimeException("Stub!");
	}

	protected Object onGetDefaultValue(TypedArray a, int index)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onSetInitialValue(boolean restorePersistedValue, Object defaultValueObj)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onAttachedToHierarchy(PreferenceManager preferenceManager)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onActivityResult(int requestCode, int resultCode, Intent data)
	{
		throw new RuntimeException("Stub!");
	}
}
