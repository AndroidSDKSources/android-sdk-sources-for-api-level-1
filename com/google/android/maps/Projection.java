// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Projection.java

package com.google.android.maps;

import android.graphics.Point;

// Referenced classes of package com.google.android.maps:
//			GeoPoint

public interface Projection
{

	public abstract Point toPixels(GeoPoint geopoint, Point point);

	public abstract GeoPoint fromPixels(int i, int j);

	public abstract float metersToEquatorPixels(float f);
}
