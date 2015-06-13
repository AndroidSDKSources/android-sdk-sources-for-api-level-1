// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AlarmManager.java

package android.app;


// Referenced classes of package android.app:
//			PendingIntent

public class AlarmManager
{

	public static final int RTC_WAKEUP = 0;
	public static final int RTC = 1;
	public static final int ELAPSED_REALTIME_WAKEUP = 2;
	public static final int ELAPSED_REALTIME = 3;

	AlarmManager()
	{
		throw new RuntimeException("Stub!");
	}

	public void set(int type, long triggerAtTime, PendingIntent operation)
	{
		throw new RuntimeException("Stub!");
	}

	public void setRepeating(int type, long triggerAtTime, long interval, PendingIntent operation)
	{
		throw new RuntimeException("Stub!");
	}

	public void cancel(PendingIntent operation)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTimeZone(String timeZone)
	{
		throw new RuntimeException("Stub!");
	}
}
