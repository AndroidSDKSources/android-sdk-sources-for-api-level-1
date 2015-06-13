// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PermissionInfo.java

package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.content.pm:
//			PackageItemInfo, PackageManager

public class PermissionInfo extends PackageItemInfo
	implements Parcelable
{

	public static final int PROTECTION_NORMAL = 0;
	public static final int PROTECTION_DANGEROUS = 1;
	public static final int PROTECTION_SIGNATURE = 2;
	public static final int PROTECTION_SIGNATURE_OR_SYSTEM = 3;
	public String group;
	public int descriptionRes;
	public CharSequence nonLocalizedDescription;
	public int protectionLevel;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public PermissionInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public PermissionInfo(PermissionInfo orig)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence loadDescription(PackageManager pm)
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
