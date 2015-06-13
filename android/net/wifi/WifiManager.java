// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WifiManager.java

package android.net.wifi;

import android.net.DhcpInfo;
import java.util.List;

// Referenced classes of package android.net.wifi:
//			WifiConfiguration, WifiInfo

public class WifiManager
{
	public class WifiLock
	{

		final WifiManager this$0;

		public void acquire()
		{
			throw new RuntimeException("Stub!");
		}

		public void release()
		{
			throw new RuntimeException("Stub!");
		}

		public void setReferenceCounted(boolean refCounted)
		{
			throw new RuntimeException("Stub!");
		}

		public boolean isHeld()
		{
			throw new RuntimeException("Stub!");
		}

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}

		protected void finalize()
			throws Throwable
		{
			throw new RuntimeException("Stub!");
		}

		WifiLock()
		{
			this$0 = WifiManager.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}


	public static final int ERROR_AUTHENTICATING = 1;
	public static final String WIFI_STATE_CHANGED_ACTION = "android.net.wifi.WIFI_STATE_CHANGED";
	public static final String EXTRA_WIFI_STATE = "wifi_state";
	public static final String EXTRA_PREVIOUS_WIFI_STATE = "previous_wifi_state";
	public static final int WIFI_STATE_DISABLING = 0;
	public static final int WIFI_STATE_DISABLED = 1;
	public static final int WIFI_STATE_ENABLING = 2;
	public static final int WIFI_STATE_ENABLED = 3;
	public static final int WIFI_STATE_UNKNOWN = 4;
	public static final String SUPPLICANT_CONNECTION_CHANGE_ACTION = "android.net.wifi.supplicant.CONNECTION_CHANGE";
	public static final String EXTRA_SUPPLICANT_CONNECTED = "connected";
	public static final String NETWORK_STATE_CHANGED_ACTION = "android.net.wifi.STATE_CHANGE";
	public static final String EXTRA_NETWORK_INFO = "networkInfo";
	public static final String EXTRA_BSSID = "bssid";
	public static final String SUPPLICANT_STATE_CHANGED_ACTION = "android.net.wifi.supplicant.STATE_CHANGE";
	public static final String EXTRA_NEW_STATE = "newState";
	public static final String EXTRA_SUPPLICANT_ERROR = "supplicantError";
	public static final String SCAN_RESULTS_AVAILABLE_ACTION = "android.net.wifi.SCAN_RESULTS";
	public static final String RSSI_CHANGED_ACTION = "android.net.wifi.RSSI_CHANGED";
	public static final String EXTRA_NEW_RSSI = "newRssi";
	public static final String NETWORK_IDS_CHANGED_ACTION = "android.net.wifi.NETWORK_IDS_CHANGED";
	public static final String ACTION_PICK_WIFI_NETWORK = "android.net.wifi.PICK_WIFI_NETWORK";

	WifiManager()
	{
		throw new RuntimeException("Stub!");
	}

	public List getConfiguredNetworks()
	{
		throw new RuntimeException("Stub!");
	}

	public int addNetwork(WifiConfiguration config)
	{
		throw new RuntimeException("Stub!");
	}

	public int updateNetwork(WifiConfiguration config)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean removeNetwork(int netId)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean enableNetwork(int netId, boolean disableOthers)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean disableNetwork(int netId)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean disconnect()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean reconnect()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean reassociate()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean pingSupplicant()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean startScan()
	{
		throw new RuntimeException("Stub!");
	}

	public WifiInfo getConnectionInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public List getScanResults()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean saveConfiguration()
	{
		throw new RuntimeException("Stub!");
	}

	public DhcpInfo getDhcpInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setWifiEnabled(boolean enabled)
	{
		throw new RuntimeException("Stub!");
	}

	public int getWifiState()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isWifiEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public static int calculateSignalLevel(int rssi, int numLevels)
	{
		throw new RuntimeException("Stub!");
	}

	public static int compareSignalLevel(int rssiA, int rssiB)
	{
		throw new RuntimeException("Stub!");
	}

	public WifiLock createWifiLock(String tag)
	{
		throw new RuntimeException("Stub!");
	}
}
