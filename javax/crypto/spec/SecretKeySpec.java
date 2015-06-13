// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SecretKeySpec.java

package javax.crypto.spec;

import java.io.Serializable;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;

public class SecretKeySpec
	implements SecretKey, KeySpec, Serializable
{

	public SecretKeySpec(byte key[], String algorithm)
	{
		throw new RuntimeException("Stub!");
	}

	public SecretKeySpec(byte key[], int offset, int len, String algorithm)
	{
		throw new RuntimeException("Stub!");
	}

	public String getAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public String getFormat()
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getEncoded()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}
}
