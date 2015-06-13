// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyManagerFactorySpi.java

package javax.net.ssl;

import java.security.*;

// Referenced classes of package javax.net.ssl:
//			ManagerFactoryParameters, KeyManager

public abstract class KeyManagerFactorySpi
{

	public KeyManagerFactorySpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineInit(KeyStore keystore, char ac[])
		throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException;

	protected abstract void engineInit(ManagerFactoryParameters managerfactoryparameters)
		throws InvalidAlgorithmParameterException;

	protected abstract KeyManager[] engineGetKeyManagers();
}
