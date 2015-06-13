// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Proxy.java

package java.net;


// Referenced classes of package java.net:
//			SocketAddress

public class Proxy
{
	public static final class Type extends Enum
	{

		public static final Type DIRECT;
		public static final Type HTTP;
		public static final Type SOCKS;
		private static final Type $VALUES[];

		public static final Type[] values()
		{
			return (Type[])$VALUES.clone();
		}

		public static Type valueOf(String name)
		{
			return (Type)Enum.valueOf(java/net/Proxy$Type, name);
		}

		static 
		{
			DIRECT = new Type("DIRECT", 0);
			HTTP = new Type("HTTP", 1);
			SOCKS = new Type("SOCKS", 2);
			$VALUES = (new Type[] {
				DIRECT, HTTP, SOCKS
			});
		}

		private Type(String s, int i)
		{
			super(s, i);
		}
	}


	public static final Proxy NO_PROXY = null;

	public Proxy(Type type, SocketAddress sa)
	{
		throw new RuntimeException("Stub!");
	}

	public Type type()
	{
		throw new RuntimeException("Stub!");
	}

	public SocketAddress address()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public final int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

}
