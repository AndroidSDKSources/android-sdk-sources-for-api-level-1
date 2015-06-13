// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ProtectionDomain.java

package java.security;


// Referenced classes of package java.security:
//			CodeSource, PermissionCollection, Principal, Permission

public class ProtectionDomain
{

	public ProtectionDomain(CodeSource cs, PermissionCollection permissions)
	{
		throw new RuntimeException("Stub!");
	}

	public ProtectionDomain(CodeSource cs, PermissionCollection permissions, ClassLoader cl, Principal principals[])
	{
		throw new RuntimeException("Stub!");
	}

	public final ClassLoader getClassLoader()
	{
		throw new RuntimeException("Stub!");
	}

	public final CodeSource getCodeSource()
	{
		throw new RuntimeException("Stub!");
	}

	public final PermissionCollection getPermissions()
	{
		throw new RuntimeException("Stub!");
	}

	public final Principal[] getPrincipals()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean implies(Permission permission)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
