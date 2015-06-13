// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DHParameterSpec.java

package javax.crypto.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

public class DHParameterSpec
	implements AlgorithmParameterSpec
{

	public DHParameterSpec(BigInteger p, BigInteger g)
	{
		throw new RuntimeException("Stub!");
	}

	public DHParameterSpec(BigInteger p, BigInteger g, int l)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getP()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getG()
	{
		throw new RuntimeException("Stub!");
	}

	public int getL()
	{
		throw new RuntimeException("Stub!");
	}
}
