// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LocationListener.java

package android.location;

import android.os.Bundle;

// Referenced classes of package android.location:
//			Location

public interface LocationListener
{

	public abstract void onLocationChanged(Location location);

	public abstract void onStatusChanged(String s, int i, Bundle bundle);

	public abstract void onProviderEnabled(String s);

	public abstract void onProviderDisabled(String s);
}
