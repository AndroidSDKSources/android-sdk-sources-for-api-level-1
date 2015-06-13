// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InetAddress.java

package java.net;

import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package java.net:
//			UnknownHostException, NetworkInterface

public class InetAddress
	implements Serializable
{

	InetAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public static InetAddress[] getAllByName(String host)
		throws UnknownHostException
	{
		throw new RuntimeException("Stub!");
	}

	public static InetAddress getByName(String host)
		throws UnknownHostException
	{
		throw new RuntimeException("Stub!");
	}

	public String getHostAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public String getHostName()
	{
		throw new RuntimeException("Stub!");
	}

	public String getCanonicalHostName()
	{
		throw new RuntimeException("Stub!");
	}

	public static InetAddress getLocalHost()
		throws UnknownHostException
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isMulticastAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isLoopbackAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isLinkLocalAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isSiteLocalAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isMCGlobal()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isMCNodeLocal()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isMCLinkLocal()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isMCSiteLocal()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isMCOrgLocal()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAnyLocalAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isReachable(int timeout)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isReachable(NetworkInterface netif, int ttl, int timeout)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public static InetAddress getByAddress(byte ipAddress[])
		throws UnknownHostException
	{
		throw new RuntimeException("Stub!");
	}

	public static InetAddress getByAddress(String hostName, byte ipAddress[])
		throws UnknownHostException
	{
		throw new RuntimeException("Stub!");
	}
}
