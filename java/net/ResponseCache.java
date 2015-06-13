// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ResponseCache.java

package java.net;

import java.io.IOException;
import java.util.Map;

// Referenced classes of package java.net:
//			URI, CacheResponse, URLConnection, CacheRequest

public abstract class ResponseCache
{

	public ResponseCache()
	{
		throw new RuntimeException("Stub!");
	}

	public static ResponseCache getDefault()
	{
		throw new RuntimeException("Stub!");
	}

	public static void setDefault(ResponseCache responseCache)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract CacheResponse get(URI uri, String s, Map map)
		throws IOException;

	public abstract CacheRequest put(URI uri, URLConnection urlconnection)
		throws IOException;
}
