// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyAgreementSpi.java

package javax.crypto;

import java.security.*;
import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package javax.crypto:
//			ShortBufferException, SecretKey

public abstract class KeyAgreementSpi
{

	public KeyAgreementSpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract Key engineDoPhase(Key key, boolean flag)
		throws InvalidKeyException, IllegalStateException;

	protected abstract byte[] engineGenerateSecret()
		throws IllegalStateException;

	protected abstract int engineGenerateSecret(byte abyte0[], int i)
		throws IllegalStateException, ShortBufferException;

	protected abstract SecretKey engineGenerateSecret(String s)
		throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException;

	protected abstract void engineInit(Key key, SecureRandom securerandom)
		throws InvalidKeyException;

	protected abstract void engineInit(Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
		throws InvalidKeyException, InvalidAlgorithmParameterException;
}
