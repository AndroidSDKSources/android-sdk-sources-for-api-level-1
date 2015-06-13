// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ExemptionMechanism.java

package javax.crypto;

import java.security.*;
import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package javax.crypto:
//			ExemptionMechanismException, ShortBufferException, ExemptionMechanismSpi

public class ExemptionMechanism
{

	protected ExemptionMechanism(ExemptionMechanismSpi exmechSpi, Provider provider, String mechanism)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public static final ExemptionMechanism getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static final ExemptionMechanism getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static final ExemptionMechanism getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isCryptoAllowed(Key key)
		throws ExemptionMechanismException
	{
		throw new RuntimeException("Stub!");
	}

	public final int getOutputSize(int inputLen)
		throws IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(Key key)
		throws InvalidKeyException, ExemptionMechanismException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(Key key, AlgorithmParameters param)
		throws InvalidKeyException, InvalidAlgorithmParameterException, ExemptionMechanismException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(Key key, AlgorithmParameterSpec param)
		throws InvalidKeyException, InvalidAlgorithmParameterException, ExemptionMechanismException
	{
		throw new RuntimeException("Stub!");
	}

	public final byte[] genExemptionBlob()
		throws IllegalStateException, ExemptionMechanismException
	{
		throw new RuntimeException("Stub!");
	}

	public final int genExemptionBlob(byte output[])
		throws IllegalStateException, ShortBufferException, ExemptionMechanismException
	{
		throw new RuntimeException("Stub!");
	}

	public final int genExemptionBlob(byte output[], int outputOffset)
		throws IllegalStateException, ShortBufferException, ExemptionMechanismException
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}
}
