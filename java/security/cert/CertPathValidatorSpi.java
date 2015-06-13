// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CertPathValidatorSpi.java

package java.security.cert;

import java.security.InvalidAlgorithmParameterException;

// Referenced classes of package java.security.cert:
//			CertPathValidatorException, CertPath, CertPathParameters, CertPathValidatorResult

public abstract class CertPathValidatorSpi
{

	public CertPathValidatorSpi()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract CertPathValidatorResult engineValidate(CertPath certpath, CertPathParameters certpathparameters)
		throws CertPathValidatorException, InvalidAlgorithmParameterException;
}
