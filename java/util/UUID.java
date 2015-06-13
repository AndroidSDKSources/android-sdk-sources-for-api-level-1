// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   UUID.java

package java.util;

import java.io.Serializable;

public final class UUID
	implements Serializable, Comparable
{

	public UUID(long mostSigBits, long leastSigBits)
	{
		throw new RuntimeException("Stub!");
	}

	public static UUID randomUUID()
	{
		throw new RuntimeException("Stub!");
	}

	public static UUID nameUUIDFromBytes(byte name[])
	{
		throw new RuntimeException("Stub!");
	}

	public static UUID fromString(String uuid)
	{
		throw new RuntimeException("Stub!");
	}

	public long getLeastSignificantBits()
	{
		throw new RuntimeException("Stub!");
	}

	public long getMostSignificantBits()
	{
		throw new RuntimeException("Stub!");
	}

	public int version()
	{
		throw new RuntimeException("Stub!");
	}

	public int variant()
	{
		throw new RuntimeException("Stub!");
	}

	public long timestamp()
	{
		throw new RuntimeException("Stub!");
	}

	public int clockSequence()
	{
		throw new RuntimeException("Stub!");
	}

	public long node()
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(UUID uuid)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((UUID)x0);
	}
}
