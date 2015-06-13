// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SecureRandomSpi.java

package java.security;

import java.io.Serializable;

public abstract class SecureRandomSpi
	implements Serializable
{

	public SecureRandomSpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineSetSeed(byte abyte0[]);

	protected abstract void engineNextBytes(byte abyte0[]);

	protected abstract byte[] engineGenerateSeed(int i);
}
