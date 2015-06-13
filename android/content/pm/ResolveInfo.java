// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ResolveInfo.java

package android.content.pm;

import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Printer;
import java.util.Comparator;

// Referenced classes of package android.content.pm:
//			ActivityInfo, ServiceInfo, PackageManager

public class ResolveInfo
	implements Parcelable
{
	public static class DisplayNameComparator
		implements Comparator
	{

		public final int compare(ResolveInfo a, ResolveInfo b)
		{
			throw new RuntimeException("Stub!");
		}

		public volatile int compare(Object x0, Object x1)
		{
			return compare((ResolveInfo)x0, (ResolveInfo)x1);
		}

		public DisplayNameComparator(PackageManager pm)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public ActivityInfo activityInfo;
	public ServiceInfo serviceInfo;
	public IntentFilter filter;
	public int priority;
	public int preferredOrder;
	public int match;
	public int specificIndex;
	public boolean isDefault;
	public int labelRes;
	public CharSequence nonLocalizedLabel;
	public int icon;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public ResolveInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence loadLabel(PackageManager pm)
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable loadIcon(PackageManager pm)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getIconResource()
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
