// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CookieSpecFactory.java

package org.apache.http.cookie;

import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.cookie:
//			CookieSpec

public interface CookieSpecFactory
{

	public abstract CookieSpec newInstance(HttpParams httpparams);
}
