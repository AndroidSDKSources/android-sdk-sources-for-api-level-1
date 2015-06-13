// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Long.java

package java.lang;

// Referenced classes of package java.lang:
//			Number, RuntimeException, Comparable, NumberFormatException, 
//			Class, String, Object

public final class Long extends Number
	implements Comparable
{

	public static final long MAX_VALUE = 0x7fffffffffffffffL;
	public static final long MIN_VALUE = 0x8000000000000000L;
	public static final Class TYPE = null;
	public static final int SIZE = 64;

	public Long(long value)
	{
		throw new RuntimeException("Stub!");
	}

	public Long(String string)
		throws NumberFormatException
	{
		throw new RuntimeException("Stub!");
	}

	public byte byteValue()
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(Long object)
	{
		throw new RuntimeException("Stub!");
	}

	public static Long decode(String string)
		throws NumberFormatException
	{
		throw new RuntimeException("Stub!");
	}

	public double doubleValue()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object o)
	{
		throw new RuntimeException("Stub!");
	}

	public float floatValue()
	{
		throw new RuntimeException("Stub!");
	}

	public static Long getLong(String string)
	{
		throw new RuntimeException("Stub!");
	}

	public static Long getLong(String string, long defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public static Long getLong(String string, Long defaultValue)
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

	public long longValue()
	{
		throw new RuntimeException("Stub!");
	}

	public static long parseLong(String string)
		throws NumberFormatException
	{
		throw new RuntimeException("Stub!");
	}

	public static long parseLong(String string, int radix)
		throws NumberFormatException
	{
		throw new RuntimeException("Stub!");
	}

	public short shortValue()
	{
		throw new RuntimeException("Stub!");
	}

	public static String toBinaryString(long l)
	{
		throw new RuntimeException("Stub!");
	}

	public static String toHexString(long l)
	{
		throw new RuntimeException("Stub!");
	}

	public static String toOctalString(long l)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public static String toString(long l)
	{
		throw new RuntimeException("Stub!");
	}

	public static String toString(long l, int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public static Long valueOf(String string)
		throws NumberFormatException
	{
		throw new RuntimeException("Stub!");
	}

	public static Long valueOf(String string, int radix)
		throws NumberFormatException
	{
		throw new RuntimeException("Stub!");
	}

	public static long highestOneBit(long lng)
	{
		throw new RuntimeException("Stub!");
	}

	public static long lowestOneBit(long lng)
	{
		throw new RuntimeException("Stub!");
	}

	public static int numberOfLeadingZeros(long lng)
	{
		throw new RuntimeException("Stub!");
	}

	public static int numberOfTrailingZeros(long lng)
	{
		throw new RuntimeException("Stub!");
	}

	public static int bitCount(long lng)
	{
		throw new RuntimeException("Stub!");
	}

	public static long rotateLeft(long lng, int distance)
	{
		throw new RuntimeException("Stub!");
	}

	public static long rotateRight(long lng, int distance)
	{
		throw new RuntimeException("Stub!");
	}

	public static long reverseBytes(long lng)
	{
		throw new RuntimeException("Stub!");
	}

	public static long reverse(long lng)
	{
		throw new RuntimeException("Stub!");
	}

	public static int signum(long lng)
	{
		throw new RuntimeException("Stub!");
	}

	public static Long valueOf(long lng)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((Long)x0);
	}

}
