// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyManagerFactory.java

package javax.net.ssl;

import java.security.*;

// Referenced classes of package javax.net.ssl:
//			KeyManagerFactorySpi, ManagerFactoryParameters, KeyManager

public class KeyManagerFactory
{

	protected KeyManagerFactory(KeyManagerFactorySpi factorySpi, Provider provider, String algorithm)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public static final KeyManagerFactory getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static final KeyManagerFactory getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static final KeyManagerFactory getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(KeyStore ks, char password[])
		throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(ManagerFactoryParameters spec)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public final KeyManager[] getKeyManagers()
	{
		throw new RuntimeException("Stub!");
	}

	public static final String getDefaultAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}
}
