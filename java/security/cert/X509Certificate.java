// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   X509Certificate.java

package java.security.cert;

import java.math.BigInteger;
import java.security.Principal;
import java.util.*;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package java.security.cert:
//			Certificate, X509Extension, CertificateExpiredException, CertificateNotYetValidException, 
//			CertificateEncodingException, CertificateParsingException

public abstract class X509Certificate extends Certificate
	implements X509Extension
{

	protected X509Certificate()
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}

	public abstract void checkValidity()
		throws CertificateExpiredException, CertificateNotYetValidException;

	public abstract void checkValidity(Date date)
		throws CertificateExpiredException, CertificateNotYetValidException;

	public abstract int getVersion();

	public abstract BigInteger getSerialNumber();

	public abstract Principal getIssuerDN();

	public X500Principal getIssuerX500Principal()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Principal getSubjectDN();

	public X500Principal getSubjectX500Principal()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Date getNotBefore();

	public abstract Date getNotAfter();

	public abstract byte[] getTBSCertificate()
		throws CertificateEncodingException;

	public abstract byte[] getSignature();

	public abstract String getSigAlgName();

	public abstract String getSigAlgOID();

	public abstract byte[] getSigAlgParams();

	public abstract boolean[] getIssuerUniqueID();

	public abstract boolean[] getSubjectUniqueID();

	public abstract boolean[] getKeyUsage();

	public List getExtendedKeyUsage()
		throws CertificateParsingException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int getBasicConstraints();

	public Collection getSubjectAlternativeNames()
		throws CertificateParsingException
	{
		throw new RuntimeException("Stub!");
	}

	public Collection getIssuerAlternativeNames()
		throws CertificateParsingException
	{
		throw new RuntimeException("Stub!");
	}
}
