// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Subject.java

package javax.security.auth;

import java.io.Serializable;
import java.security.*;
import java.util.Set;

public final class Subject
	implements Serializable
{

	public Subject()
	{
		throw new RuntimeException("Stub!");
	}

	public Subject(boolean readOnly, Set subjPrincipals, Set pubCredentials, Set privCredentials)
	{
		throw new RuntimeException("Stub!");
	}

	public static Object doAs(Subject subject, PrivilegedAction action)
	{
		throw new RuntimeException("Stub!");
	}

	public static Object doAsPrivileged(Subject subject, PrivilegedAction action, AccessControlContext context)
	{
		throw new RuntimeException("Stub!");
	}

	public static Object doAs(Subject subject, PrivilegedExceptionAction action)
		throws PrivilegedActionException
	{
		throw new RuntimeException("Stub!");
	}

	public static Object doAsPrivileged(Subject subject, PrivilegedExceptionAction action, AccessControlContext context)
		throws PrivilegedActionException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public Set getPrincipals()
	{
		throw new RuntimeException("Stub!");
	}

	public Set getPrincipals(Class c)
	{
		throw new RuntimeException("Stub!");
	}

	public Set getPrivateCredentials()
	{
		throw new RuntimeException("Stub!");
	}

	public Set getPrivateCredentials(Class c)
	{
		throw new RuntimeException("Stub!");
	}

	public Set getPublicCredentials()
	{
		throw new RuntimeException("Stub!");
	}

	public Set getPublicCredentials(Class c)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public void setReadOnly()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isReadOnly()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public static Subject getSubject(AccessControlContext context)
	{
		throw new RuntimeException("Stub!");
	}
}
