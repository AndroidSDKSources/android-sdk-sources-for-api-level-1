// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TrustManagerFactory.java

package javax.net.ssl;

import java.security.*;

// Referenced classes of package javax.net.ssl:
//			TrustManagerFactorySpi, ManagerFactoryParameters, TrustManager

public class TrustManagerFactory
{

	protected TrustManagerFactory(TrustManagerFactorySpi factorySpi, Provider provider, String algorithm)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public static final TrustManagerFactory getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static final TrustManagerFactory getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static final TrustManagerFactory getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(KeyStore ks)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(ManagerFactoryParameters spec)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public final TrustManager[] getTrustManagers()
	{
		throw new RuntimeException("Stub!");
	}

	public static final String getDefaultAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}
}
