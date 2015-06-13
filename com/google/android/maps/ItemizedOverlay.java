// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ItemizedOverlay.java

package com.google.android.maps;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;

// Referenced classes of package com.google.android.maps:
//			Overlay, OverlayItem, GeoPoint, MapView

public abstract class ItemizedOverlay extends Overlay
{
	public static interface OnFocusChangeListener
	{

		public abstract void onFocusChanged(ItemizedOverlay itemizedoverlay, OverlayItem overlayitem);
	}


	public ItemizedOverlay(Drawable defaultMarker)
	{
		throw new RuntimeException("Stub!");
	}

	protected static Drawable boundCenterBottom(Drawable balloon)
	{
		throw new RuntimeException("Stub!");
	}

	protected static Drawable boundCenter(Drawable balloon)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract OverlayItem createItem(int i);

	public abstract int size();

	public GeoPoint getCenter()
	{
		throw new RuntimeException("Stub!");
	}

	protected int getIndexToDraw(int drawingOrder)
	{
		throw new RuntimeException("Stub!");
	}

	public void draw(Canvas canvas, MapView mapView, boolean shadow)
	{
		throw new RuntimeException("Stub!");
	}

	public int getLatSpanE6()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLonSpanE6()
	{
		throw new RuntimeException("Stub!");
	}

	protected final void populate()
	{
		throw new RuntimeException("Stub!");
	}

	protected void setLastFocusedIndex(int lastFocusedIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFocus(OverlayItem item)
	{
		throw new RuntimeException("Stub!");
	}

	public OverlayItem getFocus()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getLastFocusedIndex()
	{
		throw new RuntimeException("Stub!");
	}

	public final OverlayItem getItem(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public OverlayItem nextFocus(boolean forwards)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTap(GeoPoint p, MapView mapView)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTrackballEvent(MotionEvent event, MapView mapView)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyUp(int keyCode, KeyEvent event, MapView mapView)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent event, MapView mapView)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean hitTest(OverlayItem item, Drawable marker, int hitX, int hitY)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnFocusChangeListener(OnFocusChangeListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDrawFocusedItem(boolean drawFocusedItem)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean onTap(int index)
	{
		throw new RuntimeException("Stub!");
	}
}
