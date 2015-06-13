// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Criteria.java

package android.location;

import android.os.Parcel;
import android.os.Parcelable;

public class Criteria
	implements Parcelable
{

	public static final int NO_REQUIREMENT = 0;
	public static final int POWER_LOW = 1;
	public static final int POWER_MEDIUM = 2;
	public static final int POWER_HIGH = 3;
	public static final int ACCURACY_FINE = 1;
	public static final int ACCURACY_COARSE = 2;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public Criteria()
	{
		throw new RuntimeException("Stub!");
	}

	public Criteria(Criteria criteria)
	{
		throw new RuntimeException("Stub!");
	}

	public void setAccuracy(int accuracy)
	{
		throw new RuntimeException("Stub!");
	}

	public int getAccuracy()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPowerRequirement(int level)
	{
		throw new RuntimeException("Stub!");
	}

	public int getPowerRequirement()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCostAllowed(boolean costAllowed)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isCostAllowed()
	{
		throw new RuntimeException("Stub!");
	}

	public void setAltitudeRequired(boolean altitudeRequired)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAltitudeRequired()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSpeedRequired(boolean speedRequired)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isSpeedRequired()
	{
		throw new RuntimeException("Stub!");
	}

	public void setBearingRequired(boolean bearingRequired)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isBearingRequired()
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel parcel, int flags)
	{
		throw new RuntimeException("Stub!");
	}

}
