// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SecretKeyFactory.java

package javax.crypto;

import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

// Referenced classes of package javax.crypto:
//			SecretKeyFactorySpi, SecretKey

public class SecretKeyFactory
{

	protected SecretKeyFactory(SecretKeyFactorySpi keyFacSpi, Provider provider, String algorithm)
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

	public static final SecretKeyFactory getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static final SecretKeyFactory getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static final SecretKeyFactory getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final SecretKey generateSecret(KeySpec keySpec)
		throws InvalidKeySpecException
	{
		throw new RuntimeException("Stub!");
	}

	public final KeySpec getKeySpec(SecretKey key, Class keySpec)
		throws InvalidKeySpecException
	{
		throw new RuntimeException("Stub!");
	}

	public final SecretKey translateKey(SecretKey key)
		throws InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}
}
