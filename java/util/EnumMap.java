// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EnumMap.java

package java.util;

import java.io.Serializable;

// Referenced classes of package java.util:
//			AbstractMap, Map, Set, Collection

public class EnumMap extends AbstractMap
	implements Map, Serializable, Cloneable
{

	public EnumMap(Class keyType)
	{
		throw new RuntimeException("Stub!");
	}

	public EnumMap(EnumMap map)
	{
		throw new RuntimeException("Stub!");
	}

	public EnumMap(Map map)
	{
		throw new RuntimeException("Stub!");
	}

	public void clear()
	{
		throw new RuntimeException("Stub!");
	}

	public EnumMap clone()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean containsKey(Object key)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean containsValue(Object value)
	{
		throw new RuntimeException("Stub!");
	}

	public Set entrySet()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public Object get(Object key)
	{
		throw new RuntimeException("Stub!");
	}

	public Set keySet()
	{
		throw new RuntimeException("Stub!");
	}

	public Object put(Enum key, Object value)
	{
		throw new RuntimeException("Stub!");
	}

	public void putAll(Map map)
	{
		throw new RuntimeException("Stub!");
	}

	public Object remove(Object key)
	{
		throw new RuntimeException("Stub!");
	}

	public int size()
	{
		throw new RuntimeException("Stub!");
	}

	public Collection values()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return clone();
	}

	public volatile Object put(Object x0, Object x1)
	{
		return put((Enum)x0, x1);
	}
}
