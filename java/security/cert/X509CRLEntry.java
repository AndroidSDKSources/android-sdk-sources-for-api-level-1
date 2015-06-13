// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   X509CRLEntry.java

package java.security.cert;

import java.math.BigInteger;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package java.security.cert:
//			X509Extension, CRLException

public abstract class X509CRLEntry
	implements X509Extension
{

	public X509CRLEntry()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object other)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract byte[] getEncoded()
		throws CRLException;

	public abstract BigInteger getSerialNumber();

	public X500Principal getCertificateIssuer()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Date getRevocationDate();

	public abstract boolean hasExtensions();

	public abstract String toString();
}
