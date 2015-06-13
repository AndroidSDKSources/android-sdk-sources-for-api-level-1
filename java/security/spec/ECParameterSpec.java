// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ECParameterSpec.java

package java.security.spec;

import java.math.BigInteger;

// Referenced classes of package java.security.spec:
//			AlgorithmParameterSpec, EllipticCurve, ECPoint

public class ECParameterSpec
	implements AlgorithmParameterSpec
{

	public ECParameterSpec(EllipticCurve curve, ECPoint generator, BigInteger order, int cofactor)
	{
		throw new RuntimeException("Stub!");
	}

	public int getCofactor()
	{
		throw new RuntimeException("Stub!");
	}

	public EllipticCurve getCurve()
	{
		throw new RuntimeException("Stub!");
	}

	public ECPoint getGenerator()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getOrder()
	{
		throw new RuntimeException("Stub!");
	}
}
