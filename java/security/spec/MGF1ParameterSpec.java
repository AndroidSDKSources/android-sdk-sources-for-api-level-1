// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MGF1ParameterSpec.java

package java.security.spec;


// Referenced classes of package java.security.spec:
//			AlgorithmParameterSpec

public class MGF1ParameterSpec
	implements AlgorithmParameterSpec
{

	public static final MGF1ParameterSpec SHA1 = null;
	public static final MGF1ParameterSpec SHA256 = null;
	public static final MGF1ParameterSpec SHA384 = null;
	public static final MGF1ParameterSpec SHA512 = null;

	public MGF1ParameterSpec(String mdName)
	{
		throw new RuntimeException("Stub!");
	}

	public String getDigestAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

}
