// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ExemptionMechanismSpi.java

package javax.crypto;

import java.security.*;
import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package javax.crypto:
//			ExemptionMechanismException, ShortBufferException

public abstract class ExemptionMechanismSpi
{

	public ExemptionMechanismSpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract byte[] engineGenExemptionBlob()
		throws ExemptionMechanismException;

	protected abstract int engineGenExemptionBlob(byte abyte0[], int i)
		throws ShortBufferException, ExemptionMechanismException;

	protected abstract int engineGetOutputSize(int i);

	protected abstract void engineInit(Key key)
		throws InvalidKeyException, ExemptionMechanismException;

	protected abstract void engineInit(Key key, AlgorithmParameters algorithmparameters)
		throws InvalidKeyException, InvalidAlgorithmParameterException, ExemptionMechanismException;

	protected abstract void engineInit(Key key, AlgorithmParameterSpec algorithmparameterspec)
		throws InvalidKeyException, InvalidAlgorithmParameterException, ExemptionMechanismException;
}
