// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   X509TrustManager.java

package javax.net.ssl;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

// Referenced classes of package javax.net.ssl:
//			TrustManager

public interface X509TrustManager
	extends TrustManager
{

	public abstract void checkClientTrusted(X509Certificate ax509certificate[], String s)
		throws CertificateException;

	public abstract void checkServerTrusted(X509Certificate ax509certificate[], String s)
		throws CertificateException;

	public abstract X509Certificate[] getAcceptedIssuers();
}
