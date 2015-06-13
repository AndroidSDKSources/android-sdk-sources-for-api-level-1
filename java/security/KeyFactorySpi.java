// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyFactorySpi.java

package java.security;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

// Referenced classes of package java.security:
//			InvalidKeyException, PublicKey, PrivateKey, Key

public abstract class KeyFactorySpi
{

	public KeyFactorySpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract PublicKey engineGeneratePublic(KeySpec keyspec)
		throws InvalidKeySpecException;

	protected abstract PrivateKey engineGeneratePrivate(KeySpec keyspec)
		throws InvalidKeySpecException;

	protected abstract KeySpec engineGetKeySpec(Key key, Class class1)
		throws InvalidKeySpecException;

	protected abstract Key engineTranslateKey(Key key)
		throws InvalidKeyException;
}
