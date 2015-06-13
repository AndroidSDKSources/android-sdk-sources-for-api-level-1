// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HostnameVerifier.java

package javax.net.ssl;


// Referenced classes of package javax.net.ssl:
//			SSLSession

public interface HostnameVerifier
{

	public abstract boolean verify(String s, SSLSession sslsession);
}
