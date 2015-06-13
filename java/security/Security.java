// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Security.java

package java.security;

import java.util.Map;
import java.util.Set;

// Referenced classes of package java.security:
//			Provider

public final class Security
{

	Security()
	{
		throw new RuntimeException("Stub!");
	}

	public static String getAlgorithmProperty(String algName, String propName)
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized int insertProviderAt(Provider provider, int position)
	{
		throw new RuntimeException("Stub!");
	}

	public static int addProvider(Provider provider)
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized void removeProvider(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized Provider[] getProviders()
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized Provider getProvider(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public static Provider[] getProviders(String filter)
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized Provider[] getProviders(Map filter)
	{
		throw new RuntimeException("Stub!");
	}

	public static String getProperty(String key)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setProperty(String key, String datnum)
	{
		throw new RuntimeException("Stub!");
	}

	public static Set getAlgorithms(String serviceName)
	{
		throw new RuntimeException("Stub!");
	}
}
