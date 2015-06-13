// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ECPrivateKeySpec.java

package java.security.spec;

import java.math.BigInteger;

// Referenced classes of package java.security.spec:
//			KeySpec, ECParameterSpec

public class ECPrivateKeySpec
	implements KeySpec
{

	public ECPrivateKeySpec(BigInteger s, ECParameterSpec params)
	{
		throw new RuntimeException("Stub!");
	}

	public ECParameterSpec getParams()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getS()
	{
		throw new RuntimeException("Stub!");
	}
}
