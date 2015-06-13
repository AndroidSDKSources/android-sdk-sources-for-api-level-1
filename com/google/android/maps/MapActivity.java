// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MapActivity.java

package com.google.android.maps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public abstract class MapActivity extends Activity
{

	public MapActivity()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onCreate(Bundle icicle)
	{
		throw new RuntimeException("Stub!");
	}

	public void onNewIntent(Intent newIntent)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onResume()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onPause()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDestroy()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract boolean isRouteDisplayed();

	protected boolean isLocationDisplayed()
	{
		throw new RuntimeException("Stub!");
	}
}
