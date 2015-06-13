// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SmsManager.java

package android.telephony.gsm;

import android.app.PendingIntent;
import java.util.ArrayList;

public final class SmsManager
{

	public static final int STATUS_ON_SIM_FREE = 0;
	public static final int STATUS_ON_SIM_READ = 1;
	public static final int STATUS_ON_SIM_UNREAD = 3;
	public static final int STATUS_ON_SIM_SENT = 5;
	public static final int STATUS_ON_SIM_UNSENT = 7;
	public static final int RESULT_ERROR_GENERIC_FAILURE = 1;
	public static final int RESULT_ERROR_RADIO_OFF = 2;
	public static final int RESULT_ERROR_NULL_PDU = 3;
	public static final int RESULT_ERROR_NO_SERVICE = 4;

	SmsManager()
	{
		throw new RuntimeException("Stub!");
	}

	public void sendTextMessage(String destinationAddress, String scAddress, String text, PendingIntent sentIntent, PendingIntent deliveryIntent)
	{
		throw new RuntimeException("Stub!");
	}

	public ArrayList divideMessage(String text)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendMultipartTextMessage(String destinationAddress, String scAddress, ArrayList parts, ArrayList sentIntents, ArrayList deliveryIntents)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendDataMessage(String destinationAddress, String scAddress, short destinationPort, byte data[], PendingIntent sentIntent, PendingIntent deliveryIntent)
	{
		throw new RuntimeException("Stub!");
	}

	public static SmsManager getDefault()
	{
		throw new RuntimeException("Stub!");
	}
}
