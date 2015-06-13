// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PSSParameterSpec.java

package java.security.spec;


// Referenced classes of package java.security.spec:
//			AlgorithmParameterSpec

public class PSSParameterSpec
	implements AlgorithmParameterSpec
{

	public static final PSSParameterSpec DEFAULT = null;

	public PSSParameterSpec(int saltLen)
	{
		throw new RuntimeException("Stub!");
	}

	public PSSParameterSpec(String mdName, String mgfName, AlgorithmParameterSpec mgfSpec, int saltLen, int trailerField)
	{
		throw new RuntimeException("Stub!");
	}

	public int getSaltLength()
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

	public int getTrailerField()
	{
		throw new RuntimeException("Stub!");
	}

}
