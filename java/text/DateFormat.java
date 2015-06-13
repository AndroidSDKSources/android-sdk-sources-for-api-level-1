// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DateFormat.java

package java.text;

import java.io.InvalidObjectException;
import java.util.*;

// Referenced classes of package java.text:
//			Format, ParseException, NumberFormat, FieldPosition, 
//			ParsePosition

public abstract class DateFormat extends Format
{
	public static class Field extends Format.Field
	{

		public static final Field ERA = null;
		public static final Field YEAR = null;
		public static final Field MONTH = null;
		public static final Field HOUR_OF_DAY0 = null;
		public static final Field HOUR_OF_DAY1 = null;
		public static final Field MINUTE = null;
		public static final Field SECOND = null;
		public static final Field MILLISECOND = null;
		public static final Field DAY_OF_WEEK = null;
		public static final Field DAY_OF_MONTH = null;
		public static final Field DAY_OF_YEAR = null;
		public static final Field DAY_OF_WEEK_IN_MONTH = null;
		public static final Field WEEK_OF_YEAR = null;
		public static final Field WEEK_OF_MONTH = null;
		public static final Field AM_PM = null;
		public static final Field HOUR0 = null;
		public static final Field HOUR1 = null;
		public static final Field TIME_ZONE = null;

		public int getCalendarField()
		{
			throw new RuntimeException("Stub!");
		}

		public static Field ofCalendarField(int calendarField)
		{
			throw new RuntimeException("Stub!");
		}

		protected Object readResolve()
			throws InvalidObjectException
		{
			throw new RuntimeException("Stub!");
		}


		protected Field(String fieldName, int calendarField)
		{
			super((String)null);
			throw new RuntimeException("Stub!");
		}
	}


	protected Calendar calendar;
	protected NumberFormat numberFormat;
	public static final int DEFAULT = 2;
	public static final int FULL = 0;
	public static final int LONG = 1;
	public static final int MEDIUM = 2;
	public static final int SHORT = 3;
	public static final int ERA_FIELD = 0;
	public static final int YEAR_FIELD = 1;
	public static final int MONTH_FIELD = 2;
	public static final int DATE_FIELD = 3;
	public static final int HOUR_OF_DAY1_FIELD = 4;
	public static final int HOUR_OF_DAY0_FIELD = 5;
	public static final int MINUTE_FIELD = 6;
	public static final int SECOND_FIELD = 7;
	public static final int MILLISECOND_FIELD = 8;
	public static final int DAY_OF_WEEK_FIELD = 9;
	public static final int DAY_OF_YEAR_FIELD = 10;
	public static final int DAY_OF_WEEK_IN_MONTH_FIELD = 11;
	public static final int WEEK_OF_YEAR_FIELD = 12;
	public static final int WEEK_OF_MONTH_FIELD = 13;
	public static final int AM_PM_FIELD = 14;
	public static final int HOUR1_FIELD = 15;
	public static final int HOUR0_FIELD = 16;
	public static final int TIMEZONE_FIELD = 17;

	protected DateFormat()
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

	public final StringBuffer format(Object object, StringBuffer buffer, FieldPosition field)
	{
		throw new RuntimeException("Stub!");
	}

	public final String format(Date date)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract StringBuffer format(Date date, StringBuffer stringbuffer, FieldPosition fieldposition);

	public static Locale[] getAvailableLocales()
	{
		throw new RuntimeException("Stub!");
	}

	public Calendar getCalendar()
	{
		throw new RuntimeException("Stub!");
	}

	public static final DateFormat getDateInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static final DateFormat getDateInstance(int style)
	{
		throw new RuntimeException("Stub!");
	}

	public static final DateFormat getDateInstance(int style, Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public static final DateFormat getDateTimeInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static final DateFormat getDateTimeInstance(int dateStyle, int timeStyle)
	{
		throw new RuntimeException("Stub!");
	}

	public static final DateFormat getDateTimeInstance(int dateStyle, int timeStyle, Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public static final DateFormat getInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public NumberFormat getNumberFormat()
	{
		throw new RuntimeException("Stub!");
	}

	public static final DateFormat getTimeInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static final DateFormat getTimeInstance(int style)
	{
		throw new RuntimeException("Stub!");
	}

	public static final DateFormat getTimeInstance(int style, Locale locale)
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

	public boolean isLenient()
	{
		throw new RuntimeException("Stub!");
	}

	public Date parse(String string)
		throws ParseException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Date parse(String s, ParsePosition parseposition);

	public Object parseObject(String string, ParsePosition position)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCalendar(Calendar cal)
	{
		throw new RuntimeException("Stub!");
	}

	public void setLenient(boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setNumberFormat(NumberFormat format)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTimeZone(TimeZone timezone)
	{
		throw new RuntimeException("Stub!");
	}
}
