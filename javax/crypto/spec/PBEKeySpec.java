// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PBEKeySpec.java

package javax.crypto.spec;

import java.security.spec.KeySpec;

public class PBEKeySpec
	implements KeySpec
{

	public PBEKeySpec(char password[])
	{
		throw new RuntimeException("Stub!");
	}

	public PBEKeySpec(char password[], byte salt[], int iterationCount, int keyLength)
	{
		throw new RuntimeException("Stub!");
	}

	public PBEKeySpec(char password[], byte salt[], int iterationCount)
	{
		throw new RuntimeException("Stub!");
	}

	public final void clearPassword()
	{
		throw new RuntimeException("Stub!");
	}

	public final char[] getPassword()
	{
		throw new RuntimeException("Stub!");
	}

	public final byte[] getSalt()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getIterationCount()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getKeyLength()
	{
		throw new RuntimeException("Stub!");
	}
}
