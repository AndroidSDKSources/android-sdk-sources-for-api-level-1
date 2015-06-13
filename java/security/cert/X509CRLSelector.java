// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   X509CRLSelector.java

package java.security.cert;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package java.security.cert:
//			CRLSelector, X509Certificate, CRL

public class X509CRLSelector
	implements CRLSelector
{

	public X509CRLSelector()
	{
		throw new RuntimeException("Stub!");
	}

	public void setIssuers(Collection issuers)
	{
		throw new RuntimeException("Stub!");
	}

	public void setIssuerNames(Collection names)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void addIssuer(X500Principal issuer)
	{
		throw new RuntimeException("Stub!");
	}

	public void addIssuerName(String iss_name)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void addIssuerName(byte iss_name[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setMinCRLNumber(BigInteger minCRL)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMaxCRLNumber(BigInteger maxCRL)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDateAndTime(Date dateAndTime)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCertificateChecking(X509Certificate cert)
	{
		throw new RuntimeException("Stub!");
	}

	public Collection getIssuers()
	{
		throw new RuntimeException("Stub!");
	}

	public Collection getIssuerNames()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getMinCRL()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getMaxCRL()
	{
		throw new RuntimeException("Stub!");
	}

	public Date getDateAndTime()
	{
		throw new RuntimeException("Stub!");
	}

	public X509Certificate getCertificateChecking()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean match(CRL crl)
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
	{
		throw new RuntimeException("Stub!");
	}
}
