// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PreferenceActivity.java

package android.preference;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package android.preference:
//			PreferenceManager, PreferenceScreen, Preference

public abstract class PreferenceActivity extends ListActivity
{

	public PreferenceActivity()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onCreate(Bundle savedInstanceState)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onStop()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDestroy()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onSaveInstanceState(Bundle outState)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onRestoreInstanceState(Bundle state)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		throw new RuntimeException("Stub!");
	}

	public void onContentChanged()
	{
		throw new RuntimeException("Stub!");
	}

	public PreferenceManager getPreferenceManager()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPreferenceScreen(PreferenceScreen preferenceScreen)
	{
		throw new RuntimeException("Stub!");
	}

	public PreferenceScreen getPreferenceScreen()
	{
		throw new RuntimeException("Stub!");
	}

	public void addPreferencesFromIntent(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public void addPreferencesFromResource(int preferencesResId)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference)
	{
		throw new RuntimeException("Stub!");
	}

	public Preference findPreference(CharSequence key)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onNewIntent(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}
}
