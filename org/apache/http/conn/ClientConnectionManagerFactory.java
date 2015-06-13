// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ClientConnectionManagerFactory.java

package org.apache.http.conn;

import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.conn:
//			ClientConnectionManager

public interface ClientConnectionManagerFactory
{

	public abstract ClientConnectionManager newInstance(HttpParams httpparams, SchemeRegistry schemeregistry);
}
