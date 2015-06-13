// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PKIXBuilderParameters.java

package java.security.cert;

import java.security.*;
import java.util.Set;

// Referenced classes of package java.security.cert:
//			PKIXParameters, CertSelector

public class PKIXBuilderParameters extends PKIXParameters
{

	public PKIXBuilderParameters(Set trustAnchors, CertSelector targetConstraints)
		throws InvalidAlgorithmParameterException
	{
		super((Set)null);
		throw new RuntimeException("Stub!");
	}

	public PKIXBuilderParameters(KeyStore keyStore, CertSelector targetConstraints)
		throws KeyStoreException, InvalidAlgorithmParameterException
	{
		super((KeyStore)null);
		throw new RuntimeException("Stub!");
	}

	public int getMaxPathLength()
	{
		throw new RuntimeException("Stub!");
	}

	public void setMaxPathLength(int maxPathLength)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
