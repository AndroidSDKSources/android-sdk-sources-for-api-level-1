// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SSLSocket.java

package javax.net.ssl;

import java.io.IOException;
import java.net.*;

// Referenced classes of package javax.net.ssl:
//			SSLSession, HandshakeCompletedListener

public abstract class SSLSocket extends Socket
{

	protected SSLSocket()
	{
		throw new RuntimeException("Stub!");
	}

	protected SSLSocket(String host, int port)
		throws IOException, UnknownHostException
	{
		throw new RuntimeException("Stub!");
	}

	protected SSLSocket(InetAddress address, int port)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected SSLSocket(String host, int port, InetAddress clientAddress, int clientPort)
		throws IOException, UnknownHostException
	{
		throw new RuntimeException("Stub!");
	}

	protected SSLSocket(InetAddress address, int port, InetAddress clientAddress, int clientPort)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract String[] getSupportedCipherSuites();

	public abstract String[] getEnabledCipherSuites();

	public abstract void setEnabledCipherSuites(String as[]);

	public abstract String[] getSupportedProtocols();

	public abstract String[] getEnabledProtocols();

	public abstract void setEnabledProtocols(String as[]);

	public abstract SSLSession getSession();

	public abstract void addHandshakeCompletedListener(HandshakeCompletedListener handshakecompletedlistener);

	public abstract void removeHandshakeCompletedListener(HandshakeCompletedListener handshakecompletedlistener);

	public abstract void startHandshake()
		throws IOException;

	public abstract void setUseClientMode(boolean flag);

	public abstract boolean getUseClientMode();

	public abstract void setNeedClientAuth(boolean flag);

	public abstract boolean getNeedClientAuth();

	public abstract void setWantClientAuth(boolean flag);

	public abstract boolean getWantClientAuth();

	public abstract void setEnableSessionCreation(boolean flag);

	public abstract boolean getEnableSessionCreation();
}
