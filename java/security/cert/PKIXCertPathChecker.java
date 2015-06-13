// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PKIXCertPathChecker.java

package java.security.cert;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package java.security.cert:
//			CertPathValidatorException, Certificate

public abstract class PKIXCertPathChecker
	implements Cloneable
{

	protected PKIXCertPathChecker()
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void init(boolean flag)
		throws CertPathValidatorException;

	public abstract boolean isForwardCheckingSupported();

	public abstract Set getSupportedExtensions();

	public abstract void check(Certificate certificate, Collection collection)
		throws CertPathValidatorException;
}
