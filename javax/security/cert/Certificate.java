// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Certificate.java

package javax.security.cert;

import java.security.*;

// Referenced classes of package javax.security.cert:
//			CertificateEncodingException, CertificateException

public abstract class Certificate
{

	public Certificate()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract byte[] getEncoded()
		throws CertificateEncodingException;

	public abstract void verify(PublicKey publickey)
		throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;

	public abstract void verify(PublicKey publickey, String s)
		throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;

	public abstract String toString();

	public abstract PublicKey getPublicKey();
}
