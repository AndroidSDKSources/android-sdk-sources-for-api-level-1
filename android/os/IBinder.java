// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IBinder.java

package android.os;


// Referenced classes of package android.os:
//			RemoteException, IInterface, Parcel

public interface IBinder
{
	public static interface DeathRecipient
	{

		public abstract void binderDied();
	}


	public static final int FIRST_CALL_TRANSACTION = 1;
	public static final int LAST_CALL_TRANSACTION = 0xffffff;
	public static final int PING_TRANSACTION = 0x5f504e47;
	public static final int DUMP_TRANSACTION = 0x5f444d50;
	public static final int INTERFACE_TRANSACTION = 0x5f4e5446;
	public static final int FLAG_ONEWAY = 1;

	public abstract String getInterfaceDescriptor()
		throws RemoteException;

	public abstract boolean pingBinder();

	public abstract boolean isBinderAlive();

	public abstract IInterface queryLocalInterface(String s);

	public abstract boolean transact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException;

	public abstract void linkToDeath(DeathRecipient deathrecipient, int i)
		throws RemoteException;

	public abstract boolean unlinkToDeath(DeathRecipient deathrecipient, int i);
}
