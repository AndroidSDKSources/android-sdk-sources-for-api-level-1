// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpsURLConnection.java

package javax.net.ssl;

import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Principal;
import java.security.cert.Certificate;

// Referenced classes of package javax.net.ssl:
//			SSLPeerUnverifiedException, HostnameVerifier, SSLSocketFactory

public abstract class HttpsURLConnection extends HttpURLConnection
{

	protected HostnameVerifier hostnameVerifier;

	protected HttpsURLConnection(URL url)
	{
		super((URL)null);
		throw new RuntimeException("Stub!");
	}

	public abstract String getCipherSuite();

	public abstract Certificate[] getLocalCertificates();

	public abstract Certificate[] getServerCertificates()
		throws SSLPeerUnverifiedException;

	public Principal getPeerPrincipal()
		throws SSLPeerUnverifiedException
	{
		throw new RuntimeException("Stub!");
	}

	public Principal getLocalPrincipal()
	{
		throw new RuntimeException("Stub!");
	}

	public static void setDefaultHostnameVerifier(HostnameVerifier v)
	{
		throw new RuntimeException("Stub!");
	}

	public static HostnameVerifier getDefaultHostnameVerifier()
	{
		throw new RuntimeException("Stub!");
	}

	public void setHostnameVerifier(HostnameVerifier v)
	{
		throw new RuntimeException("Stub!");
	}

	public HostnameVerifier getHostnameVerifier()
	{
		throw new RuntimeException("Stub!");
	}

	public static void setDefaultSSLSocketFactory(SSLSocketFactory sf)
	{
		throw new RuntimeException("Stub!");
	}

	public static SSLSocketFactory getDefaultSSLSocketFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSSLSocketFactory(SSLSocketFactory sf)
	{
		throw new RuntimeException("Stub!");
	}

	public SSLSocketFactory getSSLSocketFactory()
	{
		throw new RuntimeException("Stub!");
	}
}
