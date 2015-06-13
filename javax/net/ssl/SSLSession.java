// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SSLSession.java

package javax.net.ssl;

import java.security.Principal;
import java.security.cert.Certificate;
import javax.security.cert.X509Certificate;

// Referenced classes of package javax.net.ssl:
//			SSLPeerUnverifiedException, SSLSessionContext

public interface SSLSession
{

	public abstract int getApplicationBufferSize();

	public abstract String getCipherSuite();

	public abstract long getCreationTime();

	public abstract byte[] getId();

	public abstract long getLastAccessedTime();

	public abstract Certificate[] getLocalCertificates();

	public abstract Principal getLocalPrincipal();

	public abstract int getPacketBufferSize();

	public abstract X509Certificate[] getPeerCertificateChain()
		throws SSLPeerUnverifiedException;

	public abstract Certificate[] getPeerCertificates()
		throws SSLPeerUnverifiedException;

	public abstract String getPeerHost();

	public abstract int getPeerPort();

	public abstract Principal getPeerPrincipal()
		throws SSLPeerUnverifiedException;

	public abstract String getProtocol();

	public abstract SSLSessionContext getSessionContext();

	public abstract Object getValue(String s);

	public abstract String[] getValueNames();

	public abstract void invalidate();

	public abstract boolean isValid();

	public abstract void putValue(String s, Object obj);

	public abstract void removeValue(String s);
}
