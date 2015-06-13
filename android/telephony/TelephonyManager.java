// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TelephonyManager.java

package android.telephony;


// Referenced classes of package android.telephony:
//			CellLocation, PhoneStateListener

public class TelephonyManager
{

	public static final int PHONE_TYPE_NONE = 0;
	public static final int PHONE_TYPE_GSM = 1;
	public static final int NETWORK_TYPE_UNKNOWN = 0;
	public static final int NETWORK_TYPE_GPRS = 1;
	public static final int NETWORK_TYPE_EDGE = 2;
	public static final int NETWORK_TYPE_UMTS = 3;
	public static final int SIM_STATE_UNKNOWN = 0;
	public static final int SIM_STATE_ABSENT = 1;
	public static final int SIM_STATE_PIN_REQUIRED = 2;
	public static final int SIM_STATE_PUK_REQUIRED = 3;
	public static final int SIM_STATE_NETWORK_LOCKED = 4;
	public static final int SIM_STATE_READY = 5;
	public static final int CALL_STATE_IDLE = 0;
	public static final int CALL_STATE_RINGING = 1;
	public static final int CALL_STATE_OFFHOOK = 2;
	public static final int DATA_ACTIVITY_NONE = 0;
	public static final int DATA_ACTIVITY_IN = 1;
	public static final int DATA_ACTIVITY_OUT = 2;
	public static final int DATA_ACTIVITY_INOUT = 3;
	public static final int DATA_DISCONNECTED = 0;
	public static final int DATA_CONNECTING = 1;
	public static final int DATA_CONNECTED = 2;
	public static final int DATA_SUSPENDED = 3;

	TelephonyManager()
	{
		throw new RuntimeException("Stub!");
	}

	public String getDeviceSoftwareVersion()
	{
		throw new RuntimeException("Stub!");
	}

	public String getDeviceId()
	{
		throw new RuntimeException("Stub!");
	}

	public CellLocation getCellLocation()
	{
		throw new RuntimeException("Stub!");
	}

	public int getPhoneType()
	{
		throw new RuntimeException("Stub!");
	}

	public String getNetworkOperatorName()
	{
		throw new RuntimeException("Stub!");
	}

	public String getNetworkOperator()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isNetworkRoaming()
	{
		throw new RuntimeException("Stub!");
	}

	public String getNetworkCountryIso()
	{
		throw new RuntimeException("Stub!");
	}

	public int getNetworkType()
	{
		throw new RuntimeException("Stub!");
	}

	public int getSimState()
	{
		throw new RuntimeException("Stub!");
	}

	public String getSimOperator()
	{
		throw new RuntimeException("Stub!");
	}

	public String getSimOperatorName()
	{
		throw new RuntimeException("Stub!");
	}

	public String getSimCountryIso()
	{
		throw new RuntimeException("Stub!");
	}

	public String getSimSerialNumber()
	{
		throw new RuntimeException("Stub!");
	}

	public String getSubscriberId()
	{
		throw new RuntimeException("Stub!");
	}

	public String getLine1Number()
	{
		throw new RuntimeException("Stub!");
	}

	public String getVoiceMailNumber()
	{
		throw new RuntimeException("Stub!");
	}

	public String getVoiceMailAlphaTag()
	{
		throw new RuntimeException("Stub!");
	}

	public int getCallState()
	{
		throw new RuntimeException("Stub!");
	}

	public int getDataActivity()
	{
		throw new RuntimeException("Stub!");
	}

	public int getDataState()
	{
		throw new RuntimeException("Stub!");
	}

	public void listen(PhoneStateListener listener, int events)
	{
		throw new RuntimeException("Stub!");
	}
}
