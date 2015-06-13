// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyGenerator.java

package javax.crypto;

import java.security.*;
import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package javax.crypto:
//			KeyGeneratorSpi, SecretKey

public class KeyGenerator
{

	protected KeyGenerator(KeyGeneratorSpi keyGenSpi, Provider provider, String algorithm)
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

	public static final KeyGenerator getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static final KeyGenerator getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static final KeyGenerator getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final SecretKey generateKey()
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(AlgorithmParameterSpec params)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(AlgorithmParameterSpec params, SecureRandom random)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(int keysize)
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(int keysize, SecureRandom random)
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(SecureRandom random)
	{
		throw new RuntimeException("Stub!");
	}
}
