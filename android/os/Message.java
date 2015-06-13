// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Message.java

package android.os;


// Referenced classes of package android.os:
//			Parcelable, Messenger, Handler, Bundle, 
//			Parcel

public final class Message
	implements Parcelable
{

	public int what;
	public int arg1;
	public int arg2;
	public Object obj;
	public Messenger replyTo;
	public static final Parcelable.Creator CREATOR = null;

	public Message()
	{
		throw new RuntimeException("Stub!");
	}

	public static Message obtain()
	{
		throw new RuntimeException("Stub!");
	}

	public static Message obtain(Message orig)
	{
		throw new RuntimeException("Stub!");
	}

	public static Message obtain(Handler h)
	{
		throw new RuntimeException("Stub!");
	}

	public static Message obtain(Handler h, Runnable callback)
	{
		throw new RuntimeException("Stub!");
	}

	public static Message obtain(Handler h, int what)
	{
		throw new RuntimeException("Stub!");
	}

	public static Message obtain(Handler h, int what, Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public static Message obtain(Handler h, int what, int arg1, int arg2)
	{
		throw new RuntimeException("Stub!");
	}

	public static Message obtain(Handler h, int what, int arg1, int arg2, Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public void recycle()
	{
		throw new RuntimeException("Stub!");
	}

	public void copyFrom(Message o)
	{
		throw new RuntimeException("Stub!");
	}

	public long getWhen()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTarget(Handler target)
	{
		throw new RuntimeException("Stub!");
	}

	public Handler getTarget()
	{
		throw new RuntimeException("Stub!");
	}

	public Runnable getCallback()
	{
		throw new RuntimeException("Stub!");
	}

	public Bundle getData()
	{
		throw new RuntimeException("Stub!");
	}

	public Bundle peekData()
	{
		throw new RuntimeException("Stub!");
	}

	public void setData(Bundle data)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendToTarget()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
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
