// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SignatureSpi.java

package java.security;

import java.nio.ByteBuffer;
import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package java.security:
//			InvalidKeyException, SignatureException, InvalidParameterException, InvalidAlgorithmParameterException, 
//			SecureRandom, PublicKey, PrivateKey, AlgorithmParameters

public abstract class SignatureSpi
{

	protected SecureRandom appRandom;

	public SignatureSpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineInitVerify(PublicKey publickey)
		throws InvalidKeyException;

	protected abstract void engineInitSign(PrivateKey privatekey)
		throws InvalidKeyException;

	protected void engineInitSign(PrivateKey privateKey, SecureRandom random)
		throws InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineUpdate(byte byte0)
		throws SignatureException;

	protected abstract void engineUpdate(byte abyte0[], int i, int j)
		throws SignatureException;

	protected void engineUpdate(ByteBuffer input)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract byte[] engineSign()
		throws SignatureException;

	protected int engineSign(byte outbuf[], int offset, int len)
		throws SignatureException
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract boolean engineVerify(byte abyte0[])
		throws SignatureException;

	protected boolean engineVerify(byte sigBytes[], int offset, int length)
		throws SignatureException
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineSetParameter(String s, Object obj)
		throws InvalidParameterException;

	protected void engineSetParameter(AlgorithmParameterSpec params)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	protected AlgorithmParameters engineGetParameters()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract Object engineGetParameter(String s)
		throws InvalidParameterException;

	public Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}
}
