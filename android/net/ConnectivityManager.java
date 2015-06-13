// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConnectivityManager.java

package android.net;


// Referenced classes of package android.net:
//			NetworkInfo

public class ConnectivityManager
{

	public static final String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
	public static final String EXTRA_NETWORK_INFO = "networkInfo";
	public static final String EXTRA_IS_FAILOVER = "isFailover";
	public static final String EXTRA_OTHER_NETWORK_INFO = "otherNetwork";
	public static final String EXTRA_NO_CONNECTIVITY = "noConnectivity";
	public static final String EXTRA_REASON = "reason";
	public static final String EXTRA_EXTRA_INFO = "extraInfo";
	public static final int TYPE_MOBILE = 0;
	public static final int TYPE_WIFI = 1;
	public static final int DEFAULT_NETWORK_PREFERENCE = 1;

	ConnectivityManager()
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isNetworkTypeValid(int networkType)
	{
		throw new RuntimeException("Stub!");
	}

	public void setNetworkPreference(int preference)
	{
		throw new RuntimeException("Stub!");
	}

	public int getNetworkPreference()
	{
		throw new RuntimeException("Stub!");
	}

	public NetworkInfo getActiveNetworkInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public NetworkInfo getNetworkInfo(int networkType)
	{
		throw new RuntimeException("Stub!");
	}

	public NetworkInfo[] getAllNetworkInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public int startUsingNetworkFeature(int networkType, String feature)
	{
		throw new RuntimeException("Stub!");
	}

	public int stopUsingNetworkFeature(int networkType, String feature)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean requestRouteToHost(int networkType, int hostAddress)
	{
		throw new RuntimeException("Stub!");
	}
}
