// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MockApplication.java

package android.test.mock;

import android.app.Application;
import android.content.res.Configuration;

public class MockApplication extends Application
{

	public MockApplication()
	{
		throw new RuntimeException("Stub!");
	}

	public void onCreate()
	{
		throw new RuntimeException("Stub!");
	}

	public void onTerminate()
	{
		throw new RuntimeException("Stub!");
	}

	public void onConfigurationChanged(Configuration newConfig)
	{
		throw new RuntimeException("Stub!");
	}
}
