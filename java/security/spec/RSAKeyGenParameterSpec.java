// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RSAKeyGenParameterSpec.java

package java.security.spec;

import java.math.BigInteger;

// Referenced classes of package java.security.spec:
//			AlgorithmParameterSpec

public class RSAKeyGenParameterSpec
	implements AlgorithmParameterSpec
{

	public static final BigInteger F0 = null;
	public static final BigInteger F4 = null;

	public RSAKeyGenParameterSpec(int keysize, BigInteger publicExponent)
	{
		throw new RuntimeException("Stub!");
	}

	public int getKeysize()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getPublicExponent()
	{
		throw new RuntimeException("Stub!");
	}

}
