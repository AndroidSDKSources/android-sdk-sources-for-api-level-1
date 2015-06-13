// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MessageDigest.java

package java.security;

import java.nio.ByteBuffer;

// Referenced classes of package java.security:
//			MessageDigestSpi, NoSuchAlgorithmException, NoSuchProviderException, DigestException, 
//			Provider

public abstract class MessageDigest extends MessageDigestSpi
{

	protected MessageDigest(String algorithm)
	{
		throw new RuntimeException("Stub!");
	}

	public static MessageDigest getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static MessageDigest getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static MessageDigest getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
	{
		throw new RuntimeException("Stub!");
	}

	public void update(byte arg0)
	{
		throw new RuntimeException("Stub!");
	}

	public void update(byte input[], int offset, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public void update(byte input[])
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] digest()
	{
		throw new RuntimeException("Stub!");
	}

	public int digest(byte buf[], int offset, int len)
		throws DigestException
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] digest(byte input[])
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isEqual(byte digesta[], byte digestb[])
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

	public final int getDigestLength()
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}

	public final void update(ByteBuffer input)
	{
		throw new RuntimeException("Stub!");
	}
}
