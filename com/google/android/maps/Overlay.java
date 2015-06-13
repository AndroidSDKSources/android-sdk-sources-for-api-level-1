// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Overlay.java

package com.google.android.maps;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;

// Referenced classes of package com.google.android.maps:
//			MapView, GeoPoint

public abstract class Overlay
{

	protected static final float SHADOW_X_SKEW = -0.9F;
	protected static final float SHADOW_Y_SCALE = 0.5F;

	public Overlay()
	{
		throw new RuntimeException("Stub!");
	}

	protected static void drawAt(Canvas canvas, Drawable drawable, int x, int y, boolean shadow)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent e, MapView mapView)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTrackballEvent(MotionEvent event, MapView mapView)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(int keyCode, KeyEvent event, MapView mapView)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyUp(int keyCode, KeyEvent event, MapView mapView)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTap(GeoPoint p, MapView mapView)
	{
		throw new RuntimeException("Stub!");
	}

	public void draw(Canvas canvas, MapView mapView, boolean shadow)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean draw(Canvas canvas, MapView mapView, boolean shadow, long when)
	{
		throw new RuntimeException("Stub!");
	}
}
