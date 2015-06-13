// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SSLServerSocket.java

package javax.net.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

public abstract class SSLServerSocket extends ServerSocket
{

	protected SSLServerSocket()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected SSLServerSocket(int port)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected SSLServerSocket(int port, int backlog)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected SSLServerSocket(int port, int backlog, InetAddress address)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract String[] getEnabledCipherSuites();

	public abstract void setEnabledCipherSuites(String as[]);

	public abstract String[] getSupportedCipherSuites();

	public abstract String[] getSupportedProtocols();

	public abstract String[] getEnabledProtocols();

	public abstract void setEnabledProtocols(String as[]);

	public abstract void setNeedClientAuth(boolean flag);

	public abstract boolean getNeedClientAuth();

	public abstract void setWantClientAuth(boolean flag);

	public abstract boolean getWantClientAuth();

	public abstract void setUseClientMode(boolean flag);

	public abstract boolean getUseClientMode();

	public abstract void setEnableSessionCreation(boolean flag);

	public abstract boolean getEnableSessionCreation();
}
