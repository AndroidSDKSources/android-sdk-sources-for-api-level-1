// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LocalSocketAddress.java

package android.net;


public class LocalSocketAddress
{
	public static final class Namespace extends Enum
	{

		public static final Namespace ABSTRACT;
		public static final Namespace FILESYSTEM;
		public static final Namespace RESERVED;
		private static final Namespace $VALUES[];

		public static final Namespace[] values()
		{
			return (Namespace[])$VALUES.clone();
		}

		public static Namespace valueOf(String name)
		{
			return (Namespace)Enum.valueOf(android/net/LocalSocketAddress$Namespace, name);
		}

		static 
		{
			ABSTRACT = new Namespace("ABSTRACT", 0);
			FILESYSTEM = new Namespace("FILESYSTEM", 1);
			RESERVED = new Namespace("RESERVED", 2);
			$VALUES = (new Namespace[] {
				ABSTRACT, FILESYSTEM, RESERVED
			});
		}

		private Namespace(String s, int i)
		{
			super(s, i);
		}
	}


	public LocalSocketAddress(String name, Namespace namespace)
	{
		throw new RuntimeException("Stub!");
	}

	public LocalSocketAddress(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public Namespace getNamespace()
	{
		throw new RuntimeException("Stub!");
	}
}
