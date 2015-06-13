// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AuthSchemeFactory.java

package org.apache.http.auth;

import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.auth:
//			AuthScheme

public interface AuthSchemeFactory
{

	public abstract AuthScheme newInstance(HttpParams httpparams);
}
