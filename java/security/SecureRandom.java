// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SecureRandom.java

package java.security;

import java.util.Random;

// Referenced classes of package java.security:
//			NoSuchAlgorithmException, NoSuchProviderException, SecureRandomSpi, Provider

public class SecureRandom extends Random
{

	public SecureRandom()
	{
		throw new RuntimeException("Stub!");
	}

	public SecureRandom(byte seed[])
	{
		throw new RuntimeException("Stub!");
	}

	protected SecureRandom(SecureRandomSpi secureRandomSpi, Provider provider)
	{
		throw new RuntimeException("Stub!");
	}

	public static SecureRandom getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static SecureRandom getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static SecureRandom getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public String getAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSeed(byte seed[])
	{
		throw new RuntimeException("Stub!");
	}

	public void setSeed(long seed)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void nextBytes(byte bytes[])
	{
		throw new RuntimeException("Stub!");
	}

	protected final int next(int numBits)
	{
		throw new RuntimeException("Stub!");
	}

	public static byte[] getSeed(int numBytes)
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] generateSeed(int numBytes)
	{
		throw new RuntimeException("Stub!");
	}
}
