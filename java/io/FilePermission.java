// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FilePermission.java

package java.io;

import java.security.Permission;
import java.security.PermissionCollection;

// Referenced classes of package java.io:
//			Serializable

public final class FilePermission extends Permission
	implements Serializable
{

	public FilePermission(String path, String actions)
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}

	public String getActions()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
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

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}
}
