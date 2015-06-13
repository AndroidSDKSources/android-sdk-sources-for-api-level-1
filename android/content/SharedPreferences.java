// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SharedPreferences.java

package android.content;

import java.util.Map;

public interface SharedPreferences
{
	public static interface Editor
	{

		public abstract Editor putString(String s, String s1);

		public abstract Editor putInt(String s, int i);

		public abstract Editor putLong(String s, long l);

		public abstract Editor putFloat(String s, float f);

		public abstract Editor putBoolean(String s, boolean flag);

		public abstract Editor remove(String s);

		public abstract Editor clear();

		public abstract boolean commit();
	}

	public static interface OnSharedPreferenceChangeListener
	{

		public abstract void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s);
	}


	public abstract Map getAll();

	public abstract String getString(String s, String s1);

	public abstract int getInt(String s, int i);

	public abstract long getLong(String s, long l);

	public abstract float getFloat(String s, float f);

	public abstract boolean getBoolean(String s, boolean flag);

	public abstract boolean contains(String s);

	public abstract Editor edit();

	public abstract void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onsharedpreferencechangelistener);

	public abstract void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onsharedpreferencechangelistener);
}
