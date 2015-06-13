// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   UnresolvedPermission.java

package java.security;

import java.io.Serializable;
import java.security.cert.Certificate;

// Referenced classes of package java.security:
//			Permission, PermissionCollection

public final class UnresolvedPermission extends Permission
	implements Serializable
{

	public UnresolvedPermission(String type, String name, String actions, Certificate certs[])
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

	public String getUnresolvedName()
	{
		throw new RuntimeException("Stub!");
	}

	public String getUnresolvedActions()
	{
		throw new RuntimeException("Stub!");
	}

	public String getUnresolvedType()
	{
		throw new RuntimeException("Stub!");
	}

	public Certificate[] getUnresolvedCerts()
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

	public PermissionCollection newPermissionCollection()
	{
		throw new RuntimeException("Stub!");
	}
}
