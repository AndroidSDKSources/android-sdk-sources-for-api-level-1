// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Configuration.java

package android.content.res;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

public final class Configuration
	implements Parcelable, Comparable
{

	public float fontScale;
	public int mcc;
	public int mnc;
	public Locale locale;
	public static final int TOUCHSCREEN_UNDEFINED = 0;
	public static final int TOUCHSCREEN_NOTOUCH = 1;
	public static final int TOUCHSCREEN_STYLUS = 2;
	public static final int TOUCHSCREEN_FINGER = 3;
	public int touchscreen;
	public static final int KEYBOARD_UNDEFINED = 0;
	public static final int KEYBOARD_NOKEYS = 1;
	public static final int KEYBOARD_QWERTY = 2;
	public static final int KEYBOARD_12KEY = 3;
	public int keyboard;
	public static final int KEYBOARDHIDDEN_UNDEFINED = 0;
	public static final int KEYBOARDHIDDEN_NO = 1;
	public static final int KEYBOARDHIDDEN_YES = 2;
	public int keyboardHidden;
	public static final int NAVIGATION_UNDEFINED = 0;
	public static final int NAVIGATION_NONAV = 1;
	public static final int NAVIGATION_DPAD = 2;
	public static final int NAVIGATION_TRACKBALL = 3;
	public static final int NAVIGATION_WHEEL = 4;
	public int navigation;
	public static final int ORIENTATION_UNDEFINED = 0;
	public static final int ORIENTATION_PORTRAIT = 1;
	public static final int ORIENTATION_LANDSCAPE = 2;
	public static final int ORIENTATION_SQUARE = 3;
	public int orientation;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public Configuration()
	{
		throw new RuntimeException("Stub!");
	}

	public Configuration(Configuration o)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public void setToDefaults()
	{
		throw new RuntimeException("Stub!");
	}

	public int updateFrom(Configuration delta)
	{
		throw new RuntimeException("Stub!");
	}

	public int diff(Configuration delta)
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean needNewResources(int configChanges, int interestingChanges)
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel dest, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(Configuration that)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Configuration that)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object that)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((Configuration)x0);
	}

}
