// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PKIXCertPathBuilderResult.java

package java.security.cert;

import java.security.PublicKey;

// Referenced classes of package java.security.cert:
//			PKIXCertPathValidatorResult, TrustAnchor, PolicyNode, CertPathBuilderResult, 
//			CertPath

public class PKIXCertPathBuilderResult extends PKIXCertPathValidatorResult
	implements CertPathBuilderResult
{

	public PKIXCertPathBuilderResult(CertPath certPath, TrustAnchor trustAnchor, PolicyNode policyTree, PublicKey subjectPublicKey)
	{
		super((TrustAnchor)null, (PolicyNode)null, (PublicKey)null);
		throw new RuntimeException("Stub!");
	}

	public CertPath getCertPath()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
