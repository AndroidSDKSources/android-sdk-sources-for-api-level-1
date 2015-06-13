// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Location.java

package android.location;

import android.os.*;

public class Location
	implements Parcelable
{

	public static final int FORMAT_DEGREES = 0;
	public static final int FORMAT_MINUTES = 1;
	public static final int FORMAT_SECONDS = 2;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public Location(String provider)
	{
		throw new RuntimeException("Stub!");
	}

	public Location(Location l)
	{
		throw new RuntimeException("Stub!");
	}

	public void set(Location l)
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
	{
		throw new RuntimeException("Stub!");
	}

	public static String convert(double coordinate, int outputType)
	{
		throw new RuntimeException("Stub!");
	}

	public static double convert(String coordinate)
	{
		throw new RuntimeException("Stub!");
	}

	public static void distanceBetween(double startLatitude, double startLongitude, double endLatitude, double endLongitude, 
			float results[])
	{
		throw new RuntimeException("Stub!");
	}

	public float distanceTo(Location dest)
	{
		throw new RuntimeException("Stub!");
	}

	public float bearingTo(Location dest)
	{
		throw new RuntimeException("Stub!");
	}

	public String getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public void setProvider(String provider)
	{
		throw new RuntimeException("Stub!");
	}

	public long getTime()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTime(long time)
	{
		throw new RuntimeException("Stub!");
	}

	public double getLatitude()
	{
		throw new RuntimeException("Stub!");
	}

	public void setLatitude(double latitude)
	{
		throw new RuntimeException("Stub!");
	}

	public double getLongitude()
	{
		throw new RuntimeException("Stub!");
	}

	public void setLongitude(double longitude)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasAltitude()
	{
		throw new RuntimeException("Stub!");
	}

	public double getAltitude()
	{
		throw new RuntimeException("Stub!");
	}

	public void setAltitude(double altitude)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeAltitude()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasSpeed()
	{
		throw new RuntimeException("Stub!");
	}

	public float getSpeed()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSpeed(float speed)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeSpeed()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasBearing()
	{
		throw new RuntimeException("Stub!");
	}

	public float getBearing()
	{
		throw new RuntimeException("Stub!");
	}

	public void setBearing(float bearing)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeBearing()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasAccuracy()
	{
		throw new RuntimeException("Stub!");
	}

	public float getAccuracy()
	{
		throw new RuntimeException("Stub!");
	}

	public void setAccuracy(float accuracy)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeAccuracy()
	{
		throw new RuntimeException("Stub!");
	}

	public Bundle getExtras()
	{
		throw new RuntimeException("Stub!");
	}

	public void setExtras(Bundle extras)
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

	public void writeToParcel(Parcel parcel, int flags)
	{
		throw new RuntimeException("Stub!");
	}

}
