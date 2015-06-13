// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RSAPrivateKeySpec.java

package java.security.spec;

import java.math.BigInteger;

// Referenced classes of package java.security.spec:
//			KeySpec

public class RSAPrivateKeySpec
	implements KeySpec
{

	public RSAPrivateKeySpec(BigInteger modulus, BigInteger privateExponent)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getModulus()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPrivateExponent()
	{
		throw new RuntimeException("Stub!");
	}
}
