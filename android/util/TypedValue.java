// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TypedValue.java

package android.util;


// Referenced classes of package android.util:
//			DisplayMetrics

public class TypedValue
{

	public static final int TYPE_NULL = 0;
	public static final int TYPE_REFERENCE = 1;
	public static final int TYPE_ATTRIBUTE = 2;
	public static final int TYPE_STRING = 3;
	public static final int TYPE_FLOAT = 4;
	public static final int TYPE_DIMENSION = 5;
	public static final int TYPE_FRACTION = 6;
	public static final int TYPE_FIRST_INT = 16;
	public static final int TYPE_INT_DEC = 16;
	public static final int TYPE_INT_HEX = 17;
	public static final int TYPE_INT_BOOLEAN = 18;
	public static final int TYPE_FIRST_COLOR_INT = 28;
	public static final int TYPE_INT_COLOR_ARGB8 = 28;
	public static final int TYPE_INT_COLOR_RGB8 = 29;
	public static final int TYPE_INT_COLOR_ARGB4 = 30;
	public static final int TYPE_INT_COLOR_RGB4 = 31;
	public static final int TYPE_LAST_COLOR_INT = 31;
	public static final int TYPE_LAST_INT = 31;
	public static final int COMPLEX_UNIT_SHIFT = 0;
	public static final int COMPLEX_UNIT_MASK = 15;
	public static final int COMPLEX_UNIT_PX = 0;
	public static final int COMPLEX_UNIT_DIP = 1;
	public static final int COMPLEX_UNIT_SP = 2;
	public static final int COMPLEX_UNIT_PT = 3;
	public static final int COMPLEX_UNIT_IN = 4;
	public static final int COMPLEX_UNIT_MM = 5;
	public static final int COMPLEX_UNIT_FRACTION = 0;
	public static final int COMPLEX_UNIT_FRACTION_PARENT = 1;
	public static final int COMPLEX_RADIX_SHIFT = 4;
	public static final int COMPLEX_RADIX_MASK = 3;
	public static final int COMPLEX_RADIX_23p0 = 0;
	public static final int COMPLEX_RADIX_16p7 = 1;
	public static final int COMPLEX_RADIX_8p15 = 2;
	public static final int COMPLEX_RADIX_0p23 = 3;
	public static final int COMPLEX_MANTISSA_SHIFT = 8;
	public static final int COMPLEX_MANTISSA_MASK = 0xffffff;
	public int type;
	public CharSequence string;
	public int data;
	public int assetCookie;
	public int resourceId;
	public int changingConfigurations;

	public TypedValue()
	{
		throw new RuntimeException("Stub!");
	}

	public final float getFloat()
	{
		throw new RuntimeException("Stub!");
	}

	public static float complexToFloat(int complex)
	{
		throw new RuntimeException("Stub!");
	}

	public static float complexToDimension(int data, DisplayMetrics metrics)
	{
		throw new RuntimeException("Stub!");
	}

	public static int complexToDimensionPixelOffset(int data, DisplayMetrics metrics)
	{
		throw new RuntimeException("Stub!");
	}

	public static int complexToDimensionPixelSize(int data, DisplayMetrics metrics)
	{
		throw new RuntimeException("Stub!");
	}

	public static float complexToDimensionNoisy(int data, DisplayMetrics metrics)
	{
		throw new RuntimeException("Stub!");
	}

	public static float applyDimension(int unit, float value, DisplayMetrics metrics)
	{
		throw new RuntimeException("Stub!");
	}

	public float getDimension(DisplayMetrics metrics)
	{
		throw new RuntimeException("Stub!");
	}

	public static float complexToFraction(int data, float base, float pbase)
	{
		throw new RuntimeException("Stub!");
	}

	public float getFraction(float base, float pbase)
	{
		throw new RuntimeException("Stub!");
	}

	public final CharSequence coerceToString()
	{
		throw new RuntimeException("Stub!");
	}

	public static final String coerceToString(int type, int data)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTo(TypedValue other)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
