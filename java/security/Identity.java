// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Identity.java

package java.security;

import java.io.Serializable;

// Referenced classes of package java.security:
//			Principal, KeyManagementException, IdentityScope, Certificate, 
//			PublicKey

public abstract class Identity
	implements Principal, Serializable
{

	protected Identity()
	{
		throw new RuntimeException("Stub!");
	}

	public Identity(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public Identity(String name, IdentityScope scope)
		throws KeyManagementException
	{
		throw new RuntimeException("Stub!");
	}

	public void addCertificate(Certificate certificate)
		throws KeyManagementException
	{
		throw new RuntimeException("Stub!");
	}

	public void removeCertificate(Certificate certificate)
		throws KeyManagementException
	{
		throw new RuntimeException("Stub!");
	}

	public Certificate[] certificates()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean identityEquals(Identity identity)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString(boolean detailed)
	{
		throw new RuntimeException("Stub!");
	}

	public final IdentityScope getScope()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPublicKey(PublicKey key)
		throws KeyManagementException
	{
		throw new RuntimeException("Stub!");
	}

	public PublicKey getPublicKey()
	{
		throw new RuntimeException("Stub!");
	}

	public void setInfo(String info)
	{
		throw new RuntimeException("Stub!");
	}

	public String getInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
