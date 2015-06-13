// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ServiceTestCase.java

package android.test;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

// Referenced classes of package android.test:
//			AndroidTestCase

public abstract class ServiceTestCase extends AndroidTestCase
{

	public ServiceTestCase(Class serviceClass)
	{
		throw new RuntimeException("Stub!");
	}

	public Service getService()
	{
		throw new RuntimeException("Stub!");
	}

	protected void setUp()
		throws Exception
	{
		throw new RuntimeException("Stub!");
	}

	protected void setupService()
	{
		throw new RuntimeException("Stub!");
	}

	protected void startService(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	protected IBinder bindService(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	protected void shutdownService()
	{
		throw new RuntimeException("Stub!");
	}

	protected void tearDown()
		throws Exception
	{
		throw new RuntimeException("Stub!");
	}

	public void setApplication(Application application)
	{
		throw new RuntimeException("Stub!");
	}

	public Application getApplication()
	{
		throw new RuntimeException("Stub!");
	}

	public Context getSystemContext()
	{
		throw new RuntimeException("Stub!");
	}

	public void testServiceTestCaseSetUpProperly()
		throws Exception
	{
		throw new RuntimeException("Stub!");
	}
}
