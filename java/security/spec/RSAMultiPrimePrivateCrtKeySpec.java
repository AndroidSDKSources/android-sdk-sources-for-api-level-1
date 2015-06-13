// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RSAMultiPrimePrivateCrtKeySpec.java

package java.security.spec;

import java.math.BigInteger;

// Referenced classes of package java.security.spec:
//			RSAPrivateKeySpec, RSAOtherPrimeInfo

public class RSAMultiPrimePrivateCrtKeySpec extends RSAPrivateKeySpec
{

	public RSAMultiPrimePrivateCrtKeySpec(BigInteger modulus, BigInteger publicExponent, BigInteger privateExponent, BigInteger primeP, BigInteger primeQ, BigInteger primeExponentP, BigInteger primeExponentQ, 
			BigInteger crtCoefficient, RSAOtherPrimeInfo otherPrimeInfo[])
	{
		super((BigInteger)null, (BigInteger)null);
		throw new RuntimeException("Stub!");
	}

	public BigInteger getCrtCoefficient()
	{
		throw new RuntimeException("Stub!");
	}

	public RSAOtherPrimeInfo[] getOtherPrimeInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPrimeExponentP()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPrimeExponentQ()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPrimeP()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPrimeQ()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPublicExponent()
	{
		throw new RuntimeException("Stub!");
	}
}
