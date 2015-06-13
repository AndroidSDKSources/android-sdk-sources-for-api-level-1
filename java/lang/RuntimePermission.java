// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RuntimePermission.java

package java.lang;

import java.security.BasicPermission;

// Referenced classes of package java.lang:
//			String, RuntimeException

public final class RuntimePermission extends BasicPermission
{

	public RuntimePermission(String permissionName)
	{
		super((String)null, (String)null);
		throw new RuntimeException("Stub!");
	}

	public RuntimePermission(String name, String actions)
	{
		super((String)null, (String)null);
		throw new RuntimeException("Stub!");
	}
}
