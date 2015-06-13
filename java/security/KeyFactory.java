// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyFactory.java

package java.security;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

// Referenced classes of package java.security:
//			NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, KeyFactorySpi, 
//			Provider, PublicKey, PrivateKey, Key

public class KeyFactory
{

	protected KeyFactory(KeyFactorySpi keyFacSpi, Provider provider, String algorithm)
	{
		throw new RuntimeException("Stub!");
	}

	public static KeyFactory getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static KeyFactory getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static KeyFactory getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public final PublicKey generatePublic(KeySpec keySpec)
		throws InvalidKeySpecException
	{
		throw new RuntimeException("Stub!");
	}

	public final PrivateKey generatePrivate(KeySpec keySpec)
		throws InvalidKeySpecException
	{
		throw new RuntimeException("Stub!");
	}

	public final KeySpec getKeySpec(Key key, Class keySpec)
		throws InvalidKeySpecException
	{
		throw new RuntimeException("Stub!");
	}

	public final Key translateKey(Key key)
		throws InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}
}
