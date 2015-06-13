// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Policy.java

package java.security;


// Referenced classes of package java.security:
//			CodeSource, PermissionCollection, ProtectionDomain, Permission

public abstract class Policy
{

	public Policy()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract PermissionCollection getPermissions(CodeSource codesource);

	public abstract void refresh();

	public PermissionCollection getPermissions(ProtectionDomain domain)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean implies(ProtectionDomain domain, Permission permission)
	{
		throw new RuntimeException("Stub!");
	}

	public static Policy getPolicy()
	{
		throw new RuntimeException("Stub!");
	}

	public static void setPolicy(Policy policy)
	{
		throw new RuntimeException("Stub!");
	}
}
