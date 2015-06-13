// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AlgorithmParameterGeneratorSpi.java

package java.security;

import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package java.security:
//			InvalidAlgorithmParameterException, SecureRandom, AlgorithmParameters

public abstract class AlgorithmParameterGeneratorSpi
{

	public AlgorithmParameterGeneratorSpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineInit(int i, SecureRandom securerandom);

	protected abstract void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
		throws InvalidAlgorithmParameterException;

	protected abstract AlgorithmParameters engineGenerateParameters();
}
