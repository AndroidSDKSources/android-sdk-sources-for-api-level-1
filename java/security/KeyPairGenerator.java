// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyPairGenerator.java

package java.security;

import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package java.security:
//			KeyPairGeneratorSpi, NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, 
//			Provider, KeyPair, SecureRandom

public abstract class KeyPairGenerator extends KeyPairGeneratorSpi
{

	protected KeyPairGenerator(String algorithm)
	{
		throw new RuntimeException("Stub!");
	}

	public String getAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public static KeyPairGenerator getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static KeyPairGenerator getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static KeyPairGenerator getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public void initialize(int keysize)
	{
		throw new RuntimeException("Stub!");
	}

	public void initialize(AlgorithmParameterSpec param)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public final KeyPair genKeyPair()
	{
		throw new RuntimeException("Stub!");
	}

	public KeyPair generateKeyPair()
	{
		throw new RuntimeException("Stub!");
	}

	public void initialize(int keysize, SecureRandom random)
	{
		throw new RuntimeException("Stub!");
	}

	public void initialize(AlgorithmParameterSpec param, SecureRandom random)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}
}
