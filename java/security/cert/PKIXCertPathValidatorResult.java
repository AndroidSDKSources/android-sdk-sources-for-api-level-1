// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PKIXCertPathValidatorResult.java

package java.security.cert;

import java.security.PublicKey;

// Referenced classes of package java.security.cert:
//			CertPathValidatorResult, TrustAnchor, PolicyNode

public class PKIXCertPathValidatorResult
	implements CertPathValidatorResult
{

	public PKIXCertPathValidatorResult(TrustAnchor trustAnchor, PolicyNode policyTree, PublicKey subjectPublicKey)
	{
		throw new RuntimeException("Stub!");
	}

	public PolicyNode getPolicyTree()
	{
		throw new RuntimeException("Stub!");
	}

	public PublicKey getPublicKey()
	{
		throw new RuntimeException("Stub!");
	}

	public TrustAnchor getTrustAnchor()
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
