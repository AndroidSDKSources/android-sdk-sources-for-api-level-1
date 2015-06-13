// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Certificate.java

package java.security.cert;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.security.*;

// Referenced classes of package java.security.cert:
//			CertificateEncodingException, CertificateException

public abstract class Certificate
	implements Serializable
{

	protected Certificate(String type)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getType()
	{
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
		throws CertificateEncodingException;

	public abstract void verify(PublicKey publickey)
		throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;

	public abstract void verify(PublicKey publickey, String s)
		throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;

	public abstract String toString();

	public abstract PublicKey getPublicKey();

	protected Object writeReplace()
		throws ObjectStreamException
	{
		throw new RuntimeException("Stub!");
	}
}
