// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Float.java

package java.lang;

// Referenced classes of package java.lang:
//			Number, RuntimeException, Comparable, NumberFormatException, 
//			Class, String, Object

public final class Float extends Number
	implements Comparable
{

	public static final float MAX_VALUE = 3.402823E+038F;
	public static final float MIN_VALUE = 1.401298E-045F;
	public static final float NaN = (0.0F / 0.0F);
	public static final float POSITIVE_INFINITY = (1.0F / 0.0F);
	public static final float NEGATIVE_INFINITY = (-1.0F / 0.0F);
	public static final Class TYPE = null;
	public static final int SIZE = 32;

	public Float(float value)
	{
		throw new RuntimeException("Stub!");
	}

	public Float(double value)
	{
		throw new RuntimeException("Stub!");
	}

	public Float(String string)
		throws NumberFormatException
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(Float object)
	{
		throw new RuntimeException("Stub!");
	}

	public byte byteValue()
	{
		throw new RuntimeException("Stub!");
	}

	public double doubleValue()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public static native int floatToIntBits(float f);

	public static native int floatToRawIntBits(float f);

	public float floatValue()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public static native float intBitsToFloat(int i);

	public int intValue()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isInfinite()
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isInfinite(float f)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isNaN()
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isNaN(float f)
	{
		throw new RuntimeException("Stub!");
	}

	public long longValue()
	{
		throw new RuntimeException("Stub!");
	}

	public static float parseFloat(String string)
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

	public static String toString(float f)
	{
		throw new RuntimeException("Stub!");
	}

	public static Float valueOf(String string)
		throws NumberFormatException
	{
		throw new RuntimeException("Stub!");
	}

	public static int compare(float float1, float float2)
	{
		throw new RuntimeException("Stub!");
	}

	public static Float valueOf(float f)
	{
		throw new RuntimeException("Stub!");
	}

	public static String toHexString(float f)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((Float)x0);
	}

}
