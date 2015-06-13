// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   X500Principal.java

package javax.security.auth.x500;

import java.io.InputStream;
import java.io.Serializable;
import java.security.Principal;

public final class X500Principal
	implements Serializable, Principal
{

	public static final String CANONICAL = "CANONICAL";
	public static final String RFC1779 = "RFC1779";
	public static final String RFC2253 = "RFC2253";

	public X500Principal(byte name[])
	{
		throw new RuntimeException("Stub!");
	}

	public X500Principal(InputStream in)
	{
		throw new RuntimeException("Stub!");
	}

	public X500Principal(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object o)
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getEncoded()
	{
		throw new RuntimeException("Stub!");
	}

	public String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public String getName(String format)
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
}
