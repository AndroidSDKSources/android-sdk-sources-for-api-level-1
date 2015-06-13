// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CertPathValidatorException.java

package java.security.cert;

import java.security.GeneralSecurityException;

// Referenced classes of package java.security.cert:
//			CertPath

public class CertPathValidatorException extends GeneralSecurityException
{

	public CertPathValidatorException(String msg, Throwable cause, CertPath certPath, int index)
	{
		throw new RuntimeException("Stub!");
	}

	public CertPathValidatorException(String msg, Throwable cause)
	{
		throw new RuntimeException("Stub!");
	}

	public CertPathValidatorException(Throwable cause)
	{
		throw new RuntimeException("Stub!");
	}

	public CertPathValidatorException(String msg)
	{
		throw new RuntimeException("Stub!");
	}

	public CertPathValidatorException()
	{
		throw new RuntimeException("Stub!");
	}

	public CertPath getCertPath()
	{
		throw new RuntimeException("Stub!");
	}

	public int getIndex()
	{
		throw new RuntimeException("Stub!");
	}
}
