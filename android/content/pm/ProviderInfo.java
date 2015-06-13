// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ProviderInfo.java

package android.content.pm;

import android.os.*;

// Referenced classes of package android.content.pm:
//			ComponentInfo

public final class ProviderInfo extends ComponentInfo
	implements Parcelable
{

	public String authority;
	public String readPermission;
	public String writePermission;
	public boolean grantUriPermissions;
	public PatternMatcher uriPermissionPatterns[];
	public boolean multiprocess;
	public int initOrder;
	public boolean isSyncable;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public ProviderInfo()
	{
		uriPermissionPatterns = null;
		throw new RuntimeException("Stub!");
	}

	public ProviderInfo(ProviderInfo orig)
	{
		uriPermissionPatterns = null;
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel out, int parcelableFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

}
