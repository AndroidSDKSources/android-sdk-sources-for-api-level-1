// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PendingIntent.java

package android.app;

import android.content.Context;
import android.content.Intent;
import android.os.*;
import android.util.AndroidException;

public final class PendingIntent
	implements Parcelable
{
	public static interface OnFinished
	{

		public abstract void onSendFinished(PendingIntent pendingintent, Intent intent, int i, String s, Bundle bundle);
	}

	public static class CanceledException extends AndroidException
	{

		public CanceledException()
		{
			throw new RuntimeException("Stub!");
		}

		public CanceledException(String name)
		{
			throw new RuntimeException("Stub!");
		}

		public CanceledException(Exception cause)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public static final int FLAG_ONE_SHOT = 0x40000000;
	public static final int FLAG_NO_CREATE = 0x20000000;
	public static final int FLAG_CANCEL_CURRENT = 0x10000000;
	public static final android.os.Parcelable.Creator CREATOR = null;

	PendingIntent()
	{
		throw new RuntimeException("Stub!");
	}

	public static PendingIntent getActivity(Context context, int requestCode, Intent intent, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public static PendingIntent getBroadcast(Context context, int requestCode, Intent intent, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public static PendingIntent getService(Context context, int requestCode, Intent intent, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public void cancel()
	{
		throw new RuntimeException("Stub!");
	}

	public void send()
		throws CanceledException
	{
		throw new RuntimeException("Stub!");
	}

	public void send(int code)
		throws CanceledException
	{
		throw new RuntimeException("Stub!");
	}

	public void send(Context context, int code, Intent intent)
		throws CanceledException
	{
		throw new RuntimeException("Stub!");
	}

	public void send(int code, OnFinished onFinished, Handler handler)
		throws CanceledException
	{
		throw new RuntimeException("Stub!");
	}

	public void send(Context context, int code, Intent intent, OnFinished onFinished, Handler handler)
		throws CanceledException
	{
		throw new RuntimeException("Stub!");
	}

	public String getTargetPackage()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object otherObj)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel out, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public static void writePendingIntentOrNullToParcel(PendingIntent sender, Parcel out)
	{
		throw new RuntimeException("Stub!");
	}

	public static PendingIntent readPendingIntentOrNullFromParcel(Parcel in)
	{
		throw new RuntimeException("Stub!");
	}

}
