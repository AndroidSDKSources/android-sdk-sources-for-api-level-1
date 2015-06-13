// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SSLSessionContext.java

package javax.net.ssl;

import java.util.Enumeration;

// Referenced classes of package javax.net.ssl:
//			SSLSession

public interface SSLSessionContext
{

	public abstract Enumeration getIds();

	public abstract SSLSession getSession(byte abyte0[]);

	public abstract int getSessionCacheSize();

	public abstract int getSessionTimeout();

	public abstract void setSessionCacheSize(int i)
		throws IllegalArgumentException;

	public abstract void setSessionTimeout(int i)
		throws IllegalArgumentException;
}
