// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CertificateFactorySpi.java

package java.security.cert;

import java.io.InputStream;
import java.util.*;

// Referenced classes of package java.security.cert:
//			CertificateException, CRLException, Certificate, CRL, 
//			CertPath

public abstract class CertificateFactorySpi
{

	public CertificateFactorySpi()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Certificate engineGenerateCertificate(InputStream inputstream)
		throws CertificateException;

	public abstract Collection engineGenerateCertificates(InputStream inputstream)
		throws CertificateException;

	public abstract CRL engineGenerateCRL(InputStream inputstream)
		throws CRLException;

	public abstract Collection engineGenerateCRLs(InputStream inputstream)
		throws CRLException;

	public CertPath engineGenerateCertPath(InputStream inStream)
		throws CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public CertPath engineGenerateCertPath(InputStream inStream, String encoding)
		throws CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public CertPath engineGenerateCertPath(List certificates)
		throws CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public Iterator engineGetCertPathEncodings()
	{
		throw new RuntimeException("Stub!");
	}
}
