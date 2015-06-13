// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   NumberFormat.java

package java.text;

import java.io.InvalidObjectException;
import java.util.Currency;
import java.util.Locale;

// Referenced classes of package java.text:
//			Format, ParseException, FieldPosition, ParsePosition

public abstract class NumberFormat extends Format
{
	public static class Field extends Format.Field
	{

		public static final Field SIGN = null;
		public static final Field INTEGER = null;
		public static final Field FRACTION = null;
		public static final Field EXPONENT = null;
		public static final Field EXPONENT_SIGN = null;
		public static final Field EXPONENT_SYMBOL = null;
		public static final Field DECIMAL_SEPARATOR = null;
		public static final Field GROUPING_SEPARATOR = null;
		public static final Field PERCENT = null;
		public static final Field PERMILLE = null;
		public static final Field CURRENCY = null;

		protected Object readResolve()
			throws InvalidObjectException
		{
			throw new RuntimeException("Stub!");
		}


		protected Field(String fieldName)
		{
			super((String)null);
			throw new RuntimeException("Stub!");
		}
	}


	public static final int INTEGER_FIELD = 0;
	public static final int FRACTION_FIELD = 1;

	public NumberFormat()
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

	public final String format(double value)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract StringBuffer format(double d, StringBuffer stringbuffer, FieldPosition fieldposition);

	public final String format(long value)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract StringBuffer format(long l, StringBuffer stringbuffer, FieldPosition fieldposition);

	public StringBuffer format(Object object, StringBuffer buffer, FieldPosition field)
	{
		throw new RuntimeException("Stub!");
	}

	public static Locale[] getAvailableLocales()
	{
		throw new RuntimeException("Stub!");
	}

	public Currency getCurrency()
	{
		throw new RuntimeException("Stub!");
	}

	public static final NumberFormat getCurrencyInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static NumberFormat getCurrencyInstance(Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public static final NumberFormat getIntegerInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static NumberFormat getIntegerInstance(Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public static final NumberFormat getInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static NumberFormat getInstance(Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public int getMaximumFractionDigits()
	{
		throw new RuntimeException("Stub!");
	}

	public int getMaximumIntegerDigits()
	{
		throw new RuntimeException("Stub!");
	}

	public int getMinimumFractionDigits()
	{
		throw new RuntimeException("Stub!");
	}

	public int getMinimumIntegerDigits()
	{
		throw new RuntimeException("Stub!");
	}

	public static final NumberFormat getNumberInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static NumberFormat getNumberInstance(Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public static final NumberFormat getPercentInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static NumberFormat getPercentInstance(Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isGroupingUsed()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isParseIntegerOnly()
	{
		throw new RuntimeException("Stub!");
	}

	public Number parse(String string)
		throws ParseException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Number parse(String s, ParsePosition parseposition);

	public final Object parseObject(String string, ParsePosition position)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCurrency(Currency currency)
	{
		throw new RuntimeException("Stub!");
	}

	public void setGroupingUsed(boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMaximumFractionDigits(int value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMaximumIntegerDigits(int value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMinimumFractionDigits(int value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMinimumIntegerDigits(int value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setParseIntegerOnly(boolean value)
	{
		throw new RuntimeException("Stub!");
	}
}
