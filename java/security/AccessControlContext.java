// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AccessControlContext.java

package java.security;


// Referenced classes of package java.security:
//			AccessControlException, DomainCombiner, ProtectionDomain, Permission

public final class AccessControlContext
{

	public AccessControlContext(AccessControlContext acc, DomainCombiner combiner)
	{
		throw new RuntimeException("Stub!");
	}

	public AccessControlContext(ProtectionDomain context[])
	{
		throw new RuntimeException("Stub!");
	}

	public void checkPermission(Permission perm)
		throws AccessControlException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public DomainCombiner getDomainCombiner()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}
}
