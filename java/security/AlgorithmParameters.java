// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AlgorithmParameters.java

package java.security;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

// Referenced classes of package java.security:
//			NoSuchAlgorithmException, NoSuchProviderException, AlgorithmParametersSpi, Provider

public class AlgorithmParameters
{

	protected AlgorithmParameters(AlgorithmParametersSpi keyFacSpi, Provider provider, String algorithm)
	{
		throw new RuntimeException("Stub!");
	}

	public static AlgorithmParameters getInstance(String algorithm)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static AlgorithmParameters getInstance(String algorithm, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static AlgorithmParameters getInstance(String algorithm, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(AlgorithmParameterSpec paramSpec)
		throws InvalidParameterSpecException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(byte params[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(byte params[], String format)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final AlgorithmParameterSpec getParameterSpec(Class paramSpec)
		throws InvalidParameterSpecException
	{
		throw new RuntimeException("Stub!");
	}

	public final byte[] getEncoded()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final byte[] getEncoded(String format)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
