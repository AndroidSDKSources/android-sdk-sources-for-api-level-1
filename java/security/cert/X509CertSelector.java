// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   X509CertSelector.java

package java.security.cert;

import java.io.IOException;
import java.math.BigInteger;
import java.security.PublicKey;
import java.util.*;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package java.security.cert:
//			CertSelector, X509Certificate, Certificate

public class X509CertSelector
	implements CertSelector
{

	public X509CertSelector()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCertificate(X509Certificate certificate)
	{
		throw new RuntimeException("Stub!");
	}

	public X509Certificate getCertificate()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSerialNumber(BigInteger serialNumber)
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger getSerialNumber()
	{
		throw new RuntimeException("Stub!");
	}

	public void setIssuer(X500Principal issuer)
	{
		throw new RuntimeException("Stub!");
	}

	public X500Principal getIssuer()
	{
		throw new RuntimeException("Stub!");
	}

	public void setIssuer(String issuerName)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String getIssuerAsString()
	{
		throw new RuntimeException("Stub!");
	}

	public void setIssuer(byte issuerDN[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getIssuerAsBytes()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setSubject(X500Principal subject)
	{
		throw new RuntimeException("Stub!");
	}

	public X500Principal getSubject()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSubject(String subjectDN)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String getSubjectAsString()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSubject(byte subjectDN[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getSubjectAsBytes()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setSubjectKeyIdentifier(byte subjectKeyIdentifier[])
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getSubjectKeyIdentifier()
	{
		throw new RuntimeException("Stub!");
	}

	public void setAuthorityKeyIdentifier(byte authorityKeyIdentifier[])
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getAuthorityKeyIdentifier()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCertificateValid(Date certificateValid)
	{
		throw new RuntimeException("Stub!");
	}

	public Date getCertificateValid()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPrivateKeyValid(Date privateKeyValid)
	{
		throw new RuntimeException("Stub!");
	}

	public Date getPrivateKeyValid()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSubjectPublicKeyAlgID(String oid)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String getSubjectPublicKeyAlgID()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSubjectPublicKey(PublicKey key)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSubjectPublicKey(byte key[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public PublicKey getSubjectPublicKey()
	{
		throw new RuntimeException("Stub!");
	}

	public void setKeyUsage(boolean keyUsage[])
	{
		throw new RuntimeException("Stub!");
	}

	public boolean[] getKeyUsage()
	{
		throw new RuntimeException("Stub!");
	}

	public void setExtendedKeyUsage(Set keyUsage)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Set getExtendedKeyUsage()
	{
		throw new RuntimeException("Stub!");
	}

	public void setMatchAllSubjectAltNames(boolean matchAllNames)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getMatchAllSubjectAltNames()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSubjectAlternativeNames(Collection names)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void addSubjectAlternativeName(int tag, String name)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void addSubjectAlternativeName(int tag, byte name[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Collection getSubjectAlternativeNames()
	{
		throw new RuntimeException("Stub!");
	}

	public void setNameConstraints(byte bytes[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getNameConstraints()
	{
		throw new RuntimeException("Stub!");
	}

	public void setBasicConstraints(int pathLen)
	{
		throw new RuntimeException("Stub!");
	}

	public int getBasicConstraints()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPolicy(Set policies)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Set getPolicy()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPathToNames(Collection names)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void addPathToName(int type, String name)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void addPathToName(int type, byte name[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Collection getPathToNames()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean match(Certificate certificate)
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
	{
		throw new RuntimeException("Stub!");
	}
}
