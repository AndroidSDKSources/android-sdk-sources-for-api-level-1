// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DESedeKeySpec.java

package javax.crypto.spec;

import java.security.InvalidKeyException;
import java.security.spec.KeySpec;

public class DESedeKeySpec
	implements KeySpec
{

	public static final int DES_EDE_KEY_LEN = 24;

	public DESedeKeySpec(byte key[])
		throws InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public DESedeKeySpec(byte key[], int offset)
		throws InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getKey()
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isParityAdjusted(byte key[], int offset)
		throws InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}
}
