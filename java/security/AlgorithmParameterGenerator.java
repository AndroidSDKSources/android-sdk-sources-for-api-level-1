// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AlgorithmParameterGenerator.java

package java.security;

import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package java.security:
//			NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, AlgorithmParameterGeneratorSpi, 
//			Provider, SecureRandom, AlgorithmParameters

public class AlgorithmParameterGenerator
{

	protected AlgorithmParameterGenerator(AlgorithmParameterGeneratorSpi paramGenSpi, Provider provider, String algorithm)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public static AlgorithmParameterGenerator getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static AlgorithmParameterGenerator getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static AlgorithmParameterGenerator getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(int size)
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(int size, SecureRandom random)
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(AlgorithmParameterSpec genParamSpec)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(AlgorithmParameterSpec genParamSpec, SecureRandom random)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public final AlgorithmParameters generateParameters()
	{
		throw new RuntimeException("Stub!");
	}
}
