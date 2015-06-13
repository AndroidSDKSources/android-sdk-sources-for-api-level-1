// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AccessControlException.java

package java.security;


// Referenced classes of package java.security:
//			Permission

public class AccessControlException extends SecurityException
{

	public AccessControlException(String message)
	{
		throw new RuntimeException("Stub!");
	}

	public AccessControlException(String message, Permission perm)
	{
		throw new RuntimeException("Stub!");
	}

	public Permission getPermission()
	{
		throw new RuntimeException("Stub!");
	}
}
