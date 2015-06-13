// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PhoneStateListener.java

package android.telephony;


// Referenced classes of package android.telephony:
//			ServiceState, CellLocation

public class PhoneStateListener
{

	public static final int LISTEN_NONE = 0;
	public static final int LISTEN_SERVICE_STATE = 1;
	public static final int LISTEN_SIGNAL_STRENGTH = 2;
	public static final int LISTEN_MESSAGE_WAITING_INDICATOR = 4;
	public static final int LISTEN_CALL_FORWARDING_INDICATOR = 8;
	public static final int LISTEN_CELL_LOCATION = 16;
	public static final int LISTEN_CALL_STATE = 32;
	public static final int LISTEN_DATA_CONNECTION_STATE = 64;
	public static final int LISTEN_DATA_ACTIVITY = 128;

	public PhoneStateListener()
	{
		throw new RuntimeException("Stub!");
	}

	public void onServiceStateChanged(ServiceState serviceState)
	{
		throw new RuntimeException("Stub!");
	}

	public void onSignalStrengthChanged(int asu)
	{
		throw new RuntimeException("Stub!");
	}

	public void onMessageWaitingIndicatorChanged(boolean mwi)
	{
		throw new RuntimeException("Stub!");
	}

	public void onCallForwardingIndicatorChanged(boolean cfi)
	{
		throw new RuntimeException("Stub!");
	}

	public void onCellLocationChanged(CellLocation location)
	{
		throw new RuntimeException("Stub!");
	}

	public void onCallStateChanged(int state, String incomingNumber)
	{
		throw new RuntimeException("Stub!");
	}

	public void onDataConnectionStateChanged(int state)
	{
		throw new RuntimeException("Stub!");
	}

	public void onDataActivity(int direction)
	{
		throw new RuntimeException("Stub!");
	}
}
