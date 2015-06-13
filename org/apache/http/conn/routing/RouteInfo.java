// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RouteInfo.java

package org.apache.http.conn.routing;

import java.net.InetAddress;
import org.apache.http.HttpHost;

public interface RouteInfo
{
	public static final class LayerType extends Enum
	{

		public static final LayerType LAYERED;
		public static final LayerType PLAIN;
		private static final LayerType $VALUES[];

		public static final LayerType[] values()
		{
			return (LayerType[])$VALUES.clone();
		}

		public static LayerType valueOf(String name)
		{
			return (LayerType)Enum.valueOf(org/apache/http/conn/routing/RouteInfo$LayerType, name);
		}

		static 
		{
			LAYERED = new LayerType("LAYERED", 0);
			PLAIN = new LayerType("PLAIN", 1);
			$VALUES = (new LayerType[] {
				LAYERED, PLAIN
			});
		}

		private LayerType(String s, int i)
		{
			super(s, i);
		}
	}

	public static final class TunnelType extends Enum
	{

		public static final TunnelType PLAIN;
		public static final TunnelType TUNNELLED;
		private static final TunnelType $VALUES[];

		public static final TunnelType[] values()
		{
			return (TunnelType[])$VALUES.clone();
		}

		public static TunnelType valueOf(String name)
		{
			return (TunnelType)Enum.valueOf(org/apache/http/conn/routing/RouteInfo$TunnelType, name);
		}

		static 
		{
			PLAIN = new TunnelType("PLAIN", 0);
			TUNNELLED = new TunnelType("TUNNELLED", 1);
			$VALUES = (new TunnelType[] {
				PLAIN, TUNNELLED
			});
		}

		private TunnelType(String s, int i)
		{
			super(s, i);
		}
	}


	public abstract HttpHost getTargetHost();

	public abstract InetAddress getLocalAddress();

	public abstract int getHopCount();

	public abstract HttpHost getHopTarget(int i);

	public abstract HttpHost getProxyHost();

	public abstract TunnelType getTunnelType();

	public abstract boolean isTunnelled();

	public abstract LayerType getLayerType();

	public abstract boolean isLayered();

	public abstract boolean isSecure();
}
