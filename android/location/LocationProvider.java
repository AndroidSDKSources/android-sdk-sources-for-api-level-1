// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LocationProvider.java

package android.location;


// Referenced classes of package android.location:
//			Criteria

public abstract class LocationProvider
{

	public static final int OUT_OF_SERVICE = 0;
	public static final int TEMPORARILY_UNAVAILABLE = 1;
	public static final int AVAILABLE = 2;

	LocationProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean meetsCriteria(Criteria criteria)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean requiresNetwork();

	public abstract boolean requiresSatellite();

	public abstract boolean requiresCell();

	public abstract boolean hasMonetaryCost();

	public abstract boolean supportsAltitude();

	public abstract boolean supportsSpeed();

	public abstract boolean supportsBearing();

	public abstract int getPowerRequirement();

	public abstract int getAccuracy();
}
