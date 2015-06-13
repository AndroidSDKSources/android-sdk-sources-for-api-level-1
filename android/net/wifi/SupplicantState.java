// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SupplicantState.java

package android.net.wifi;

import android.os.Parcel;
import android.os.Parcelable;

public final class SupplicantState extends Enum
	implements Parcelable
{

	public static final SupplicantState ASSOCIATED;
	public static final SupplicantState ASSOCIATING;
	public static final SupplicantState COMPLETED;
	public static final SupplicantState DISCONNECTED;
	public static final SupplicantState DORMANT;
	public static final SupplicantState FOUR_WAY_HANDSHAKE;
	public static final SupplicantState GROUP_HANDSHAKE;
	public static final SupplicantState INACTIVE;
	public static final SupplicantState INVALID;
	public static final SupplicantState SCANNING;
	public static final SupplicantState UNINITIALIZED;
	private static final SupplicantState $VALUES[];

	public static final SupplicantState[] values()
	{
		return (SupplicantState[])$VALUES.clone();
	}

	public static SupplicantState valueOf(String name)
	{
		return (SupplicantState)Enum.valueOf(android/net/wifi/SupplicantState, name);
	}

	private SupplicantState(String s, int i)
	{
		super(s, i);
	}

	public static boolean isValidState(SupplicantState state)
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

	static 
	{
		ASSOCIATED = new SupplicantState("ASSOCIATED", 0);
		ASSOCIATING = new SupplicantState("ASSOCIATING", 1);
		COMPLETED = new SupplicantState("COMPLETED", 2);
		DISCONNECTED = new SupplicantState("DISCONNECTED", 3);
		DORMANT = new SupplicantState("DORMANT", 4);
		FOUR_WAY_HANDSHAKE = new SupplicantState("FOUR_WAY_HANDSHAKE", 5);
		GROUP_HANDSHAKE = new SupplicantState("GROUP_HANDSHAKE", 6);
		INACTIVE = new SupplicantState("INACTIVE", 7);
		INVALID = new SupplicantState("INVALID", 8);
		SCANNING = new SupplicantState("SCANNING", 9);
		UNINITIALIZED = new SupplicantState("UNINITIALIZED", 10);
		$VALUES = (new SupplicantState[] {
			ASSOCIATED, ASSOCIATING, COMPLETED, DISCONNECTED, DORMANT, FOUR_WAY_HANDSHAKE, GROUP_HANDSHAKE, INACTIVE, INVALID, SCANNING, 
			UNINITIALIZED
		});
	}
}
