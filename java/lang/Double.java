// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Double.java

package java.lang;

// Referenced classes of package java.lang:
//			Number, RuntimeException, Comparable, NumberFormatException, 
//			Class, String, Object

public final class Double extends Number
	implements Comparable
{

	public static final double MAX_VALUE = 1.7976931348623157E+308D;
	public static final double MIN_VALUE = 4.9406564584124654E-324D;
	public static final double NaN = (0.0D / 0.0D);
	public static final double POSITIVE_INFINITY = (1.0D / 0.0D);
	public static final double NEGATIVE_INFINITY = (-1.0D / 0.0D);
	public static final Class TYPE = null;
	public static final int SIZE = 64;

	public Double(double value)
	{
		throw new RuntimeException("Stub!");
	}

	public Double(String string)
		throws NumberFormatException
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(Double object)
	{
		throw new RuntimeException("Stub!");
	}

	public byte byteValue()
	{
		throw new RuntimeException("Stub!");
	}

	public static native long doubleToLongBits(double d);

	public static native long doubleToRawLongBits(double d);

	public double doubleValue()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public float floatValue()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public int intValue()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isInfinite()
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isInfinite(double d)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isNaN()
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isNaN(double d)
	{
		throw new RuntimeException("Stub!");
	}

	public static native double longBitsToDouble(long l);

	public long longValue()
	{
		throw new RuntimeException("Stub!");
	}

	public static double parseDouble(String string)
		throws NumberFormatException
	{
		throw new RuntimeException("Stub!");
	}

	public short shortValue()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public static String toString(double d)
	{
		throw new RuntimeException("Stub!");
	}

	public static Double valueOf(String string)
		throws NumberFormatException
	{
		throw new RuntimeException("Stub!");
	}

	public static int compare(double double1, double double2)
	{
		throw new RuntimeException("Stub!");
	}

	public static Double valueOf(double d)
	{
		throw new RuntimeException("Stub!");
	}

	public static String toHexString(double d)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((Double)x0);
	}

}
