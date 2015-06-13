// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SecretKeyFactorySpi.java

package javax.crypto;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

// Referenced classes of package javax.crypto:
//			SecretKey

public abstract class SecretKeyFactorySpi
{

	public SecretKeyFactorySpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract SecretKey engineGenerateSecret(KeySpec keyspec)
		throws InvalidKeySpecException;

	protected abstract KeySpec engineGetKeySpec(SecretKey secretkey, Class class1)
		throws InvalidKeySpecException;

	protected abstract SecretKey engineTranslateKey(SecretKey secretkey)
		throws InvalidKeyException;
}
