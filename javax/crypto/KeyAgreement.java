// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyAgreement.java

package javax.crypto;

import java.security.*;
import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package javax.crypto:
//			ShortBufferException, KeyAgreementSpi, SecretKey

public class KeyAgreement
{

	protected KeyAgreement(KeyAgreementSpi keyAgreeSpi, Provider provider, String algorithm)
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

	public static final KeyAgreement getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static final KeyAgreement getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static final KeyAgreement getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(Key key)
		throws InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(Key key, SecureRandom random)
		throws InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(Key key, AlgorithmParameterSpec params)
		throws InvalidKeyException, InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(Key key, AlgorithmParameterSpec params, SecureRandom random)
		throws InvalidKeyException, InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public final Key doPhase(Key key, boolean lastPhase)
		throws InvalidKeyException, IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public final byte[] generateSecret()
		throws IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public final int generateSecret(byte sharedSecret[], int offset)
		throws IllegalStateException, ShortBufferException
	{
		throw new RuntimeException("Stub!");
	}

	public final SecretKey generateSecret(String algorithm)
		throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}
}
