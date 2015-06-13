// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SSLCertificateSocketFactory.java

package android.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

public class SSLCertificateSocketFactory extends SSLSocketFactory
{

	public SSLCertificateSocketFactory(int socketReadTimeoutForSslHandshake)
		throws NoSuchAlgorithmException, KeyManagementException
	{
		throw new RuntimeException("Stub!");
	}

	public static SocketFactory getDefault(int socketReadTimeoutForSslHandshake)
	{
		throw new RuntimeException("Stub!");
	}

	public Socket createSocket(Socket socket, String s, int i, boolean flag)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Socket createSocket(InetAddress inaddr, int i, InetAddress inaddr2, int j)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Socket createSocket(InetAddress inaddr, int i)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Socket createSocket(String s, int i, InetAddress inaddr, int j)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Socket createSocket(String s, int i)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String[] getDefaultCipherSuites()
	{
		throw new RuntimeException("Stub!");
	}

	public String[] getSupportedCipherSuites()
	{
		throw new RuntimeException("Stub!");
	}
}
