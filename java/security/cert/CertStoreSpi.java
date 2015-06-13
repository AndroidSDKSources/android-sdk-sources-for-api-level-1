// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CertStoreSpi.java

package java.security.cert;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collection;

// Referenced classes of package java.security.cert:
//			CertStoreException, CertStoreParameters, CertSelector, CRLSelector

public abstract class CertStoreSpi
{

	public CertStoreSpi(CertStoreParameters params)
		throws InvalidAlgorithmParameterException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Collection engineGetCertificates(CertSelector certselector)
		throws CertStoreException;

	public abstract Collection engineGetCRLs(CRLSelector crlselector)
		throws CertStoreException;
}
