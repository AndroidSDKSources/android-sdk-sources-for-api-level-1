// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractVerifier.java

package org.apache.http.conn.ssl;

import java.io.IOException;
import java.security.cert.X509Certificate;
import javax.net.ssl.*;

// Referenced classes of package org.apache.http.conn.ssl:
//			X509HostnameVerifier

public abstract class AbstractVerifier
	implements X509HostnameVerifier
{

	public AbstractVerifier()
	{
		throw new RuntimeException("Stub!");
	}

	public final void verify(String host, SSLSocket ssl)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean verify(String host, SSLSession session)
	{
		throw new RuntimeException("Stub!");
	}

	public final void verify(String host, X509Certificate cert)
		throws SSLException
	{
		throw new RuntimeException("Stub!");
	}

	public final void verify(String host, String cns[], String subjectAlts[], boolean strictWithSubDomains)
		throws SSLException
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean acceptableCountryWildcard(String cn)
	{
		throw new RuntimeException("Stub!");
	}

	public static String[] getCNs(X509Certificate cert)
	{
		throw new RuntimeException("Stub!");
	}

	public static String[] getDNSSubjectAlts(X509Certificate cert)
	{
		throw new RuntimeException("Stub!");
	}

	public static int countDots(String s)
	{
		throw new RuntimeException("Stub!");
	}
}
