// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SSLEngine.java

package javax.net.ssl;

import java.nio.ByteBuffer;

// Referenced classes of package javax.net.ssl:
//			SSLException, SSLEngineResult, SSLSession

public abstract class SSLEngine
{

	protected SSLEngine()
	{
		throw new RuntimeException("Stub!");
	}

	protected SSLEngine(String host, int port)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void beginHandshake()
		throws SSLException;

	public abstract void closeInbound()
		throws SSLException;

	public abstract void closeOutbound();

	public abstract Runnable getDelegatedTask();

	public abstract String[] getEnabledCipherSuites();

	public abstract String[] getEnabledProtocols();

	public abstract boolean getEnableSessionCreation();

	public abstract SSLEngineResult.HandshakeStatus getHandshakeStatus();

	public abstract boolean getNeedClientAuth();

	public String getPeerHost()
	{
		throw new RuntimeException("Stub!");
	}

	public int getPeerPort()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract SSLSession getSession();

	public abstract String[] getSupportedCipherSuites();

	public abstract String[] getSupportedProtocols();

	public abstract boolean getUseClientMode();

	public abstract boolean getWantClientAuth();

	public abstract boolean isInboundDone();

	public abstract boolean isOutboundDone();

	public abstract void setEnabledCipherSuites(String as[]);

	public abstract void setEnabledProtocols(String as[]);

	public abstract void setEnableSessionCreation(boolean flag);

	public abstract void setNeedClientAuth(boolean flag);

	public abstract void setUseClientMode(boolean flag);

	public abstract void setWantClientAuth(boolean flag);

	public abstract SSLEngineResult unwrap(ByteBuffer bytebuffer, ByteBuffer abytebuffer[], int i, int j)
		throws SSLException;

	public abstract SSLEngineResult wrap(ByteBuffer abytebuffer[], int i, int j, ByteBuffer bytebuffer)
		throws SSLException;

	public SSLEngineResult unwrap(ByteBuffer src, ByteBuffer dst)
		throws SSLException
	{
		throw new RuntimeException("Stub!");
	}

	public SSLEngineResult unwrap(ByteBuffer src, ByteBuffer dsts[])
		throws SSLException
	{
		throw new RuntimeException("Stub!");
	}

	public SSLEngineResult wrap(ByteBuffer srcs[], ByteBuffer dst)
		throws SSLException
	{
		throw new RuntimeException("Stub!");
	}

	public SSLEngineResult wrap(ByteBuffer src, ByteBuffer dst)
		throws SSLException
	{
		throw new RuntimeException("Stub!");
	}
}
