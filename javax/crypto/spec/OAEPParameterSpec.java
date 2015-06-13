// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   OAEPParameterSpec.java

package javax.crypto.spec;

import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package javax.crypto.spec:
//			PSource

public class OAEPParameterSpec
	implements AlgorithmParameterSpec
{

	public static final OAEPParameterSpec DEFAULT = null;

	public OAEPParameterSpec(String mdName, String mgfName, AlgorithmParameterSpec mgfSpec, PSource pSrc)
	{
		throw new RuntimeException("Stub!");
	}

	public String getDigestAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public String getMGFAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public AlgorithmParameterSpec getMGFParameters()
	{
		throw new RuntimeException("Stub!");
	}

	public PSource getPSource()
	{
		throw new RuntimeException("Stub!");
	}

}
