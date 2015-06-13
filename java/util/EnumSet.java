// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EnumSet.java

package java.util;

import java.io.Serializable;

// Referenced classes of package java.util:
//			AbstractSet, Collection

public abstract class EnumSet extends AbstractSet
	implements Cloneable, Serializable
{

	EnumSet()
	{
		throw new RuntimeException("Stub!");
	}

	public static EnumSet noneOf(Class elementType)
	{
		throw new RuntimeException("Stub!");
	}

	public static EnumSet allOf(Class elementType)
	{
		throw new RuntimeException("Stub!");
	}

	public static EnumSet copyOf(EnumSet s)
	{
		throw new RuntimeException("Stub!");
	}

	public static EnumSet copyOf(Collection c)
	{
		throw new RuntimeException("Stub!");
	}

	public static EnumSet complementOf(EnumSet s)
	{
		throw new RuntimeException("Stub!");
	}

	public static EnumSet of(Enum e)
	{
		throw new RuntimeException("Stub!");
	}

	public static EnumSet of(Enum e1, Enum e2)
	{
		throw new RuntimeException("Stub!");
	}

	public static EnumSet of(Enum e1, Enum e2, Enum e3)
	{
		throw new RuntimeException("Stub!");
	}

	public static EnumSet of(Enum e1, Enum e2, Enum e3, Enum e4)
	{
		throw new RuntimeException("Stub!");
	}

	public static EnumSet of(Enum e1, Enum e2, Enum e3, Enum e4, Enum e5)
	{
		throw new RuntimeException("Stub!");
	}

	public static transient EnumSet of(Enum start, Enum others[])
	{
		throw new RuntimeException("Stub!");
	}

	public static EnumSet range(Enum start, Enum end)
	{
		throw new RuntimeException("Stub!");
	}

	public EnumSet clone()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return clone();
	}
}
