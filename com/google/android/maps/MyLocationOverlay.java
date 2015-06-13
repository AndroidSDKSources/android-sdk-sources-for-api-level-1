// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MyLocationOverlay.java

package com.google.android.maps;

import android.content.Context;
import android.graphics.Canvas;
import android.hardware.SensorListener;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

// Referenced classes of package com.google.android.maps:
//			Overlay, MapView, GeoPoint

public class MyLocationOverlay extends Overlay
	implements SensorListener, LocationListener
{

	public MyLocationOverlay(Context context, MapView mapView)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean enableCompass()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void disableCompass()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isCompassEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean enableMyLocation()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void disableMyLocation()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void onSensorChanged(int sensor, float values[])
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void onLocationChanged(Location location)
	{
		throw new RuntimeException("Stub!");
	}

	public void onStatusChanged(String provider, int status, Bundle extras)
	{
		throw new RuntimeException("Stub!");
	}

	public void onProviderEnabled(String provider)
	{
		throw new RuntimeException("Stub!");
	}

	public void onProviderDisabled(String provider)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTap(GeoPoint p, MapView map)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean dispatchTap()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean draw(Canvas canvas, MapView mapView, boolean shadow, long when)
	{
		throw new RuntimeException("Stub!");
	}

	protected void drawMyLocation(Canvas canvas, MapView mapView, Location lastFix, GeoPoint myLocation, long when)
	{
		throw new RuntimeException("Stub!");
	}

	protected void drawCompass(Canvas canvas, float bearing)
	{
		throw new RuntimeException("Stub!");
	}

	public GeoPoint getMyLocation()
	{
		throw new RuntimeException("Stub!");
	}

	public Location getLastFix()
	{
		throw new RuntimeException("Stub!");
	}

	public float getOrientation()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isMyLocationEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean runOnFirstFix(Runnable runnable)
	{
		throw new RuntimeException("Stub!");
	}

	public void onAccuracyChanged(int sensor, int accuracy)
	{
		throw new RuntimeException("Stub!");
	}
}
