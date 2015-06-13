// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CacheManager.java

package android.webkit;

import java.io.*;
import java.util.Map;

public final class CacheManager
{
	public static class CacheResult
	{

		public int getHttpStatusCode()
		{
			throw new RuntimeException("Stub!");
		}

		public long getContentLength()
		{
			throw new RuntimeException("Stub!");
		}

		public String getLocalPath()
		{
			throw new RuntimeException("Stub!");
		}

		public long getExpires()
		{
			throw new RuntimeException("Stub!");
		}

		public String getLastModified()
		{
			throw new RuntimeException("Stub!");
		}

		public String getETag()
		{
			throw new RuntimeException("Stub!");
		}

		public String getMimeType()
		{
			throw new RuntimeException("Stub!");
		}

		public String getLocation()
		{
			throw new RuntimeException("Stub!");
		}

		public String getEncoding()
		{
			throw new RuntimeException("Stub!");
		}

		public InputStream getInputStream()
		{
			throw new RuntimeException("Stub!");
		}

		public OutputStream getOutputStream()
		{
			throw new RuntimeException("Stub!");
		}

		public void setInputStream(InputStream stream)
		{
			throw new RuntimeException("Stub!");
		}

		public void setEncoding(String encoding)
		{
			throw new RuntimeException("Stub!");
		}

		public CacheResult()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public CacheManager()
	{
		throw new RuntimeException("Stub!");
	}

	public static File getCacheFileBaseDir()
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean cacheDisabled()
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean startCacheTransaction()
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean endCacheTransaction()
	{
		throw new RuntimeException("Stub!");
	}

	public static CacheResult getCacheFile(String url, Map headers)
	{
		throw new RuntimeException("Stub!");
	}

	public static void saveCacheFile(String url, CacheResult cacheRet)
	{
		throw new RuntimeException("Stub!");
	}
}
