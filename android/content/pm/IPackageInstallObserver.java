// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IPackageInstallObserver.java

package android.content.pm;

import android.os.*;

public interface IPackageInstallObserver
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements IPackageInstallObserver
	{

		public static IPackageInstallObserver asInterface(IBinder obj)
		{
			throw new RuntimeException("Stub!");
		}

		public IBinder asBinder()
		{
			throw new RuntimeException("Stub!");
		}

		public boolean onTransact(int code, Parcel data, Parcel reply, int flags)
			throws RemoteException
		{
			throw new RuntimeException("Stub!");
		}

		public Stub()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public abstract void packageInstalled(String s, int i)
		throws RemoteException;
}
