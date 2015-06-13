// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   X509CRL.java

package java.security.cert;

import java.math.BigInteger;
import java.security.*;
import java.util.Date;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package java.security.cert:
//			CRL, X509Extension, CRLException, X509CRLEntry, 
//			X509Certificate

public abstract class X509CRL extends CRL
	implements X509Extension
{

	protected X509CRL()
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object other)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract byte[] getEncoded()
		throws CRLException;

	public abstract void verify(PublicKey publickey)
		throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;

	public abstract void verify(PublicKey publickey, String s)
		throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;

	public abstract int getVersion();

	public abstract Principal getIssuerDN();

	public X500Principal getIssuerX500Principal()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Date getThisUpdate();

	public abstract Date getNextUpdate();

	public abstract X509CRLEntry getRevokedCertificate(BigInteger biginteger);

	public X509CRLEntry getRevokedCertificate(X509Certificate certificate)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Set getRevokedCertificates();

	public abstract byte[] getTBSCertList()
		throws CRLException;

	public abstract byte[] getSignature();

	public abstract String getSigAlgName();

	public abstract String getSigAlgOID();

	public abstract byte[] getSigAlgParams();
}
