// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BroadcastReceiver.java

package android.content;

import android.os.Bundle;

// Referenced classes of package android.content:
//			Context, Intent

public abstract class BroadcastReceiver
{

	public BroadcastReceiver()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void onReceive(Context context, Intent intent);

	public final void setResultCode(int code)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getResultCode()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setResultData(String data)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getResultData()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setResultExtras(Bundle extras)
	{
		throw new RuntimeException("Stub!");
	}

	public final Bundle getResultExtras(boolean makeMap)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setResult(int code, String data, Bundle extras)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean getAbortBroadcast()
	{
		throw new RuntimeException("Stub!");
	}

	public final void abortBroadcast()
	{
		throw new RuntimeException("Stub!");
	}

	public final void clearAbortBroadcast()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setOrderedHint(boolean isOrdered)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setDebugUnregister(boolean debug)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean getDebugUnregister()
	{
		throw new RuntimeException("Stub!");
	}
}
