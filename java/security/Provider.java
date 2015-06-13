// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Provider.java

package java.security;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

// Referenced classes of package java.security:
//			NoSuchAlgorithmException

public abstract class Provider extends Properties
{
	public static class Service
	{

		public final String getType()
		{
			throw new RuntimeException("Stub!");
		}

		public final String getAlgorithm()
		{
			throw new RuntimeException("Stub!");
		}

		public final Provider getProvider()
		{
			throw new RuntimeException("Stub!");
		}

		public final String getClassName()
		{
			throw new RuntimeException("Stub!");
		}

		public final String getAttribute(String name)
		{
			throw new RuntimeException("Stub!");
		}

		public Object newInstance(Object constructorParameter)
			throws NoSuchAlgorithmException
		{
			throw new RuntimeException("Stub!");
		}

		public boolean supportsParameter(Object parameter)
		{
			throw new RuntimeException("Stub!");
		}

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}

		public Service(Provider provider, String type, String algorithm, String className, List aliases, Map attributes)
		{
			throw new RuntimeException("Stub!");
		}
	}


	protected Provider(String name, double version, String info)
	{
		throw new RuntimeException("Stub!");
	}

	public String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public double getVersion()
	{
		throw new RuntimeException("Stub!");
	}

	public String getInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void clear()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void load(InputStream inStream)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void putAll(Map t)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Set entrySet()
	{
		throw new RuntimeException("Stub!");
	}

	public Set keySet()
	{
		throw new RuntimeException("Stub!");
	}

	public Collection values()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Object put(Object key, Object value)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Object remove(Object key)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Service getService(String type, String algorithm)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Set getServices()
	{
		throw new RuntimeException("Stub!");
	}

	protected synchronized void putService(Service s)
	{
		throw new RuntimeException("Stub!");
	}

	protected synchronized void removeService(Service s)
	{
		throw new RuntimeException("Stub!");
	}
}
