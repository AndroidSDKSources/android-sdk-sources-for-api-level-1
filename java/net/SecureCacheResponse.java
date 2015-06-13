// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SecureCacheResponse.java

package java.net;

import java.security.Principal;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

// Referenced classes of package java.net:
//			CacheResponse

public abstract class SecureCacheResponse extends CacheResponse
{

	public SecureCacheResponse()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract String getCipherSuite();

	public abstract List getLocalCertificateChain();

	public abstract List getServerCertificateChain()
		throws SSLPeerUnverifiedException;

	public abstract Principal getPeerPrincipal()
		throws SSLPeerUnverifiedException;

	public abstract Principal getLocalPrincipal();
}
