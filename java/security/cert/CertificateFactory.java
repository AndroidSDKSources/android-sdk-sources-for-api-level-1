// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CertificateFactory.java

package java.security.cert;

import java.io.InputStream;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.*;

// Referenced classes of package java.security.cert:
//			CertificateException, CRLException, CertificateFactorySpi, Certificate, 
//			CertPath, CRL

public class CertificateFactory
{

	protected CertificateFactory(CertificateFactorySpi certFacSpi, Provider provider, String type)
	{
		throw new RuntimeException("Stub!");
	}

	public static final CertificateFactory getInstance(String type)
		throws CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public static final CertificateFactory getInstance(String type, String provider)
		throws CertificateException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static final CertificateFactory getInstance(String type, Provider provider)
		throws CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public final String getType()
	{
		throw new RuntimeException("Stub!");
	}

	public final Certificate generateCertificate(InputStream inStream)
		throws CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public final Iterator getCertPathEncodings()
	{
		throw new RuntimeException("Stub!");
	}

	public final CertPath generateCertPath(InputStream inStream)
		throws CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public final CertPath generateCertPath(InputStream inStream, String encoding)
		throws CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public final CertPath generateCertPath(List certificates)
		throws CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public final Collection generateCertificates(InputStream inStream)
		throws CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public final CRL generateCRL(InputStream inStream)
		throws CRLException
	{
		throw new RuntimeException("Stub!");
	}

	public final Collection generateCRLs(InputStream inStream)
		throws CRLException
	{
		throw new RuntimeException("Stub!");
	}
}
