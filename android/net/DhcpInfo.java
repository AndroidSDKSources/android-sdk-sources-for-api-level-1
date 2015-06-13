// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DhcpInfo.java

package android.net;

import android.os.Parcel;
import android.os.Parcelable;

public class DhcpInfo
	implements Parcelable
{

	public int ipAddress;
	public int gateway;
	public int netmask;
	public int dns1;
	public int dns2;
	public int serverAddress;
	public int leaseDuration;

	public DhcpInfo()
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
