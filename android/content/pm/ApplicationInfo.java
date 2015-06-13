// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ApplicationInfo.java

package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Printer;
import java.util.Comparator;

// Referenced classes of package android.content.pm:
//			PackageItemInfo, PackageManager

public class ApplicationInfo extends PackageItemInfo
	implements Parcelable
{
	public static class DisplayNameComparator
		implements Comparator
	{

		public final int compare(ApplicationInfo aa, ApplicationInfo ab)
		{
			throw new RuntimeException("Stub!");
		}

		public volatile int compare(Object x0, Object x1)
		{
			return compare((ApplicationInfo)x0, (ApplicationInfo)x1);
		}

		public DisplayNameComparator(PackageManager pm)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public String taskAffinity;
	public String permission;
	public String processName;
	public String className;
	public int descriptionRes;
	public int theme;
	public String manageSpaceActivityName;
	public static final int FLAG_SYSTEM = 1;
	public static final int FLAG_DEBUGGABLE = 2;
	public static final int FLAG_HAS_CODE = 4;
	public static final int FLAG_PERSISTENT = 8;
	public static final int FLAG_FACTORY_TEST = 16;
	public static final int FLAG_ALLOW_TASK_REPARENTING = 32;
	public static final int FLAG_ALLOW_CLEAR_USER_DATA = 64;
	public int flags;
	public String sourceDir;
	public String publicSourceDir;
	public String sharedLibraryFiles[];
	public String dataDir;
	public int uid;
	public boolean enabled;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public ApplicationInfo()
	{
		sharedLibraryFiles = null;
		throw new RuntimeException("Stub!");
	}

	public ApplicationInfo(ApplicationInfo orig)
	{
		sharedLibraryFiles = null;
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

	public CharSequence loadDescription(PackageManager pm)
	{
		throw new RuntimeException("Stub!");
	}

}
