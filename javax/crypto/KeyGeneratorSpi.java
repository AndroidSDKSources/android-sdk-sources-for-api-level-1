// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyGeneratorSpi.java

package javax.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package javax.crypto:
//			SecretKey

public abstract class KeyGeneratorSpi
{

	public KeyGeneratorSpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract SecretKey engineGenerateKey();

	protected abstract void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
		throws InvalidAlgorithmParameterException;

	protected abstract void engineInit(int i, SecureRandom securerandom);

	protected abstract void engineInit(SecureRandom securerandom);
}
