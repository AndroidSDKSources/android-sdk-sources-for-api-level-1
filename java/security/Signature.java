// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Signature.java

package java.security;

import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package java.security:
//			SignatureSpi, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, 
//			SignatureException, InvalidParameterException, InvalidAlgorithmParameterException, Provider, 
//			PublicKey, PrivateKey, SecureRandom, AlgorithmParameters

public abstract class Signature extends SignatureSpi
{

	protected static final int UNINITIALIZED = 0;
	protected static final int SIGN = 2;
	protected static final int VERIFY = 3;
	protected int state;

	protected Signature(String algorithm)
	{
		throw new RuntimeException("Stub!");
	}

	public static Signature getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static Signature getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static Signature getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public final void initVerify(PublicKey publicKey)
		throws InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public final void initVerify(Certificate certificate)
		throws InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public final void initSign(PrivateKey privateKey)
		throws InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public final void initSign(PrivateKey privateKey, SecureRandom random)
		throws InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public final byte[] sign()
		throws SignatureException
	{
		throw new RuntimeException("Stub!");
	}

	public final int sign(byte outbuf[], int offset, int len)
		throws SignatureException
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean verify(byte signature[])
		throws SignatureException
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean verify(byte signature[], int offset, int length)
		throws SignatureException
	{
		throw new RuntimeException("Stub!");
	}

	public final void update(byte b)
		throws SignatureException
	{
		throw new RuntimeException("Stub!");
	}

	public final void update(byte data[])
		throws SignatureException
	{
		throw new RuntimeException("Stub!");
	}

	public final void update(byte data[], int off, int len)
		throws SignatureException
	{
		throw new RuntimeException("Stub!");
	}

	public final void update(ByteBuffer data)
		throws SignatureException
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setParameter(String param, Object value)
		throws InvalidParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public final void setParameter(AlgorithmParameterSpec params)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public final AlgorithmParameters getParameters()
	{
		throw new RuntimeException("Stub!");
	}

	public final Object getParameter(String param)
		throws InvalidParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}
}
