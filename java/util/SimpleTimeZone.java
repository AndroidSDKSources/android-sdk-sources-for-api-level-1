// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SimpleTimeZone.java

package java.util;


// Referenced classes of package java.util:
//			TimeZone, Date

public class SimpleTimeZone extends TimeZone
{

	public static final int UTC_TIME = 2;
	public static final int STANDARD_TIME = 1;
	public static final int WALL_TIME = 0;

	public SimpleTimeZone(int offset, String name)
	{
		throw new RuntimeException("Stub!");
	}

	public SimpleTimeZone(int offset, String name, int startMonth, int startDay, int startDayOfWeek, int startTime, int endMonth, 
			int endDay, int endDayOfWeek, int endTime)
	{
		throw new RuntimeException("Stub!");
	}

	public SimpleTimeZone(int offset, String name, int startMonth, int startDay, int startDayOfWeek, int startTime, int endMonth, 
			int endDay, int endDayOfWeek, int endTime, int daylightSavings)
	{
		throw new RuntimeException("Stub!");
	}

	public SimpleTimeZone(int offset, String name, int startMonth, int startDay, int startDayOfWeek, int startTime, int startTimeMode, 
			int endMonth, int endDay, int endDayOfWeek, int endTime, int endTimeMode, int daylightSavings)
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public int getDSTSavings()
	{
		throw new RuntimeException("Stub!");
	}

	public int getOffset(int era, int year, int month, int day, int dayOfWeek, int time)
	{
		throw new RuntimeException("Stub!");
	}

	public int getOffset(long time)
	{
		throw new RuntimeException("Stub!");
	}

	public int getRawOffset()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasSameRules(TimeZone zone)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean inDaylightTime(Date time)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDSTSavings(int milliseconds)
	{
		throw new RuntimeException("Stub!");
	}

	public void setEndRule(int month, int dayOfMonth, int time)
	{
		throw new RuntimeException("Stub!");
	}

	public void setEndRule(int month, int day, int dayOfWeek, int time)
	{
		throw new RuntimeException("Stub!");
	}

	public void setEndRule(int month, int day, int dayOfWeek, int time, boolean after)
	{
		throw new RuntimeException("Stub!");
	}

	public void setRawOffset(int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStartRule(int month, int dayOfMonth, int time)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStartRule(int month, int day, int dayOfWeek, int time)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStartRule(int month, int day, int dayOfWeek, int time, boolean after)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStartYear(int year)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean useDaylightTime()
	{
		throw new RuntimeException("Stub!");
	}
}
