// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PreferenceManager.java

package android.preference;

import android.content.*;

// Referenced classes of package android.preference:
//			PreferenceScreen, Preference

public class PreferenceManager
{
	public static interface OnActivityDestroyListener
	{

		public abstract void onActivityDestroy();
	}

	public static interface OnActivityStopListener
	{

		public abstract void onActivityStop();
	}

	public static interface OnActivityResultListener
	{

		public abstract boolean onActivityResult(int i, int j, Intent intent);
	}


	public static final String METADATA_KEY_PREFERENCES = "android.preference";
	public static final String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";

	PreferenceManager()
	{
		throw new RuntimeException("Stub!");
	}

	public PreferenceScreen createPreferenceScreen(Context context)
	{
		throw new RuntimeException("Stub!");
	}

	public String getSharedPreferencesName()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSharedPreferencesName(String sharedPreferencesName)
	{
		throw new RuntimeException("Stub!");
	}

	public int getSharedPreferencesMode()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSharedPreferencesMode(int sharedPreferencesMode)
	{
		throw new RuntimeException("Stub!");
	}

	public SharedPreferences getSharedPreferences()
	{
		throw new RuntimeException("Stub!");
	}

	public static SharedPreferences getDefaultSharedPreferences(Context context)
	{
		throw new RuntimeException("Stub!");
	}

	public Preference findPreference(CharSequence key)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setDefaultValues(Context context, int resId, boolean readAgain)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setDefaultValues(Context context, String sharedPreferencesName, int sharedPreferencesMode, int resId, boolean readAgain)
	{
		throw new RuntimeException("Stub!");
	}
}
