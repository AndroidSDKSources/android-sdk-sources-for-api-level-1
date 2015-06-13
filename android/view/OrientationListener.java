// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   OrientationListener.java

package android.view;

import android.content.Context;
import android.hardware.SensorListener;

public abstract class OrientationListener
	implements SensorListener
{

	public static final int ORIENTATION_UNKNOWN = -1;

	public OrientationListener(Context context)
	{
		throw new RuntimeException("Stub!");
	}

	public void enable()
	{
		throw new RuntimeException("Stub!");
	}

	public void disable()
	{
		throw new RuntimeException("Stub!");
	}

	public void onSensorChanged(int sensor, float values[])
	{
		throw new RuntimeException("Stub!");
	}

	public void onAccuracyChanged(int sensor, int accuracy)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void onOrientationChanged(int i);
}
