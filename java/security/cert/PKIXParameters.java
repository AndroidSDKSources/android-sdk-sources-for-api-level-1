// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PKIXParameters.java

package java.security.cert;

import java.security.*;
import java.util.*;

// Referenced classes of package java.security.cert:
//			CertPathParameters, PKIXCertPathChecker, CertStore, CertSelector

public class PKIXParameters
	implements CertPathParameters
{

	public PKIXParameters(Set trustAnchors)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public PKIXParameters(KeyStore keyStore)
		throws KeyStoreException, InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public Set getTrustAnchors()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTrustAnchors(Set trustAnchors)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAnyPolicyInhibited()
	{
		throw new RuntimeException("Stub!");
	}

	public void setAnyPolicyInhibited(boolean anyPolicyInhibited)
	{
		throw new RuntimeException("Stub!");
	}

	public List getCertPathCheckers()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCertPathCheckers(List certPathCheckers)
	{
		throw new RuntimeException("Stub!");
	}

	public void addCertPathChecker(PKIXCertPathChecker checker)
	{
		throw new RuntimeException("Stub!");
	}

	public List getCertStores()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCertStores(List certStores)
	{
		throw new RuntimeException("Stub!");
	}

	public void addCertStore(CertStore store)
	{
		throw new RuntimeException("Stub!");
	}

	public Date getDate()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDate(Date date)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isExplicitPolicyRequired()
	{
		throw new RuntimeException("Stub!");
	}

	public void setExplicitPolicyRequired(boolean explicitPolicyRequired)
	{
		throw new RuntimeException("Stub!");
	}

	public Set getInitialPolicies()
	{
		throw new RuntimeException("Stub!");
	}

	public void setInitialPolicies(Set initialPolicies)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isPolicyMappingInhibited()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPolicyMappingInhibited(boolean policyMappingInhibited)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getPolicyQualifiersRejected()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPolicyQualifiersRejected(boolean policyQualifiersRejected)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isRevocationEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public void setRevocationEnabled(boolean revocationEnabled)
	{
		throw new RuntimeException("Stub!");
	}

	public String getSigProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSigProvider(String sigProvider)
	{
		throw new RuntimeException("Stub!");
	}

	public CertSelector getTargetCertConstraints()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTargetCertConstraints(CertSelector targetCertConstraints)
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
