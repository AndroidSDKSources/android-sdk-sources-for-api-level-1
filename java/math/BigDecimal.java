// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BigDecimal.java

package java.math;

import java.io.Serializable;

// Referenced classes of package java.math:
//			MathContext, BigInteger, RoundingMode

public class BigDecimal extends Number
	implements Comparable, Serializable
{

	public static final BigDecimal ZERO = null;
	public static final BigDecimal ONE = null;
	public static final BigDecimal TEN = null;
	public static final int ROUND_UP = 0;
	public static final int ROUND_DOWN = 1;
	public static final int ROUND_CEILING = 2;
	public static final int ROUND_FLOOR = 3;
	public static final int ROUND_HALF_UP = 4;
	public static final int ROUND_HALF_DOWN = 5;
	public static final int ROUND_HALF_EVEN = 6;
	public static final int ROUND_UNNECESSARY = 7;

	public BigDecimal(char in[], int offset, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(char in[], int offset, int len, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(char in[])
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(char in[], MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(String val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(String val, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(double val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(double val, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(BigInteger val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(BigInteger val, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(BigInteger unscaledVal, int scale)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(BigInteger unscaledVal, int scale, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(int val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(int val, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(long val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal(long val, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public static BigDecimal valueOf(long unscaledVal, int scale)
	{
		throw new RuntimeException("Stub!");
	}

	public static BigDecimal valueOf(long unscaledVal)
	{
		throw new RuntimeException("Stub!");
	}

	public static BigDecimal valueOf(double val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal add(BigDecimal augend)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal add(BigDecimal augend, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal subtract(BigDecimal subtrahend)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal subtract(BigDecimal subtrahend, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal multiply(BigDecimal multiplicand)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal multiply(BigDecimal multiplicand, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divide(BigDecimal divisor, int roundingMode)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divide(BigDecimal divisor, RoundingMode roundingMode)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divide(BigDecimal divisor)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divide(BigDecimal divisor, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divideToIntegralValue(BigDecimal divisor)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal divideToIntegralValue(BigDecimal divisor, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal remainder(BigDecimal divisor)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal remainder(BigDecimal divisor, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal[] divideAndRemainder(BigDecimal divisor)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal[] divideAndRemainder(BigDecimal divisor, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal pow(int n)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal pow(int n, MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal abs()
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal abs(MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal negate()
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal negate(MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal plus()
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal plus(MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public int signum()
	{
		throw new RuntimeException("Stub!");
	}

	public int scale()
	{
		throw new RuntimeException("Stub!");
	}

	public int precision()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger unscaledValue()
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal round(MathContext mc)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal setScale(int newScale, RoundingMode roundingMode)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal setScale(int newScale, int roundingMode)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal setScale(int newScale)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal movePointLeft(int n)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal movePointRight(int n)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal scaleByPowerOfTen(int n)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal stripTrailingZeros()
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(BigDecimal val)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object x)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal min(BigDecimal val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal max(BigDecimal val)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public String toEngineeringString()
	{
		throw new RuntimeException("Stub!");
	}

	public String toPlainString()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger toBigInteger()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger toBigIntegerExact()
	{
		throw new RuntimeException("Stub!");
	}

	public long longValue()
	{
		throw new RuntimeException("Stub!");
	}

	public long longValueExact()
	{
		throw new RuntimeException("Stub!");
	}

	public int intValue()
	{
		throw new RuntimeException("Stub!");
	}

	public int intValueExact()
	{
		throw new RuntimeException("Stub!");
	}

	public short shortValueExact()
	{
		throw new RuntimeException("Stub!");
	}

	public byte byteValueExact()
	{
		throw new RuntimeException("Stub!");
	}

	public float floatValue()
	{
		throw new RuntimeException("Stub!");
	}

	public double doubleValue()
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal ulp()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((BigDecimal)x0);
	}

}
