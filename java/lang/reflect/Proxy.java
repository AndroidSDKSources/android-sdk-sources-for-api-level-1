// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Proxy.java

package java.lang.reflect;

import java.io.Serializable;

// Referenced classes of package java.lang.reflect:
//			InvocationHandler

public class Proxy
	implements Serializable
{

	protected InvocationHandler h;

	protected Proxy(InvocationHandler h)
	{
		throw new RuntimeException("Stub!");
	}

	public static transient Class getProxyClass(ClassLoader loader, Class interfaces[])
		throws IllegalArgumentException
	{
		throw new RuntimeException("Stub!");
	}

	public static Object newProxyInstance(ClassLoader loader, Class interfaces[], InvocationHandler h)
		throws IllegalArgumentException
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isProxyClass(Class cl)
	{
		throw new RuntimeException("Stub!");
	}

	public static InvocationHandler getInvocationHandler(Object proxy)
		throws IllegalArgumentException
	{
		throw new RuntimeException("Stub!");
	}
}
