// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ScanResult.java

package android.net.wifi;

import android.os.Parcel;
import android.os.Parcelable;

public class ScanResult
	implements Parcelable
{

	public String SSID;
	public String BSSID;
	public String capabilities;
	public int level;
	public int frequency;

	ScanResult()
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
