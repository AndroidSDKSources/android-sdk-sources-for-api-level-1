// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ActivityInfo.java

package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Printer;

// Referenced classes of package android.content.pm:
//			ComponentInfo

public class ActivityInfo extends ComponentInfo
	implements Parcelable
{

	public int theme;
	public static final int LAUNCH_MULTIPLE = 0;
	public static final int LAUNCH_SINGLE_TOP = 1;
	public static final int LAUNCH_SINGLE_TASK = 2;
	public static final int LAUNCH_SINGLE_INSTANCE = 3;
	public int launchMode;
	public String permission;
	public String taskAffinity;
	public String targetActivity;
	public static final int FLAG_MULTIPROCESS = 1;
	public static final int FLAG_FINISH_ON_TASK_LAUNCH = 2;
	public static final int FLAG_CLEAR_TASK_ON_LAUNCH = 4;
	public static final int FLAG_ALWAYS_RETAIN_TASK_STATE = 8;
	public static final int FLAG_STATE_NOT_NEEDED = 16;
	public static final int FLAG_EXCLUDE_FROM_RECENTS = 32;
	public static final int FLAG_ALLOW_TASK_REPARENTING = 64;
	public int flags;
	public static final int SCREEN_ORIENTATION_UNSPECIFIED = -1;
	public static final int SCREEN_ORIENTATION_LANDSCAPE = 0;
	public static final int SCREEN_ORIENTATION_PORTRAIT = 1;
	public static final int SCREEN_ORIENTATION_USER = 2;
	public static final int SCREEN_ORIENTATION_BEHIND = 3;
	public static final int SCREEN_ORIENTATION_SENSOR = 4;
	public static final int SCREEN_ORIENTATION_NOSENSOR = 5;
	public int screenOrientation;
	public static final int CONFIG_MCC = 1;
	public static final int CONFIG_MNC = 2;
	public static final int CONFIG_LOCALE = 4;
	public static final int CONFIG_TOUCHSCREEN = 8;
	public static final int CONFIG_KEYBOARD = 16;
	public static final int CONFIG_KEYBOARD_HIDDEN = 32;
	public static final int CONFIG_NAVIGATION = 64;
	public static final int CONFIG_ORIENTATION = 128;
	public static final int CONFIG_FONT_SCALE = 0x40000000;
	public int configChanges;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public ActivityInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public ActivityInfo(ActivityInfo orig)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getThemeResource()
	{
		throw new RuntimeException("Stub!");
	}

	public void dump(Printer pw, String prefix)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel dest, int parcelableFlags)
	{
		throw new RuntimeException("Stub!");
	}

}
