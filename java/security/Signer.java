// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Signer.java

package java.security;


// Referenced classes of package java.security:
//			Identity, KeyManagementException, InvalidParameterException, KeyException, 
//			IdentityScope, PrivateKey, KeyPair

public abstract class Signer extends Identity
{

	protected Signer()
	{
		throw new RuntimeException("Stub!");
	}

	public Signer(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public Signer(String name, IdentityScope scope)
		throws KeyManagementException
	{
		throw new RuntimeException("Stub!");
	}

	public PrivateKey getPrivateKey()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setKeyPair(KeyPair pair)
		throws InvalidParameterException, KeyException
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
