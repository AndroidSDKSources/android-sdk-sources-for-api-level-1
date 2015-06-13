// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MacSpi.java

package javax.crypto;

import java.nio.ByteBuffer;
import java.security.*;
import java.security.spec.AlgorithmParameterSpec;

public abstract class MacSpi
{

	public MacSpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract int engineGetMacLength();

	protected abstract void engineInit(Key key, AlgorithmParameterSpec algorithmparameterspec)
		throws InvalidKeyException, InvalidAlgorithmParameterException;

	protected abstract void engineUpdate(byte byte0);

	protected abstract void engineUpdate(byte abyte0[], int i, int j);

	protected void engineUpdate(ByteBuffer input)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract byte[] engineDoFinal();

	protected abstract void engineReset();

	public Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}
}
