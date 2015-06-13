// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Binder.java

package android.os;

import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.os:
//			IBinder, RemoteException, IInterface, Parcel

public class Binder
	implements IBinder
{

	public Binder()
	{
		throw new RuntimeException("Stub!");
	}

	public static final native int getCallingPid();

	public static final native int getCallingUid();

	public static final native long clearCallingIdentity();

	public static final native void restoreCallingIdentity(long l);

	public static final native void flushPendingCommands();

	public static final native void joinThreadPool();

	public void attachInterface(IInterface owner, String descriptor)
	{
		throw new RuntimeException("Stub!");
	}

	public String getInterfaceDescriptor()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean pingBinder()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isBinderAlive()
	{
		throw new RuntimeException("Stub!");
	}

	public IInterface queryLocalInterface(String descriptor)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean onTransact(int code, Parcel data, Parcel reply, int flags)
		throws RemoteException
	{
		throw new RuntimeException("Stub!");
	}

	protected void dump(FileDescriptor fd, PrintWriter fout, String args[])
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean transact(int code, Parcel data, Parcel reply, int flags)
		throws RemoteException
	{
		throw new RuntimeException("Stub!");
	}

	public void linkToDeath(IBinder.DeathRecipient recipient, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean unlinkToDeath(IBinder.DeathRecipient recipient, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}
}
