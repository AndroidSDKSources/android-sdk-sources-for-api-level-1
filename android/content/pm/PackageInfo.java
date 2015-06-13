// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PackageInfo.java

package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.content.pm:
//			ApplicationInfo, ActivityInfo, ServiceInfo, ProviderInfo, 
//			InstrumentationInfo, PermissionInfo, Signature

public class PackageInfo
	implements Parcelable
{

	public String packageName;
	public int versionCode;
	public String versionName;
	public ApplicationInfo applicationInfo;
	public int gids[];
	public ActivityInfo activities[];
	public ActivityInfo receivers[];
	public ServiceInfo services[];
	public ProviderInfo providers[];
	public InstrumentationInfo instrumentation[];
	public PermissionInfo permissions[];
	public String requestedPermissions[];
	public Signature signatures[];
	public static final android.os.Parcelable.Creator CREATOR = null;

	public PackageInfo()
	{
		gids = null;
		activities = null;
		receivers = null;
		services = null;
		providers = null;
		instrumentation = null;
		permissions = null;
		requestedPermissions = null;
		signatures = null;
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
