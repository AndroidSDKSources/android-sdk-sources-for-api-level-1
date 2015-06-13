// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Enum.java

package java.lang;

import java.io.Serializable;

// Referenced classes of package java.lang:
//			Object, RuntimeException, Comparable, CloneNotSupportedException, 
//			String, Class

public abstract class Enum
	implements Serializable, Comparable
{

	protected Enum(String name, int ordinal)
	{
		throw new RuntimeException("Stub!");
	}

	public final String name()
	{
		throw new RuntimeException("Stub!");
	}

	public final int ordinal()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean equals(Object other)
	{
		throw new RuntimeException("Stub!");
	}

	public final int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	protected final Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}

	public final int compareTo(Enum o)
	{
		throw new RuntimeException("Stub!");
	}

	public final Class getDeclaringClass()
	{
		throw new RuntimeException("Stub!");
	}

	public static Enum valueOf(Class enumType, String name)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((Enum)x0);
	}
}
