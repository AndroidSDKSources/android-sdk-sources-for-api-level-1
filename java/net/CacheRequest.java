// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CacheRequest.java

package java.net;

import java.io.IOException;
import java.io.OutputStream;

public abstract class CacheRequest
{

	public CacheRequest()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void abort();

	public abstract OutputStream getBody()
		throws IOException;
}
