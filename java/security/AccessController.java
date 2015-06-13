// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AccessController.java

package java.security;


// Referenced classes of package java.security:
//			PrivilegedActionException, AccessControlException, PrivilegedAction, AccessControlContext, 
//			PrivilegedExceptionAction, Permission

public final class AccessController
{

	AccessController()
	{
		throw new RuntimeException("Stub!");
	}

	public static Object doPrivileged(PrivilegedAction action)
	{
		throw new RuntimeException("Stub!");
	}

	public static Object doPrivileged(PrivilegedAction action, AccessControlContext context)
	{
		throw new RuntimeException("Stub!");
	}

	public static Object doPrivileged(PrivilegedExceptionAction action)
		throws PrivilegedActionException
	{
		throw new RuntimeException("Stub!");
	}

	public static Object doPrivileged(PrivilegedExceptionAction action, AccessControlContext context)
		throws PrivilegedActionException
	{
		throw new RuntimeException("Stub!");
	}

	public static void checkPermission(Permission perm)
		throws AccessControlException
	{
		throw new RuntimeException("Stub!");
	}

	public static AccessControlContext getContext()
	{
		throw new RuntimeException("Stub!");
	}
}
