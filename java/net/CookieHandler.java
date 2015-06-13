// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CookieHandler.java

package java.net;

import java.io.IOException;
import java.util.Map;

// Referenced classes of package java.net:
//			URI

public abstract class CookieHandler
{

	public CookieHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public static CookieHandler getDefault()
	{
		throw new RuntimeException("Stub!");
	}

	public static void setDefault(CookieHandler cHandler)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Map get(URI uri, Map map)
		throws IOException;

	public abstract void put(URI uri, Map map)
		throws IOException;
}
