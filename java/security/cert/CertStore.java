// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CertStore.java

package java.security.cert;

import java.security.*;
import java.util.Collection;

// Referenced classes of package java.security.cert:
//			CertStoreException, CertStoreSpi, CertStoreParameters, CertSelector, 
//			CRLSelector

public class CertStore
{

	protected CertStore(CertStoreSpi storeSpi, Provider provider, String type, CertStoreParameters params)
	{
		throw new RuntimeException("Stub!");
	}

	public static CertStore getInstance(String type, CertStoreParameters params)
		throws InvalidAlgorithmParameterException, NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static CertStore getInstance(String type, CertStoreParameters params, String provider)
		throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static CertStore getInstance(String type, CertStoreParameters params, Provider provider)
		throws NoSuchAlgorithmException, InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public final String getType()
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public final CertStoreParameters getCertStoreParameters()
	{
		throw new RuntimeException("Stub!");
	}

	public final Collection getCertificates(CertSelector selector)
		throws CertStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final Collection getCRLs(CRLSelector selector)
		throws CertStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public static final String getDefaultType()
	{
		throw new RuntimeException("Stub!");
	}
}
