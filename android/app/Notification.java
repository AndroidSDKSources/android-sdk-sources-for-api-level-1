// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Notification.java

package android.app;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

// Referenced classes of package android.app:
//			PendingIntent

public class Notification
	implements Parcelable
{

	public static final int DEFAULT_ALL = -1;
	public static final int DEFAULT_SOUND = 1;
	public static final int DEFAULT_VIBRATE = 2;
	public static final int DEFAULT_LIGHTS = 4;
	public long when;
	public int icon;
	public int number;
	public PendingIntent contentIntent;
	public PendingIntent deleteIntent;
	public CharSequence tickerText;
	public RemoteViews contentView;
	public int iconLevel;
	public Uri sound;
	public static final int STREAM_DEFAULT = -1;
	public int audioStreamType;
	public long vibrate[];
	public int ledARGB;
	public int ledOnMS;
	public int ledOffMS;
	public int defaults;
	public static final int FLAG_SHOW_LIGHTS = 1;
	public static final int FLAG_ONGOING_EVENT = 2;
	public static final int FLAG_INSISTENT = 4;
	public static final int FLAG_ONLY_ALERT_ONCE = 8;
	public static final int FLAG_AUTO_CANCEL = 16;
	public static final int FLAG_NO_CLEAR = 32;
	public int flags;
	public static final android.os.Parcelable.Creator CREATOR = null;

	public Notification()
	{
		vibrate = null;
		throw new RuntimeException("Stub!");
	}

	public Notification(int icon, CharSequence tickerText, long when)
	{
		vibrate = null;
		throw new RuntimeException("Stub!");
	}

	public Notification(Parcel parcel)
	{
		vibrate = null;
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel parcel, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public void setLatestEventInfo(Context context, CharSequence contentTitle, CharSequence contentText, PendingIntent contentIntent)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

}
