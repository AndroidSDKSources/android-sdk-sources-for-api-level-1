// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SocketOptions.java

package java.net;


// Referenced classes of package java.net:
//			SocketException

public interface SocketOptions
{

	public static final int SO_LINGER = 128;
	public static final int SO_TIMEOUT = 4102;
	public static final int TCP_NODELAY = 1;
	public static final int IP_MULTICAST_IF = 16;
	public static final int SO_BINDADDR = 15;
	public static final int SO_REUSEADDR = 4;
	public static final int SO_SNDBUF = 4097;
	public static final int SO_RCVBUF = 4098;
	public static final int SO_KEEPALIVE = 8;
	public static final int IP_TOS = 3;
	public static final int IP_MULTICAST_LOOP = 18;
	public static final int SO_BROADCAST = 32;
	public static final int SO_OOBINLINE = 4099;
	public static final int IP_MULTICAST_IF2 = 31;

	public abstract Object getOption(int i)
		throws SocketException;

	public abstract void setOption(int i, Object obj)
		throws SocketException;
}
