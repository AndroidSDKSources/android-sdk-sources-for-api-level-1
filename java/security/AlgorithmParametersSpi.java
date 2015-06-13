// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AlgorithmParametersSpi.java

package java.security;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public abstract class AlgorithmParametersSpi
{

	public AlgorithmParametersSpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineInit(AlgorithmParameterSpec algorithmparameterspec)
		throws InvalidParameterSpecException;

	protected abstract void engineInit(byte abyte0[])
		throws IOException;

	protected abstract void engineInit(byte abyte0[], String s)
		throws IOException;

	protected abstract AlgorithmParameterSpec engineGetParameterSpec(Class class1)
		throws InvalidParameterSpecException;

	protected abstract byte[] engineGetEncoded()
		throws IOException;

	protected abstract byte[] engineGetEncoded(String s)
		throws IOException;

	protected abstract String engineToString();
}
