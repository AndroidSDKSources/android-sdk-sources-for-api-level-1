// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InstrumentationInfo.java

package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.content.pm:
//			PackageItemInfo

public class InstrumentationInfo extends PackageItemInfo
	implements Parcelable
{

	public String targetPackage;
	public String sourceDir;
	public String publicSourceDir;
	public String dataDir;
	public boolean handleProfiling;
	public boolean functionalTest;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public InstrumentationInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public InstrumentationInfo(InstrumentationInfo orig)
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
