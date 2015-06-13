// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Display.java

package android.view;

import android.util.DisplayMetrics;

public class Display
{

	public static final int DEFAULT_DISPLAY = 0;

	Display()
	{
		throw new RuntimeException("Stub!");
	}

	public int getDisplayId()
	{
		throw new RuntimeException("Stub!");
	}

	public native int getWidth();

	public native int getHeight();

	public native int getOrientation();

	public int getPixelFormat()
	{
		throw new RuntimeException("Stub!");
	}

	public float getRefreshRate()
	{
		throw new RuntimeException("Stub!");
	}

	public void getMetrics(DisplayMetrics outMetrics)
	{
		throw new RuntimeException("Stub!");
	}
}
