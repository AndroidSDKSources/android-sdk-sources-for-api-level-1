// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CertPathBuilder.java

package java.security.cert;

import java.security.*;

// Referenced classes of package java.security.cert:
//			CertPathBuilderException, CertPathBuilderSpi, CertPathParameters, CertPathBuilderResult

public class CertPathBuilder
{

	protected CertPathBuilder(CertPathBuilderSpi builderSpi, Provider provider, String algorithm)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public static CertPathBuilder getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static CertPathBuilder getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static CertPathBuilder getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final CertPathBuilderResult build(CertPathParameters params)
		throws CertPathBuilderException, InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public static final String getDefaultType()
	{
		throw new RuntimeException("Stub!");
	}
}
