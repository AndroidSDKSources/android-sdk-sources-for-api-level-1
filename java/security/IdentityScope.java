// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IdentityScope.java

package java.security;

import java.util.Enumeration;

// Referenced classes of package java.security:
//			Identity, KeyManagementException, Principal, PublicKey

public abstract class IdentityScope extends Identity
{

	protected IdentityScope()
	{
		throw new RuntimeException("Stub!");
	}

	public IdentityScope(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public IdentityScope(String name, IdentityScope scope)
		throws KeyManagementException
	{
		throw new RuntimeException("Stub!");
	}

	public static IdentityScope getSystemScope()
	{
		throw new RuntimeException("Stub!");
	}

	protected static void setSystemScope(IdentityScope scope)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int size();

	public abstract Identity getIdentity(String s);

	public Identity getIdentity(Principal principal)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Identity getIdentity(PublicKey publickey);

	public abstract void addIdentity(Identity identity)
		throws KeyManagementException;

	public abstract void removeIdentity(Identity identity)
		throws KeyManagementException;

	public abstract Enumeration identities();

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
