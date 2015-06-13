// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ComponentName.java

package android.content;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.content:
//			Context

public final class ComponentName
	implements Parcelable
{

	public static final android.os.Parcelable.Creator CREATOR = null;

	public ComponentName(String pkg, String cls)
	{
		throw new RuntimeException("Stub!");
	}

	public ComponentName(Context pkg, String cls)
	{
		throw new RuntimeException("Stub!");
	}

	public ComponentName(Context pkg, Class cls)
	{
		throw new RuntimeException("Stub!");
	}

	public ComponentName(Parcel in)
	{
		throw new RuntimeException("Stub!");
	}

	public String getPackageName()
	{
		throw new RuntimeException("Stub!");
	}

	public String getClassName()
	{
		throw new RuntimeException("Stub!");
	}

	public String getShortClassName()
	{
		throw new RuntimeException("Stub!");
	}

	public String flattenToString()
	{
		throw new RuntimeException("Stub!");
	}

	public String flattenToShortString()
	{
		throw new RuntimeException("Stub!");
	}

	public static ComponentName unflattenFromString(String str)
	{
		throw new RuntimeException("Stub!");
	}

	public String toShortString()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel out, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public static void writeToParcel(ComponentName c, Parcel out)
	{
		throw new RuntimeException("Stub!");
	}

	public static ComponentName readFromParcel(Parcel in)
	{
		throw new RuntimeException("Stub!");
	}

}
