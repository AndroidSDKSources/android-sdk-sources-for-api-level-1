// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LocationManager.java

package android.location;

import android.app.PendingIntent;
import android.os.Looper;
import java.util.List;

// Referenced classes of package android.location:
//			LocationProvider, Criteria, LocationListener, Location

public class LocationManager
{

	public static final String NETWORK_PROVIDER = "network";
	public static final String GPS_PROVIDER = "gps";
	public static final String KEY_PROXIMITY_ENTERING = "entering";

	LocationManager()
	{
		throw new RuntimeException("Stub!");
	}

	public List getAllProviders()
	{
		throw new RuntimeException("Stub!");
	}

	public List getProviders(boolean enabledOnly)
	{
		throw new RuntimeException("Stub!");
	}

	public LocationProvider getProvider(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public List getProviders(Criteria criteria, boolean enabledOnly)
	{
		throw new RuntimeException("Stub!");
	}

	public String getBestProvider(Criteria criteria, boolean enabledOnly)
	{
		throw new RuntimeException("Stub!");
	}

	public void requestLocationUpdates(String provider, long minTime, float minDistance, LocationListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void requestLocationUpdates(String provider, long minTime, float minDistance, LocationListener listener, Looper looper)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeUpdates(LocationListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void addProximityAlert(double latitude, double longitude, float radius, long expiration, 
			PendingIntent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeProximityAlert(PendingIntent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isProviderEnabled(String provider)
	{
		throw new RuntimeException("Stub!");
	}

	public Location getLastKnownLocation(String provider)
	{
		throw new RuntimeException("Stub!");
	}
}
