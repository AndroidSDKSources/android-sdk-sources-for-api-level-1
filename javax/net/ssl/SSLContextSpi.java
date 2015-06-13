// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SSLContextSpi.java

package javax.net.ssl;

import java.security.KeyManagementException;
import java.security.SecureRandom;

// Referenced classes of package javax.net.ssl:
//			KeyManager, TrustManager, SSLSocketFactory, SSLServerSocketFactory, 
//			SSLEngine, SSLSessionContext

public abstract class SSLContextSpi
{

	public SSLContextSpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineInit(KeyManager akeymanager[], TrustManager atrustmanager[], SecureRandom securerandom)
		throws KeyManagementException;

	protected abstract SSLSocketFactory engineGetSocketFactory();

	protected abstract SSLServerSocketFactory engineGetServerSocketFactory();

	protected abstract SSLEngine engineCreateSSLEngine(String s, int i);

	protected abstract SSLEngine engineCreateSSLEngine();

	protected abstract SSLSessionContext engineGetServerSessionContext();

	protected abstract SSLSessionContext engineGetClientSessionContext();
}
