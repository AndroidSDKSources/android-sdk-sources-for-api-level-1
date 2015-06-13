// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HandshakeCompletedEvent.java

package javax.net.ssl;

import java.io.Serializable;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.EventObject;
import javax.security.cert.X509Certificate;

// Referenced classes of package javax.net.ssl:
//			SSLPeerUnverifiedException, SSLSocket, SSLSession

public class HandshakeCompletedEvent extends EventObject
	implements Serializable
{

	public HandshakeCompletedEvent(SSLSocket sock, SSLSession s)
	{
		super((Object)null);
		throw new RuntimeException("Stub!");
	}

	public SSLSession getSession()
	{
		throw new RuntimeException("Stub!");
	}

	public String getCipherSuite()
	{
		throw new RuntimeException("Stub!");
	}

	public Certificate[] getLocalCertificates()
	{
		throw new RuntimeException("Stub!");
	}

	public Certificate[] getPeerCertificates()
		throws SSLPeerUnverifiedException
	{
		throw new RuntimeException("Stub!");
	}

	public X509Certificate[] getPeerCertificateChain()
		throws SSLPeerUnverifiedException
	{
		throw new RuntimeException("Stub!");
	}

	public Principal getPeerPrincipal()
		throws SSLPeerUnverifiedException
	{
		throw new RuntimeException("Stub!");
	}

	public Principal getLocalPrincipal()
	{
		throw new RuntimeException("Stub!");
	}

	public SSLSocket getSocket()
	{
		throw new RuntimeException("Stub!");
	}
}
