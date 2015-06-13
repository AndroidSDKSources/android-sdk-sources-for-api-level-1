// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Messenger.java

package android.os;


// Referenced classes of package android.os:
//			Parcelable, RemoteException, Handler, IBinder, 
//			Message, Parcel

public final class Messenger
	implements Parcelable
{

	public static final Parcelable.Creator CREATOR = null;

	public Messenger(Handler target)
	{
		throw new RuntimeException("Stub!");
	}

	public Messenger(IBinder target)
	{
		throw new RuntimeException("Stub!");
	}

	public void send(Message message)
		throws RemoteException
	{
		throw new RuntimeException("Stub!");
	}

	public IBinder getBinder()
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

	public static void writeMessengerOrNullToParcel(Messenger messenger, Parcel out)
	{
		throw new RuntimeException("Stub!");
	}

	public static Messenger readMessengerOrNullFromParcel(Parcel in)
	{
		throw new RuntimeException("Stub!");
	}

}
