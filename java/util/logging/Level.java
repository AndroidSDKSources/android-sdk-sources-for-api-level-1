// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Level.java

package java.util.logging;

import java.io.Serializable;

public class Level
	implements Serializable
{

	public static final Level OFF = null;
	public static final Level SEVERE = null;
	public static final Level WARNING = null;
	public static final Level INFO = null;
	public static final Level CONFIG = null;
	public static final Level FINE = null;
	public static final Level FINER = null;
	public static final Level FINEST = null;
	public static final Level ALL = null;

	protected Level(String name, int level)
	{
		throw new RuntimeException("Stub!");
	}

	protected Level(String name, int level, String resourceBundleName)
	{
		throw new RuntimeException("Stub!");
	}

	public static final Level parse(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public String getResourceBundleName()
	{
		throw new RuntimeException("Stub!");
	}

	public final int intValue()
	{
		throw new RuntimeException("Stub!");
	}

	public String getLocalizedName()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object o)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public final String toString()
	{
		throw new RuntimeException("Stub!");
	}

}
