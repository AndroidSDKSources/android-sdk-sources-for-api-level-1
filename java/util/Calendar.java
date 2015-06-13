// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Calendar.java

package java.util;

import java.io.Serializable;

// Referenced classes of package java.util:
//			TimeZone, Locale, Date

public abstract class Calendar
	implements Serializable, Cloneable, Comparable
{

	protected boolean areFieldsSet;
	protected int fields[];
	protected boolean isSet[];
	protected boolean isTimeSet;
	protected long time;
	public static final int JANUARY = 0;
	public static final int FEBRUARY = 1;
	public static final int MARCH = 2;
	public static final int APRIL = 3;
	public static final int MAY = 4;
	public static final int JUNE = 5;
	public static final int JULY = 6;
	public static final int AUGUST = 7;
	public static final int SEPTEMBER = 8;
	public static final int OCTOBER = 9;
	public static final int NOVEMBER = 10;
	public static final int DECEMBER = 11;
	public static final int UNDECIMBER = 12;
	public static final int SUNDAY = 1;
	public static final int MONDAY = 2;
	public static final int TUESDAY = 3;
	public static final int WEDNESDAY = 4;
	public static final int THURSDAY = 5;
	public static final int FRIDAY = 6;
	public static final int SATURDAY = 7;
	public static final int ERA = 0;
	public static final int YEAR = 1;
	public static final int MONTH = 2;
	public static final int WEEK_OF_YEAR = 3;
	public static final int WEEK_OF_MONTH = 4;
	public static final int DATE = 5;
	public static final int DAY_OF_MONTH = 5;
	public static final int DAY_OF_YEAR = 6;
	public static final int DAY_OF_WEEK = 7;
	public static final int DAY_OF_WEEK_IN_MONTH = 8;
	public static final int AM_PM = 9;
	public static final int HOUR = 10;
	public static final int HOUR_OF_DAY = 11;
	public static final int MINUTE = 12;
	public static final int SECOND = 13;
	public static final int MILLISECOND = 14;
	public static final int ZONE_OFFSET = 15;
	public static final int DST_OFFSET = 16;
	public static final int FIELD_COUNT = 17;
	public static final int AM = 0;
	public static final int PM = 1;

	protected Calendar()
	{
		fields = null;
		isSet = null;
		throw new RuntimeException("Stub!");
	}

	protected Calendar(TimeZone timezone, Locale locale)
	{
		fields = null;
		isSet = null;
		throw new RuntimeException("Stub!");
	}

	public abstract void add(int i, int j);

	public boolean after(Object calendar)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean before(Object calendar)
	{
		throw new RuntimeException("Stub!");
	}

	public final void clear()
	{
		throw new RuntimeException("Stub!");
	}

	public final void clear(int field)
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
	{
		throw new RuntimeException("Stub!");
	}

	protected void complete()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void computeFields();

	protected abstract void computeTime();

	public boolean equals(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public int get(int field)
	{
		throw new RuntimeException("Stub!");
	}

	public int getActualMaximum(int field)
	{
		throw new RuntimeException("Stub!");
	}

	public int getActualMinimum(int field)
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized Locale[] getAvailableLocales()
	{
		throw new RuntimeException("Stub!");
	}

	public int getFirstDayOfWeek()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int getGreatestMinimum(int i);

	public static synchronized Calendar getInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized Calendar getInstance(Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized Calendar getInstance(TimeZone timezone)
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized Calendar getInstance(TimeZone timezone, Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int getLeastMaximum(int i);

	public abstract int getMaximum(int i);

	public int getMinimalDaysInFirstWeek()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int getMinimum(int i);

	public final Date getTime()
	{
		throw new RuntimeException("Stub!");
	}

	public long getTimeInMillis()
	{
		throw new RuntimeException("Stub!");
	}

	public TimeZone getTimeZone()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	protected final int internalGet(int field)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isLenient()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isSet(int field)
	{
		throw new RuntimeException("Stub!");
	}

	public void roll(int field, int value)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void roll(int i, boolean flag);

	public void set(int field, int value)
	{
		throw new RuntimeException("Stub!");
	}

	public final void set(int year, int month, int day)
	{
		throw new RuntimeException("Stub!");
	}

	public final void set(int year, int month, int day, int hourOfDay, int minute)
	{
		throw new RuntimeException("Stub!");
	}

	public final void set(int year, int month, int day, int hourOfDay, int minute, int second)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFirstDayOfWeek(int value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setLenient(boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMinimalDaysInFirstWeek(int value)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setTime(Date date)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTimeInMillis(long milliseconds)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTimeZone(TimeZone timezone)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(Calendar anotherCalendar)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((Calendar)x0);
	}
}
