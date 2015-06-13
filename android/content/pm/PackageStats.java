// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PackageStats.java

package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public class PackageStats
	implements Parcelable
{

	public String packageName;
	public long codeSize;
	public long dataSize;
	public long cacheSize;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public PackageStats(String pkgName)
	{
		throw new RuntimeException("Stub!");
	}

	public PackageStats(Parcel source)
	{
		throw new RuntimeException("Stub!");
	}

	public PackageStats(PackageStats pStats)
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
