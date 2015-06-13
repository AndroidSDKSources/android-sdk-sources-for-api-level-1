// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DSAParameterSpec.java

package java.security.spec;

import java.math.BigInteger;
import java.security.interfaces.DSAParams;

// Referenced classes of package java.security.spec:
//			AlgorithmParameterSpec

public class DSAParameterSpec
	implements AlgorithmParameterSpec, DSAParams
{

	public DSAParameterSpec(BigInteger p, BigInteger q, BigInteger g)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getG()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getP()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getQ()
	{
		throw new RuntimeException("Stub!");
	}
}
