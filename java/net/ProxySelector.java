// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ProxySelector.java

package java.net;

import java.io.IOException;
import java.util.List;

// Referenced classes of package java.net:
//			URI, SocketAddress

public abstract class ProxySelector
{

	public ProxySelector()
	{
		throw new RuntimeException("Stub!");
	}

	public static ProxySelector getDefault()
	{
		throw new RuntimeException("Stub!");
	}

	public static void setDefault(ProxySelector selector)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract List select(URI uri);

	public abstract void connectFailed(URI uri, SocketAddress socketaddress, IOException ioexception);
}
