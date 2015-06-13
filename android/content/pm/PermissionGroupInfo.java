// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PermissionGroupInfo.java

package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.content.pm:
//			PackageItemInfo, PackageManager

public class PermissionGroupInfo extends PackageItemInfo
	implements Parcelable
{

	public int descriptionRes;
	public CharSequence nonLocalizedDescription;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public PermissionGroupInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public PermissionGroupInfo(PermissionGroupInfo orig)
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
