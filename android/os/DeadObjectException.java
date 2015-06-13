// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DeadObjectException.java

package android.os;


// Referenced classes of package android.os:
//			RemoteException

public class DeadObjectException extends RemoteException
{

	public DeadObjectException()
	{
		throw new RuntimeException("Stub!");
	}
}
