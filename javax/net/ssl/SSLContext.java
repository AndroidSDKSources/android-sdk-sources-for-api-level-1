// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SSLContext.java

package javax.net.ssl;

import java.security.*;

// Referenced classes of package javax.net.ssl:
//			SSLContextSpi, KeyManager, TrustManager, SSLSocketFactory, 
//			SSLServerSocketFactory, SSLEngine, SSLSessionContext

public class SSLContext
{

	protected SSLContext(SSLContextSpi contextSpi, Provider provider, String protocol)
	{
		throw new RuntimeException("Stub!");
	}

	public static SSLContext getInstance(String protocol)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public static SSLContext getInstance(String protocol, String provider)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static SSLContext getInstance(String protocol, Provider provider)
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public final String getProtocol()
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public final void init(KeyManager km[], TrustManager tm[], SecureRandom sr)
		throws KeyManagementException
	{
		throw new RuntimeException("Stub!");
	}

	public final SSLSocketFactory getSocketFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public final SSLServerSocketFactory getServerSocketFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public final SSLEngine createSSLEngine()
	{
		throw new RuntimeException("Stub!");
	}

	public final SSLEngine createSSLEngine(String peerHost, int peerPort)
	{
		throw new RuntimeException("Stub!");
	}

	public final SSLSessionContext getServerSessionContext()
	{
		throw new RuntimeException("Stub!");
	}

	public final SSLSessionContext getClientSessionContext()
	{
		throw new RuntimeException("Stub!");
	}
}
