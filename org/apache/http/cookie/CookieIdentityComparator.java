// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CookieIdentityComparator.java

package org.apache.http.cookie;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package org.apache.http.cookie:
//			Cookie

public class CookieIdentityComparator
	implements Serializable, Comparator
{

	public CookieIdentityComparator()
	{
		throw new RuntimeException("Stub!");
	}

	public int compare(Cookie c1, Cookie c2)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compare(Object x0, Object x1)
	{
		return compare((Cookie)x0, (Cookie)x1);
	}
}
