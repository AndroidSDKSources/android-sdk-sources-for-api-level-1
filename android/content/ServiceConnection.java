// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ServiceConnection.java

package android.content;

import android.os.IBinder;

// Referenced classes of package android.content:
//			ComponentName

public interface ServiceConnection
{

	public abstract void onServiceConnected(ComponentName componentname, IBinder ibinder);

	public abstract void onServiceDisconnected(ComponentName componentname);
}
