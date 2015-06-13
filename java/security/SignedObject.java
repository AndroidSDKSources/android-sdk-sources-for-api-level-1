// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SignedObject.java

package java.security;

import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package java.security:
//			InvalidKeyException, SignatureException, PrivateKey, Signature, 
//			PublicKey

public final class SignedObject
	implements Serializable
{

	public SignedObject(Serializable object, PrivateKey signingKey, Signature signingEngine)
		throws IOException, InvalidKeyException, SignatureException
	{
		throw new RuntimeException("Stub!");
	}

	public Object getObject()
		throws IOException, ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getSignature()
	{
		throw new RuntimeException("Stub!");
	}

	public String getAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean verify(PublicKey verificationKey, Signature verificationEngine)
		throws InvalidKeyException, SignatureException
	{
		throw new RuntimeException("Stub!");
	}
}
