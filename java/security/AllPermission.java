// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AllPermission.java

package java.security;


// Referenced classes of package java.security:
//			Permission, PermissionCollection

public final class AllPermission extends Permission
{

	public AllPermission(String name, String actions)
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}

	public AllPermission()
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public String getActions()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean implies(Permission permission)
	{
		throw new RuntimeException("Stub!");
	}

	public PermissionCollection newPermissionCollection()
	{
		throw new RuntimeException("Stub!");
	}
}
