// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyPairGeneratorSpi.java

package java.security;

import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package java.security:
//			InvalidAlgorithmParameterException, KeyPair, SecureRandom

public abstract class KeyPairGeneratorSpi
{

	public KeyPairGeneratorSpi()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract KeyPair generateKeyPair();

	public abstract void initialize(int i, SecureRandom securerandom);

	public void initialize(AlgorithmParameterSpec params, SecureRandom random)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}
}
