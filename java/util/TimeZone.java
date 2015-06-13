// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TimeZone.java

package java.util;

import java.io.Serializable;

// Referenced classes of package java.util:
//			Locale, Date

public abstract class TimeZone
	implements Serializable, Cloneable
{

	public static final int SHORT = 0;
	public static final int LONG = 1;

	public TimeZone()
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized String[] getAvailableIDs()
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized String[] getAvailableIDs(int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized TimeZone getDefault()
	{
		throw new RuntimeException("Stub!");
	}

	public final String getDisplayName()
	{
		throw new RuntimeException("Stub!");
	}

	public final String getDisplayName(Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getDisplayName(boolean daylightTime, int style)
	{
		throw new RuntimeException("Stub!");
	}

	public String getDisplayName(boolean daylightTime, int style, Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public String getID()
	{
		throw new RuntimeException("Stub!");
	}

	public int getDSTSavings()
	{
		throw new RuntimeException("Stub!");
	}

	public int getOffset(long time)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int getOffset(int i, int j, int k, int l, int i1, int j1);

	public abstract int getRawOffset();

	public static synchronized TimeZone getTimeZone(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasSameRules(TimeZone zone)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean inDaylightTime(Date date);

	public static synchronized void setDefault(TimeZone timezone)
	{
		throw new RuntimeException("Stub!");
	}

	public void setID(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void setRawOffset(int i);

	public abstract boolean useDaylightTime();
}
