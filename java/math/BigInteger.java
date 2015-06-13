// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BigInteger.java

package java.math;

import java.io.Serializable;
import java.util.Random;

public class BigInteger extends Number
	implements Comparable, Serializable
{

	public static final BigInteger ZERO = null;
	public static final BigInteger ONE = null;
	public static final BigInteger TEN = null;

	public BigInteger(int numBits, Random rnd)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger(int bitLength, int certainty, Random rnd)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger(String val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger(String val, int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger(int signum, byte magnitude[])
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger(byte val[])
	{
		throw new RuntimeException("Stub!");
	}

	public static BigInteger valueOf(long val)
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] toByteArray()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger abs()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger negate()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger add(BigInteger val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger subtract(BigInteger val)
	{
		throw new RuntimeException("Stub!");
	}

	public int signum()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger shiftRight(int n)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger shiftLeft(int n)
	{
		throw new RuntimeException("Stub!");
	}

	public int bitLength()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean testBit(int n)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger setBit(int n)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger clearBit(int n)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger flipBit(int n)
	{
		throw new RuntimeException("Stub!");
	}

	public int getLowestSetBit()
	{
		throw new RuntimeException("Stub!");
	}

	public int bitCount()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger not()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger and(BigInteger val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger or(BigInteger val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger xor(BigInteger val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger andNot(BigInteger val)
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

	public float floatValue()
	{
		throw new RuntimeException("Stub!");
	}

	public double doubleValue()
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(BigInteger val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger min(BigInteger val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger max(BigInteger val)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object x)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString(int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger gcd(BigInteger val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger multiply(BigInteger val)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger pow(int exp)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger[] divideAndRemainder(BigInteger divisor)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger divide(BigInteger divisor)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger remainder(BigInteger divisor)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger modInverse(BigInteger m)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger modPow(BigInteger exponent, BigInteger m)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger mod(BigInteger m)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isProbablePrime(int certainty)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger nextProbablePrime()
	{
		throw new RuntimeException("Stub!");
	}

	public static BigInteger probablePrime(int bitLength, Random rnd)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((BigInteger)x0);
	}

}
