// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CertPathBuilderSpi.java

package java.security.cert;

import java.security.InvalidAlgorithmParameterException;

// Referenced classes of package java.security.cert:
//			CertPathBuilderException, CertPathParameters, CertPathBuilderResult

public abstract class CertPathBuilderSpi
{

	public CertPathBuilderSpi()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract CertPathBuilderResult engineBuild(CertPathParameters certpathparameters)
		throws CertPathBuilderException, InvalidAlgorithmParameterException;
}
