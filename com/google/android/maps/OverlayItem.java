// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   OverlayItem.java

package com.google.android.maps;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.maps:
//			GeoPoint

public class OverlayItem
{

	protected final GeoPoint mPoint;
	protected final String mTitle;
	protected final String mSnippet;
	protected Drawable mMarker;
	public static final int ITEM_STATE_FOCUSED_MASK = 4;
	public static final int ITEM_STATE_SELECTED_MASK = 2;
	public static final int ITEM_STATE_PRESSED_MASK = 1;

	public OverlayItem(GeoPoint point, String title, String snippet)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMarker(Drawable marker)
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getMarker(int stateBitset)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setState(Drawable drawable, int stateBitset)
	{
		throw new RuntimeException("Stub!");
	}

	public String getTitle()
	{
		throw new RuntimeException("Stub!");
	}

	public String getSnippet()
	{
		throw new RuntimeException("Stub!");
	}

	public GeoPoint getPoint()
	{
		throw new RuntimeException("Stub!");
	}

	public String routableAddress()
	{
		throw new RuntimeException("Stub!");
	}
}
