// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WifiInfo.java

package android.net.wifi;

import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.net.wifi:
//			SupplicantState

public class WifiInfo
	implements Parcelable
{

	public static final String LINK_SPEED_UNITS = "Mbps";

	WifiInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public String getSSID()
	{
		throw new RuntimeException("Stub!");
	}

	public String getBSSID()
	{
		throw new RuntimeException("Stub!");
	}

	public int getRssi()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLinkSpeed()
	{
		throw new RuntimeException("Stub!");
	}

	public String getMacAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public int getNetworkId()
	{
		throw new RuntimeException("Stub!");
	}

	public SupplicantState getSupplicantState()
	{
		throw new RuntimeException("Stub!");
	}

	public int getIpAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getHiddenSSID()
	{
		throw new RuntimeException("Stub!");
	}

	public static android.net.NetworkInfo.DetailedState getDetailedStateOf(SupplicantState suppState)
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

	public void writeToParcel(Parcel dest, int flags)
	{
		throw new RuntimeException("Stub!");
	}
}
