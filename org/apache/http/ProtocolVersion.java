// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ProtocolVersion.java

package org.apache.http;

import java.io.Serializable;

public class ProtocolVersion
	implements Serializable, Cloneable
{

	protected final String protocol;
	protected final int major;
	protected final int minor;

	public ProtocolVersion(String protocol, int major, int minor)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getProtocol()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getMajor()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getMinor()
	{
		throw new RuntimeException("Stub!");
	}

	public ProtocolVersion forVersion(int major, int minor)
	{
		throw new RuntimeException("Stub!");
	}

	public final int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isComparable(ProtocolVersion that)
	{
		throw new RuntimeException("Stub!");
	}

	public int compareToVersion(ProtocolVersion that)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean greaterEquals(ProtocolVersion version)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean lessEquals(ProtocolVersion version)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}
}
