// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PreferenceGroup.java

package android.preference;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;

// Referenced classes of package android.preference:
//			Preference

public abstract class PreferenceGroup extends Preference
{

	public PreferenceGroup(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null);
		throw new RuntimeException("Stub!");
	}

	public PreferenceGroup(Context context, AttributeSet attrs)
	{
		super((Context)null);
		throw new RuntimeException("Stub!");
	}

	public void setOrderingAsAdded(boolean orderingAsAdded)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isOrderingAsAdded()
	{
		throw new RuntimeException("Stub!");
	}

	public void addItemFromInflater(Preference preference)
	{
		throw new RuntimeException("Stub!");
	}

	public int getPreferenceCount()
	{
		throw new RuntimeException("Stub!");
	}

	public Preference getPreference(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean addPreference(Preference preference)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean removePreference(Preference preference)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeAll()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean onPrepareAddPreference(Preference preference)
	{
		throw new RuntimeException("Stub!");
	}

	public Preference findPreference(CharSequence key)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean isOnSameScreenAsChildren()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onAttachedToActivity()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onPrepareForRemoval()
	{
		throw new RuntimeException("Stub!");
	}

	public void setEnabled(boolean enabled)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchSaveInstanceState(Bundle container)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchRestoreInstanceState(Bundle container)
	{
		throw new RuntimeException("Stub!");
	}
}
