// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CacheResponse.java

package java.net;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public abstract class CacheResponse
{

	public CacheResponse()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract InputStream getBody()
		throws IOException;

	public abstract Map getHeaders()
		throws IOException;
}
