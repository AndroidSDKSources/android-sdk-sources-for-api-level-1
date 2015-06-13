// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   X509Certificate.java

package javax.security.cert;

import java.io.InputStream;
import java.math.BigInteger;
import java.security.Principal;
import java.util.Date;

// Referenced classes of package javax.security.cert:
//			Certificate, CertificateException, CertificateExpiredException, CertificateNotYetValidException

public abstract class X509Certificate extends Certificate
{

	public X509Certificate()
	{
		throw new RuntimeException("Stub!");
	}

	public static final X509Certificate getInstance(InputStream inStream)
		throws CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public static final X509Certificate getInstance(byte certData[])
		throws CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void checkValidity()
		throws CertificateExpiredException, CertificateNotYetValidException;

	public abstract void checkValidity(Date date)
		throws CertificateExpiredException, CertificateNotYetValidException;

	public abstract int getVersion();

	public abstract BigInteger getSerialNumber();

	public abstract Principal getIssuerDN();

	public abstract Principal getSubjectDN();

	public abstract Date getNotBefore();

	public abstract Date getNotAfter();

	public abstract String getSigAlgName();

	public abstract String getSigAlgOID();

	public abstract byte[] getSigAlgParams();
}
