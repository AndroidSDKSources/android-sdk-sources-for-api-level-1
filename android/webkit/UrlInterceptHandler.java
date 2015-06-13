// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   UrlInterceptHandler.java

package android.webkit;

import java.util.Map;

// Referenced classes of package android.webkit:
//			CacheManager

public interface UrlInterceptHandler
{

	public abstract CacheManager.CacheResult service(String s, Map map);
}
