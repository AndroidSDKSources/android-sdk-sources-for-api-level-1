// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RSAMultiPrimePrivateCrtKey.java

package java.security.interfaces;

import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;

// Referenced classes of package java.security.interfaces:
//			RSAPrivateKey

public interface RSAMultiPrimePrivateCrtKey
	extends RSAPrivateKey
{

	public static final long serialVersionUID = 0x893c8f62dbaf8a8L;

	public abstract BigInteger getCrtCoefficient();

	public abstract RSAOtherPrimeInfo[] getOtherPrimeInfo();

	public abstract BigInteger getPrimeP();

	public abstract BigInteger getPrimeQ();

	public abstract BigInteger getPrimeExponentP();

	public abstract BigInteger getPrimeExponentQ();

	public abstract BigInteger getPublicExponent();
}
