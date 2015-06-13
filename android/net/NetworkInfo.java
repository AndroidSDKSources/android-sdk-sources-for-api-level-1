// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   NetworkInfo.java

package android.net;

import android.os.Parcel;
import android.os.Parcelable;

public class NetworkInfo
	implements Parcelable
{
	public static final class DetailedState extends Enum
	{

		public static final DetailedState AUTHENTICATING;
		public static final DetailedState CONNECTED;
		public static final DetailedState CONNECTING;
		public static final DetailedState DISCONNECTED;
		public static final DetailedState DISCONNECTING;
		public static final DetailedState FAILED;
		public static final DetailedState IDLE;
		public static final DetailedState OBTAINING_IPADDR;
		public static final DetailedState SCANNING;
		public static final DetailedState SUSPENDED;
		private static final DetailedState $VALUES[];

		public static final DetailedState[] values()
		{
			return (DetailedState[])$VALUES.clone();
		}

		public static DetailedState valueOf(String name)
		{
			return (DetailedState)Enum.valueOf(android/net/NetworkInfo$DetailedState, name);
		}

		static 
		{
			AUTHENTICATING = new DetailedState("AUTHENTICATING", 0);
			CONNECTED = new DetailedState("CONNECTED", 1);
			CONNECTING = new DetailedState("CONNECTING", 2);
			DISCONNECTED = new DetailedState("DISCONNECTED", 3);
			DISCONNECTING = new DetailedState("DISCONNECTING", 4);
			FAILED = new DetailedState("FAILED", 5);
			IDLE = new DetailedState("IDLE", 6);
			OBTAINING_IPADDR = new DetailedState("OBTAINING_IPADDR", 7);
			SCANNING = new DetailedState("SCANNING", 8);
			SUSPENDED = new DetailedState("SUSPENDED", 9);
			$VALUES = (new DetailedState[] {
				AUTHENTICATING, CONNECTED, CONNECTING, DISCONNECTED, DISCONNECTING, FAILED, IDLE, OBTAINING_IPADDR, SCANNING, SUSPENDED
			});
		}

		private DetailedState(String s, int i)
		{
			super(s, i);
		}
	}

	public static final class State extends Enum
	{

		public static final State CONNECTED;
		public static final State CONNECTING;
		public static final State DISCONNECTED;
		public static final State DISCONNECTING;
		public static final State SUSPENDED;
		public static final State UNKNOWN;
		private static final State $VALUES[];

		public static final State[] values()
		{
			return (State[])$VALUES.clone();
		}

		public static State valueOf(String name)
		{
			return (State)Enum.valueOf(android/net/NetworkInfo$State, name);
		}

		static 
		{
			CONNECTED = new State("CONNECTED", 0);
			CONNECTING = new State("CONNECTING", 1);
			DISCONNECTED = new State("DISCONNECTED", 2);
			DISCONNECTING = new State("DISCONNECTING", 3);
			SUSPENDED = new State("SUSPENDED", 4);
			UNKNOWN = new State("UNKNOWN", 5);
			$VALUES = (new State[] {
				CONNECTED, CONNECTING, DISCONNECTED, DISCONNECTING, SUSPENDED, UNKNOWN
			});
		}

		private State(String s, int i)
		{
			super(s, i);
		}
	}


	public NetworkInfo(int type)
	{
		throw new RuntimeException("Stub!");
	}

	public int getType()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isConnectedOrConnecting()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isConnected()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAvailable()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isFailover()
	{
		throw new RuntimeException("Stub!");
	}

	public State getState()
	{
		throw new RuntimeException("Stub!");
	}

	public DetailedState getDetailedState()
	{
		throw new RuntimeException("Stub!");
	}

	public String getReason()
	{
		throw new RuntimeException("Stub!");
	}

	public String getExtraInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public String getTypeName()
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel dest, int flags)
	{
		throw new RuntimeException("Stub!");
	}
}
