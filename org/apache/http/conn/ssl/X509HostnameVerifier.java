// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   X509HostnameVerifier.java

package org.apache.http.conn.ssl;

import java.io.IOException;
import java.security.cert.X509Certificate;
import javax.net.ssl.*;

public interface X509HostnameVerifier
	extends HostnameVerifier
{

	public abstract boolean verify(String s, SSLSession sslsession);

	public abstract void verify(String s, SSLSocket sslsocket)
		throws IOException;

	public abstract void verify(String s, X509Certificate x509certificate)
		throws SSLException;

	public abstract void verify(String s, String as[], String as1[])
		throws SSLException;
}
