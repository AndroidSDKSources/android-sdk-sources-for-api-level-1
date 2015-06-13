// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TrustAnchor.java

package java.security.cert;

import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package java.security.cert:
//			X509Certificate

public class TrustAnchor
{

	public TrustAnchor(X509Certificate trustedCert, byte nameConstraints[])
	{
		throw new RuntimeException("Stub!");
	}

	public TrustAnchor(String caName, PublicKey caPublicKey, byte nameConstraints[])
	{
		throw new RuntimeException("Stub!");
	}

	public TrustAnchor(X500Principal caPrincipal, PublicKey caPublicKey, byte nameConstraints[])
	{
		throw new RuntimeException("Stub!");
	}

	public final byte[] getNameConstraints()
	{
		throw new RuntimeException("Stub!");
	}

	public final X509Certificate getTrustedCert()
	{
		throw new RuntimeException("Stub!");
	}

	public final X500Principal getCA()
	{
		throw new RuntimeException("Stub!");
	}

	public final String getCAName()
	{
		throw new RuntimeException("Stub!");
	}

	public final PublicKey getCAPublicKey()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
