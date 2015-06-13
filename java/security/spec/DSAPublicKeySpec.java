// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DSAPublicKeySpec.java

package java.security.spec;

import java.math.BigInteger;

// Referenced classes of package java.security.spec:
//			KeySpec

public class DSAPublicKeySpec
	implements KeySpec
{

	public DSAPublicKeySpec(BigInteger y, BigInteger p, BigInteger q, BigInteger g)
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

	public BigInteger getY()
	{
		throw new RuntimeException("Stub!");
	}
}
