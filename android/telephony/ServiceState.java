// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ServiceState.java

package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public class ServiceState
	implements Parcelable
{

	public static final int STATE_IN_SERVICE = 0;
	public static final int STATE_OUT_OF_SERVICE = 1;
	public static final int STATE_EMERGENCY_ONLY = 2;
	public static final int STATE_POWER_OFF = 3;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public ServiceState()
	{
		throw new RuntimeException("Stub!");
	}

	public ServiceState(ServiceState s)
	{
		throw new RuntimeException("Stub!");
	}

	public ServiceState(Parcel in)
	{
		throw new RuntimeException("Stub!");
	}

	protected void copyFrom(ServiceState s)
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel out, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public int getState()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getRoaming()
	{
		throw new RuntimeException("Stub!");
	}

	public String getOperatorAlphaLong()
	{
		throw new RuntimeException("Stub!");
	}

	public String getOperatorAlphaShort()
	{
		throw new RuntimeException("Stub!");
	}

	public String getOperatorNumeric()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getIsManualSelection()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object o)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public void setStateOutOfService()
	{
		throw new RuntimeException("Stub!");
	}

	public void setStateOff()
	{
		throw new RuntimeException("Stub!");
	}

	public void setState(int state)
	{
		throw new RuntimeException("Stub!");
	}

	public void setRoaming(boolean roaming)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOperatorName(String longName, String shortName, String numeric)
	{
		throw new RuntimeException("Stub!");
	}

	public void setIsManualSelection(boolean isManual)
	{
		throw new RuntimeException("Stub!");
	}

}
