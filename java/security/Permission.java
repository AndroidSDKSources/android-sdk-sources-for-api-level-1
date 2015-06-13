// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Permission.java

package java.security;

import java.io.Serializable;

// Referenced classes of package java.security:
//			Guard, PermissionCollection

public abstract class Permission
	implements Guard, Serializable
{

	public Permission(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean equals(Object obj);

	public abstract int hashCode();

	public abstract String getActions();

	public abstract boolean implies(Permission permission);

	public final String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public void checkGuard(Object obj)
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public PermissionCollection newPermissionCollection()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
