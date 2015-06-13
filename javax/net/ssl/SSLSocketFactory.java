// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SSLSocketFactory.java

package javax.net.ssl;

import java.io.IOException;
import java.net.Socket;
import javax.net.SocketFactory;

public abstract class SSLSocketFactory extends SocketFactory
{

	public SSLSocketFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public static SocketFactory getDefault()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract String[] getDefaultCipherSuites();

	public abstract String[] getSupportedCipherSuites();

	public abstract Socket createSocket(Socket socket, String s, int i, boolean flag)
		throws IOException;
}
