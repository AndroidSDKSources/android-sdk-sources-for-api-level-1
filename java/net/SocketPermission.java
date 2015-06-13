// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SocketPermission.java

package java.net;

import java.io.Serializable;
import java.security.Permission;
import java.security.PermissionCollection;

public final class SocketPermission extends Permission
	implements Serializable
{

	public SocketPermission(String host, String action)
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object o)
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

	public boolean implies(Permission p)
	{
		throw new RuntimeException("Stub!");
	}

	public PermissionCollection newPermissionCollection()
	{
		throw new RuntimeException("Stub!");
	}
}
